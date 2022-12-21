package com.kassiogo.sicofibackend.service;

import com.kassiogo.sicofibackend.model.Categoria;
import com.kassiogo.sicofibackend.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    CategoriaRepository repository;


    @Override
    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Categoria> findAll() {
        return repository.findAll();
    }
}
