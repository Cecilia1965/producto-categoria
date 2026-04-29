package com.example.producto_categoria.repository;

import com.example.producto_categoria.model.Categoria;
import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.repository.impl.CategoriaRepositoryImpl;

import java.util.List;

public interface CategoriaRepository {
    private List<Categoria> categoria;
    private Long id;
    public CategoriaRepositoryImpl implements CategoriaRepository{

    }

    public List<Categoria> findAll();

    public Categoria findById(Long id);

    public Categoria save(Producto p);

    Categoria save(Categoria categorias);

    public void deleteById(Long id);
}


