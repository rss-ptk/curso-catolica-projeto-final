package com.example.classificados.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.classificados.entities"})
@EnableJpaRepositories(basePackages = {"com.example.classificados.repositories"})
@ComponentScan(basePackages = {"com.example.classificados.controllers"})

public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}