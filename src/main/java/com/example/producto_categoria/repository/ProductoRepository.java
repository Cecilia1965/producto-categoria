package com.example.producto_categoria.repository;

import com.example.producto_categoria.model.Producto;

import java.util.List;

public interface ProductoRepository {
    List<Producto> findAll();

    Producto findById(Long id);

    Producto save(Producto p);

    void deleteById(Long id);
}

