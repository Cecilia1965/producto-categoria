package com.example.producto_categoria.repository.impl;

import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.repository.ProductoRepository;

import java.util.List;

public class ProductoRepositoryImpl implements ProductoRepository {
    @Override
    public List<Producto> findAll() {
        return List.of();
    }

    @Override
    public Producto findById(Long id) {
        return null;
    }

    @Override
    public Producto save(Producto p) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
