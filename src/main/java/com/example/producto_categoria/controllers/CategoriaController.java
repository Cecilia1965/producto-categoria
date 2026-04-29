package com.example.producto_categoria.controllers;
import com.example.producto_categoria.model.Categoria;
import com.example.producto_categoria.services.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoriaController {

    private final  CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }


    @GetMapping("/categorias")
    public String listar(Model model){
        model.addAttribute("categorias", categoriaService.listarCategorias());
        return "categorias";
    }

    @PostMapping("/categorias")
    public String guardar(Categoria categoria){
        categoriaService.guardarCategoria(categoria);
        return "redirect:/categorias";
    }
}