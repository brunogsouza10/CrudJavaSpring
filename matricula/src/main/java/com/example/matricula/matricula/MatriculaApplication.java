package com.example.matricula.matricula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
public class MatriculaApplication {


	public static void main(String[] args) {
		SpringApplication.run(MatriculaApplication.class, args);
	}

}
