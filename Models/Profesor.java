/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto.Models;

import com.mycompany.escuelaproyecto.Interfaces.ParticipanteEvento;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona implements ParticipanteEvento {
    private String especialidad;
    private List<Asignatura> asignaturas; // Lista de asignaturas que el profesor enseña

    public Profesor(int id, String nombre, String apellido, String especialidad) {
        super(id, nombre, apellido);
        this.especialidad = especialidad;
        this.asignaturas = new ArrayList<>(); // Inicialización de la lista
    }

    // Métodos get y set para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para agregar una asignatura
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    // Método para obtener la lista de asignaturas
    public List<Asignatura> obtenerAsignaturas() {
        return asignaturas;
    }

    @Override
    public void participarEnEvento(Evento evento) {
        System.out.println("El profesor " + getNombre() + " esta participando en el evento: " + evento.getNombre());
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + getNombre() + " " + getApellido() + ", Especialidad: " + especialidad);
    }

    // Métodos setNombre, setApellido para compatibilidad con PATCH
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

}
