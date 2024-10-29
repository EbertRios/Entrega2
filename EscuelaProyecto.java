/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaproyecto;

import com.mycompany.escuelaproyecto.Models.Asignatura;
import com.mycompany.escuelaproyecto.Models.Profesor;
import com.mycompany.escuelaproyecto.Models.Evento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscuelaProyecto {
    public static void main(String[] args) {
        SpringApplication.run(EscuelaProyecto.class, args); 
        
        // Crear instancias de las clases
        Escuela escuela = new Escuela(1, "Escuela ABC", "Calle Falsa 123");
        Alumno alumno1 = new Alumno(1, "Juan", "Perez", 16);
        Alumno alumno2 = new Alumno(2, "Maria", "Gomez", 17);
        Profesor profesor1 = new Profesor(1, "Carlos", "Ramirez", "Matematicas");

        // Ajustar el constructor de Evento con los parámetros correctos
        Evento evento = new Evento(1, "Dia de la Ciencia", "2024-10-25", "Exposicion de proyectos cientificos");

        // Agregar alumnos y profesor a la escuela
        escuela.agregarAlumno(alumno1);
        escuela.agregarAlumno(alumno2);
        escuela.agregarProfesor(profesor1);

        // Agregar evento a la escuela
        escuela.agregarEvento(evento);

        // Ejemplo de polimorfismo: Profesor participando en evento
        profesor1.participarEnEvento(evento);

        // Ejemplo de uso de una asignatura y calificaciones
        Asignatura matematicas = new Asignatura(1, "Matematicas");
        Calificacion calif1 = new Calificacion(1, 85);

        // Agregar asignatura al profesor
        profesor1.agregarAsignatura(matematicas);

        // Agregar alumnos y calificaciones a la asignatura
        matematicas.agregarProfesor(profesor1);
        matematicas.agregarAlumno(alumno1);
        alumno1.agregarCalificacion(calif1);

        // Mostrar la lista de asignaturas del profesor
        profesor1.mostrarInformacion();

        // Mostrar la lista de calificaciones del alumno
        alumno1.mostrarCalificaciones();

        // Mostrar información del profesor
        profesor1.mostrarInformacion();

        // Mostrar información de los alumnos
        alumno1.mostrarInformacion();
        alumno2.mostrarInformacion();
    }
}