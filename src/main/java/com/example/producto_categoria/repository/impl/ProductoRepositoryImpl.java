/**package com.example.producto_categoria.repository.impl;

import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.repository.ProductoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class ProductoRepositoryImpl implements ProductoRepository {
    private final List<Producto> productoS = new ArrayList<>();
    private Long id;
    public ProductoRepositoryImpl;

    @Override
    public List<Producto> findAll() {
        return Producto;
    }

    @Override
    public Optional findById(Long id) {
        for (Producto producto : productoS){
          if (id.equals())
        };
    }

    @Override
    public Producto save(Producto p) {
        p.setId(id++);
        if(p.getNombre() == null|| p.getNombre().isEmpty(){
            throw new IllegalArgumentException(("El nombre producto no puede estar vacío");
        }else if(p.getCategoria() == null){
            throw new IllegalArgumentException("La categoría no puede estar vacía");
        }
    }

    @Override
    public void deleteById(Long id) {
        for

    }
}
 **/
