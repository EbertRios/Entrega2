/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

import com.mycompany.escuelaproyecto.Models.Profesor;
import com.mycompany.escuelaproyecto.Models.Evento;


public class Escuela {
    private int id;
    private String nombre;
    private String direccion;
    
    public Escuela(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarAlumno(Alumno alumno) {
        // Lógica para agregar un alumno a la escuela
        System.out.println("Agregando al alumno " + alumno.getNombre() + " a la escuela " + nombre);
    }

    public void agregarProfesor(Profesor profesor) {
        // Lógica para agregar un profesor a la escuela
        System.out.println("Agregando al profesor " + profesor.getNombre() + " a la escuela " + nombre);
    }

    public void agregarEvento(Evento evento) {
        // Lógica para agregar un evento a la escuela
        System.out.println("Agregando el evento " + evento.getNombre() + " a la escuela " + nombre);
    }
}
