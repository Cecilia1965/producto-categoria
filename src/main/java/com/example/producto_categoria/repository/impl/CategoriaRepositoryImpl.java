package com.example.producto_categoria.repository.impl;

import com.example.producto_categoria.model.Categoria;
import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.repository.Categoriarepository;

import java.util.List;

public class CategoriaRepositoryImpl implements Categoriarepository {
    @Override
    public List<Categoria> findAll() {
        return List.of();
    }

    @Override
    public Categoria findById(Long id) {
        return null;
    }

    @Override
    public Categoria save(Producto p) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

}
