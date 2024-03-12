package com.example.crud.primeiroCrud.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name="matricula")
@Entity(name="matricula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Matricula {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Integer age;
    private String  gender;
    private String city;

    public Matricula(RequestMatricula requestMatricula){
        this.name = requestMatricula.name();
        this.age = requestMatricula.age();
        this.gender = requestMatricula.gender();
        this.city = requestMatricula.city();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
