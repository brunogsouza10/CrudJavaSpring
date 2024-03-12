package com.example.crud.primeiroCrud.controller;

import com.example.crud.primeiroCrud.domain.Matricula;
import com.example.crud.primeiroCrud.domain.MatriculaRepository;
import com.example.crud.primeiroCrud.domain.RequestMatricula;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
    @Autowired
    private MatriculaRepository repository;
    @GetMapping
    public ResponseEntity getAllMatriculas(){
        List<Matricula> allMatriculas = repository.findAll();
        return ResponseEntity.ok(allMatriculas);
    }
    @PostMapping
    public ResponseEntity registerMatricula(@RequestBody @Valid RequestMatricula data){
      Matricula newMatricula = new Matricula(data);
      repository.save(newMatricula);
      return ResponseEntity.ok().build();
    }
    @PutMapping
    @Transactional
    public ResponseEntity updateMatricula(@RequestBody @Valid RequestMatricula data) {
        Optional<Matricula> optionalMatricula = repository.findById(data.id());
        if (optionalMatricula.isPresent()) {
            Matricula matricula = optionalMatricula.get();
            matricula.setName(data.name());
            matricula.setAge(data.age());
            matricula.setGender(data.gender());
            matricula.setCity(data.city());
            return ResponseEntity.ok(matricula);
        } else {
            throw new EntityNotFoundException();
        }
    }
        @DeleteMapping("/{id}")
        @Transactional
        public ResponseEntity deleteMatricula(@PathVariable String id){
        Optional<Matricula>optionalMatricula = repository.findById(id);
        if (optionalMatricula.isPresent()){
            Matricula matricula = optionalMatricula.get();
            repository.delete(matricula);
            return ResponseEntity.noContent().build();
        } else{
            throw new EntityNotFoundException();
        }
        }
    }

