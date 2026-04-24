package com.example.producto_categoria.controller;


import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.services.ProductoService;
import com.example.producto_categoria.services.ProductoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ProductoController {
    public  ProductoService productoService;

    public ProductoController(ProductoService productoService){
        ProductoService categoriaService;

            this.productoService = productoService;
        }

        @GetMapping("/categorias")
        public String listar(Model model){
            ProductoService productoService = null;
            model.addAttribute("productos", productoService.listar());
            return "productos";
        }

        @PostMapping("/productos")
        public String guardar(Producto producto){
            productoService.guardarProducto(productoService);
            return "redirect:/productos";
        }
    }







