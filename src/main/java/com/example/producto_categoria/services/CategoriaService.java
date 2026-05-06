package com.example.producto_categoria.services;

import com.example.producto_categoria.model.Categoria;
import com.example.producto_categoria.repository.CategoriaRepository;
import com.example.producto_categoria.repository.impl.CategoriaRepositoryImpl;
import org.jspecify.annotations.Nullable;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

public class CategoriaService {
    private final categoriaRepository = CategoriaRepositoryImpl categoriaRepository){

    }

    public @Nullable Object listar() {
        return null;
    }

    public void guardarCategoria(Categoria c) {
    if(c.getNombre()== null || c.getNombre() isEmpty();
    throw new IllegalArgumentException(("El nombre de la categoría no puede estar vacío"));
    }



    public @Nullable Object listarCategoria() {
    }

    public @Nullable Object listarCategorias() {
        return null;
    }


}
