/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto.services;

import com.mycompany.escuelaproyecto.Alumno;
import com.mycompany.escuelaproyecto.Models.Evento;
import com.mycompany.escuelaproyecto.Models.Profesor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EscuelaService {
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    private List<Evento> eventos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Alumno> obtenerAlumnos() {
        return alumnos;
    }

    // Agrega métodos para obtener profesores y eventos si es necesario.
}
