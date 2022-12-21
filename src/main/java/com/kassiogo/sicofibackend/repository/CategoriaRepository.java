package com.kassiogo.sicofibackend.repository;

import com.kassiogo.sicofibackend.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}