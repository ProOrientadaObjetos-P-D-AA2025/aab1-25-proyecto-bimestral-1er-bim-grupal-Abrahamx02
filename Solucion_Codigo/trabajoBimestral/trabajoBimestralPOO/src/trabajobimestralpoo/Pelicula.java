/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajobimestralpoo;
import java.util.List;
/**
 *
 * @author abrah
 */

public class Pelicula {
    String titulo;
    List<String> horarios;
    List<String> salas;

    public Pelicula(String titulo, String horario, String sala) {
        this.titulo = titulo;
        this.horarios = List.of(horario.split(" - "));
        this.salas = List.of(sala.split("\\|"));
    }

    @Override
    public String toString() {
        return titulo;
    }
}