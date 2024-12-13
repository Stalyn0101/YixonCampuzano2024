/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.yixoncampuzano2024.Libro;

import ec.edu.espoch.yixoncampuzano2024.Genero;

/**
 *
 * @author USER
 */
public class Libro {
     private String titulo;
    private String autor;
    private double precio;
    private Genero genero;

    public Libro(String titulo, String autor, double precio, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

}



