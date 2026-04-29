package com.example.producto_categoria.repository.impl;

import com.example.producto_categoria.model.Categoria;
import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.repository.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class CategoriaRepositoryImpl implements CategoriaRepository {
    private final List<Categoria> categorias = new ArrayList<>();
    private Long id;

    @Override
    public List<Categoria> findAll() {
        return categorias;
    }

    @Override
    public Categoria findById(Long id) {
        return categorias;
    }

    @Override
    public Categoria save(Producto p) {
        return null;
    }

    @Override
    public Categoria save(Categoria categorias) {
       categorias.setId(id++);
       if(categorias.getNombre() == null || categorias.getNombre().isEmpty()){
           throw new IllegalArgumentException("La categoria no puede estar vacía");
        }if else{

        }
    }

    @Override
    public void deleteById(Long id) {
        categorias.removeIf((c -> c.getId().equals(id));

    }

}
