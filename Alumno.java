/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

import com.mycompany.escuelaproyecto.Calificacion;
import com.mycompany.escuelaproyecto.Interfaces.ParticipanteEvento;
import com.mycompany.escuelaproyecto.Models.Evento;
import com.mycompany.escuelaproyecto.Models.Persona;
import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona implements ParticipanteEvento {
    private int edad;
    private List<Calificacion> calificaciones; // Lista de calificaciones del alumno

    public Alumno(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido);
        this.edad = edad;
        this.calificaciones = new ArrayList<>(); // Inicialización de la lista
    }

    // Método para agregar una calificación a la lista de calificaciones
    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }

    // Método para obtener la lista de calificaciones
    public List<Calificacion> obtenerCalificaciones() {
        return calificaciones;
    }

    // Método para mostrar las calificaciones del alumno
    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + getNombre() + ":");
        for (Calificacion calificacion : calificaciones) {
            System.out.println("- " + calificacion.getNota());
        }
    }

    @Override
    public void participarEnEvento(Evento evento) {
        System.out.println("El alumno " + getNombre() + " esta participando en el evento: " + evento.getNombre());
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Alumno: " + getNombre() + " " + getApellido() + ", Edad: " + edad);
    }
    
    public void setNombre(String nombre) {
        super.nombre = nombre;
    }

    public void setApellido(String apellido) {
        super.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
