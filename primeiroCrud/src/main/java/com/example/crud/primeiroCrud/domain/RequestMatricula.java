package com.example.crud.primeiroCrud.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestMatricula(
    String id,
    @NotBlank
    String name,
    @NotNull
    Integer age,
    @NotNull
    String gender,
    @NotBlank
    String city
){

}
