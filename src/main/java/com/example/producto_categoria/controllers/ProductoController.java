package com.example.producto_categoria.controllers;


import com.example.producto_categoria.model.Categoria;
import com.example.producto_categoria.model.Producto;
import com.example.producto_categoria.services.CategoriaService;
import com.example.producto_categoria.services.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@Controller
@RequestMapping ("productos");

public class ProductoController {
    private final ProductoService productoService;
    private final CategoriaService categoriaService;

    public ProductoController(ProductoService productoService, CategoriaService categoriaService){

        this.productoService = productoService;
        this.categoriaService = categoriaService;
        }

        @GetMapping("/categorias")
        public String listar(Model model){
            ProductoService productoService = null;
            model.addAttribute("productos", productoService.listarProductos());
            model.addAttribute("categorias", categoriaService.listarCategoria());
            return "productos";
        }

        @PostMapping("/productos")
        public String guardar(@ModelAttribute Producto){
            Optional<Categoria>categoria = categoriaService.obtenerPorId(producto.getCategoria().getId);
            if(categoria )
            return "redirect:/productos";
        }
        @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){

        }
    }







