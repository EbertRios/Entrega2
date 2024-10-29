/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto.Models;

import com.mycompany.escuelaproyecto.Interfaces.Responsable;

/**
 *
 * @author user
 */
public class Administrativo extends Persona implements Responsable {
    private String cargo;

    public Administrativo(int id, String nombre, String apellido, String cargo) {
        super(id, nombre, apellido);
        this.cargo = cargo;
    }
    
     @Override
    public void mostrarInformacion() {
        System.out.println("Administrativo: " + nombre + " " + apellido + ", Cargo: " + cargo);
    }

    @Override
    public void gestionarPersonal() {
        // Lógica para gestionar el personal, usando el cargo para indicar el tipo de gestión
        System.out.println("El administrativo " + getNombre() + " está gestionando el personal con el cargo de " + cargo);
    }

    @Override
    public void gestionarInventario() {
        // Lógica para gestionar inventario, usando el cargo para diferenciar la acción
        System.out.println("El administrativo " + getNombre() + " está gestionando el inventario en el cargo de " + cargo);
    }
}