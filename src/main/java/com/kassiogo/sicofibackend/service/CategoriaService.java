package com.kassiogo.sicofibackend.service;

import com.kassiogo.sicofibackend.model.Categoria;

import java.util.List;

public interface CategoriaService {
    public Categoria save(Categoria categoria);

    public void deleteById(long id);

    public List<Categoria> findAll();
}
