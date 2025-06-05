/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajobimestralpoo;

/**
 *
 * @author abrah
 */

public class Pelicula {
    String titulo;
    String horario;
    String salas;

    // Constructor
    public Pelicula(String titulo, String director, String duracion) {
        this.titulo = titulo;
        this.horario = director;
        this.salas = duracion;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n%s",titulo,horario,salas);
    }
}