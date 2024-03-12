package com.example.crud.primeiroCrud.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


    public interface MatriculaRepository extends JpaRepository<Matricula, String>{
    List<Matricula> findAll();
}
