/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.yixoncampuzano2024.Compra;

import ec.edu.espoch.yixoncampuzano2024.Cliente.Cliente;
import ec.edu.espoch.yixoncampuzano2024.Libro.Libro;



/**
 *
 * @author USER
 */
public class Compra {

    private static final double IVA = 0.12;
    

    public void mostrarDetalleLibro(Libro libro) {
        double libroConIVA = libro.getPrecio() + (libro.getPrecio() * IVA);
        System.out.println("El titulo del libro1 es:" + libro.getTitulo());
        System.out.println("El autor del libro1 es:" + libro.getAutor());
        System.out.println("El precio del libro1 sin IVA es:" + libro.getPrecio());
        System.out.println("El precio del libro1 con IVA es" + libroConIVA);

    }

    public void mostrarClientesYProducto(Cliente cliente, Libro libro) {
        double libroConIVA = libro.getPrecio()+(libro.getPrecio()*IVA);
        System.out.println("El nombre del cliente es:"+cliente.getNombre());
        System.out.println("El nombre del titulo comprado es:"+libro.getTitulo());
        System.out.println("El genero del libro es :"+libro.getGenero());
        System.out.println("El precio del libro sin iva es :"+libro.getPrecio());
        System.out.println("El precio del libro con iva es:"+libroConIVA);

    }

}

    
