package com.example.classificados.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.classificados.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
    List<Categoria> findAll();

    @Query("select c from Categoria c where c.categoriaPai is null")
    List<Categoria> findCategoriaPaiAll();

    @Query("select c from Categoria c where c.categoriaPai is not null")
    List<Categoria> findCategoriasFilhoAll();

    @Query("select c from Categoria c where c.categoriaPai.id = ?1")
    List<Categoria> findByCategoriaPai_Id(long id);

}
