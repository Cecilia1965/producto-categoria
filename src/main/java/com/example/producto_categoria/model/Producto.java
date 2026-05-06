package com.example.producto_categoria.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import org.springframework.data.annotation.
@Entity
@Table(name ="productos")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name ="nombre_producto", nullable = false, length = 200)
    private String nombre;
    @Column(name = "precio", nullable = true)
    private Double precio;
    @Column(name ="descripcion",nullable = false, length = 500)
    private String descripcion;
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name ="categoria_id")
    @Transient // No detecta el campo como columna
    private int contador;

    public Producto(long id, String nombre, Double precio, String descripcion, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
