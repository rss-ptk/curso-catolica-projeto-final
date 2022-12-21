package com.example.classificados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.classificados.entities.Midia;

public interface MidiaRepository extends JpaRepository<Midia, Long> {
    
}
