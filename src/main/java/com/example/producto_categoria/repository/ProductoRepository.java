package com.example.producto_categoria.repository;

import com.example.producto_categoria.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto>, Long{
    public List<Producto> findAll();

    public Optional <Producto> findById(Long id);

    public Producto save(Producto p);

    public void deleteById(Long id);
}

