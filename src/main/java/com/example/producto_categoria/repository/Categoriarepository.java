package com.example.producto_categoria.repository;

import com.example.producto_categoria.model.Categoria;
import com.example.producto_categoria.model.Producto;

import java.util.List;

public interface Categoriarepository {
    List<Categoria> findAll();

    Categoria findById(Long id);

    Categoria save(Producto p);

    void deleteById(Long id);
}

