package com.example.producto_categoria.controllers;

import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.services.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("productos_actualizar")
public class ProductoActualizarController {

    private ProductoActualizarController(ProductoService productoService){
        this.productoService = ProductoService
    }
}

@GetMapping("/rellenar/{id}")
public String rellenar(@PathVariable Long id, Model model) {
    Producto producto = productoService.obtenerPorId(id).get();
    model.addAttribute("producto", producto);
    model.addAttribute("categorias", categoriaService);
    return "productos_actualizar";
}
    @PostMapping
    public String guardar (Producto producto){
        productoService.guardarProducto(producto);
        return "redirect/productos";
    }
}
