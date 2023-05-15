package com.example.atvspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtvSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtvSpringBootApplication.class, args);
        System.out.println("Servidor rodando!");
    }

}
