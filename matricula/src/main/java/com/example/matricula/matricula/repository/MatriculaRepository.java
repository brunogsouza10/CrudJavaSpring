package com.example.matricula.matricula.repository;

import com.example.matricula.matricula.dto.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
