package com.example.classificados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.classificados.entities.Categoria;
import com.example.classificados.repositories.CategoriaRepository;

@RestController
@RequestMapping(value = "categorias")
public class CategoriaController {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping(value = "/")
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

}
