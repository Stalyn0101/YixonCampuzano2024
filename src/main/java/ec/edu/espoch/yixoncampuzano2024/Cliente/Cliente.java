/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.yixoncampuzano2024.Cliente;

/**
 *
 * @author USER
 */
public class Cliente {

    private String nombre;
    private int cedula;

    public Cliente(String nombre, int cedula) {

        this.nombre = nombre;
        this.cedula = cedula;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

}
