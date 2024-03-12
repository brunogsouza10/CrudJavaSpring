package com.example.matricula.matricula.controller;

import com.example.matricula.matricula.dto.Matricula;
import com.example.matricula.matricula.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @GetMapping("/{id}")
    public ResponseEntity<List<Matricula>> getAllMatriculas() {
        List<Matricula> matricula = matriculaRepository.findAll();
        return ResponseEntity.ok(matricula);
    }

    public ResponseEntity<Matricula> getMatriculaById(@PathVariable Long id){
        Matricula matricula = matriculaRepository.findById(id).orElse(null);
    return null;
    }

}
