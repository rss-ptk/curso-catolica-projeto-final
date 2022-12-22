package com.example.classificados.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.classificados.entities.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
    
    List<Anuncio> findByCategoria(long categoriaId);    
    
    List<Anuncio> findByTituloContainingIgnoreCase(String termo);
    
    @Query("select i from Anuncio i where i.destaque = 1")
    List<Anuncio> findAllDestaques();

}
