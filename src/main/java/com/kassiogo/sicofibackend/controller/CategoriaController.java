package com.kassiogo.sicofibackend.controller;

import com.kassiogo.sicofibackend.model.Categoria;
import com.kassiogo.sicofibackend.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @PostMapping()
    public Categoria save(Categoria categoria) {
        return service.save(categoria);
    }

    @GetMapping("/all")
    public List<Categoria> findAll() {
        return service.findAll();
    }
}
