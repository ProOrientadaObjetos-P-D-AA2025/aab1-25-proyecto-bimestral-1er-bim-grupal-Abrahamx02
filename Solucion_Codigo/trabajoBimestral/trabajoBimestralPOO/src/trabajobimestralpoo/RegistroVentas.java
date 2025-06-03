/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajobimestralpoo;

import java.util.ArrayList;
import java.util.List;

public class RegistroVentas {

    static class Venta {

        String pelicula;
        String horario;
        String sala;
        int boletos;
        List<String> snacks;
        double total;

        public Venta(String pelicula, String horario, String sala, int boletos, List<String> snacks, double total) {
            this.pelicula = pelicula;
            this.horario = horario;
            this.sala = sala;
            this.boletos = boletos;
            this.snacks = snacks;
            this.total = total;
        }

        @Override
        public String toString() {
            return """
                   ------------------------------
                   Película: %s
                   Horario: %s
                   Sala: %s
                   Boletos vendidos: %d
                   Snacks: %s
                   Total pagado: $%.2f
                   ------------------------------
                   """.formatted(pelicula, horario, sala, boletos, String.join(", ", snacks), total);
        }
    }

    private static final List<Venta> ventas = new ArrayList<>();

    public static void registrarVenta(String pelicula, String horario, String sala, int boletos, List<String> snacks, double total) {
        ventas.add(new Venta(pelicula, horario, sala, boletos, snacks, total));
    }

    public static void mostrarVentas() {
        if (ventas.isEmpty()) {
            System.out.println("No se han registrado ventas.");
        } else {
            System.out.println("===== REGISTRO DE VENTAS =====");
            for (Venta v : ventas) {
                System.out.println(v);
            }
        }
    }

}
