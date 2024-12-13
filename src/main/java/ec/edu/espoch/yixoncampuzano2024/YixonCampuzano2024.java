/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.yixoncampuzano2024;

import ec.edu.espoch.yixoncampuzano2024.Cliente.Cliente;
import ec.edu.espoch.yixoncampuzano2024.Compra.Compra;
import ec.edu.espoch.yixoncampuzano2024.Libro.Libro;

public class YixonCampuzano2024 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Yixon Stalyn",1206988014);
        Libro libro1 = new Libro("El Primcipito","Antonie de Saint",25.50,Genero.EDUCATIVO);
        
        Compra compra = new Compra();
        compra.mostrarDetalleLibro(libro1);
        
        compra.mostrarClientesYProducto(cliente,libro1);


    }
}
