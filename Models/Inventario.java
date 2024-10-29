/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto.Models;


class Inventario {
    private int id;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private String ubicacion;

    public Inventario(int id, String nombre, String descripcion, int cantidad, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
    }

    public void agregarItem(Item item) {
        // Metodo para agregar un ítem al inventario
        System.out.println("Agregando el ítem " + item.getNombre() + " al inventario " + nombre);
    }

    public void eliminarItem(Item item) {
        // Metodo para eliminar un ítem del inventario
        System.out.println("Eliminando el ítem " + item.getNombre() + " del inventario " + nombre);
    }
}
