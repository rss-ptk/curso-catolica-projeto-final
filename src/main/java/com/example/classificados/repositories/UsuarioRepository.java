package com.example.classificados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.classificados.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
