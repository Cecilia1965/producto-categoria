package com.example.producto_categoria.services;

import com.example.producto_categoria.model.Categoria;
import com.example.producto_categoria.repository.impl.CategoriaRepositoryImpl;
import org.jspecify.annotations.Nullable;

public class CategoriaService {
    public CategoriaService(CategoriaRepositoryImpl categoriaRepository){

    }

    public @Nullable Object listar() {
        return null;
    }

    public void guardarCategoria(Categoria categoria) {
    }
}
