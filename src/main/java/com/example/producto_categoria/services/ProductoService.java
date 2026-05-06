package com.example.producto_categoria.services;


import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.repository.ProductoRepository;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

public class ProductoService {
    private final ProductoRepository productoRepository;


    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
    public Optional<Producto> obtenerPorId(Long Id){
        return productoRepository.findById(Id);
    }

    public void guardarProducto(Producto p) {
        if(p.getNombre()== null || p.getNombre())isEmpty();
        throw new IllegalArgumentException(("El npmbre del producto no puede estar vacío"));
    }if else{

    }
    public void actualizarProducto(Producto p){
        // TODO falta el método update en el repositorio
    }
    public void eliminarProducto(Long id){
     public void eliminar(Long id)
    }
}