package com.example.matricula.matricula.dto;

import jakarta.persistence.*;

@Entity
@Table(name ="matricula")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String alunoNome;
    private String cursoNome;


}
