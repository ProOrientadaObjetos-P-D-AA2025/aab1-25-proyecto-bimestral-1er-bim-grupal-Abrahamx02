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
        List<String> snacksComprados;
        double total;

        public Venta(String pelicula, String horario, String sala, int boletos, List<String> snacksComprados, double total) {
            this.pelicula = pelicula;
            this.horario = horario;
            this.sala = sala;
            this.boletos = boletos;
            this.snacksComprados = snacksComprados;
            this.total = total;
        }

        @Override
        public String toString() {
            String info = "Película: " + pelicula + "\n"
                    + "Horario: " + horario + " | Sala: " + sala + "\n"
                    + "Boletos: " + boletos + "\n"
                    + "Snacks:\n";
            if (snacksComprados.size() == 0) {
                info += "  Ninguno\n";
            } else {
                for (int i = 0; i < snacksComprados.size(); i++) {
                    info += "  " + snacksComprados.get(i) + "\n";
                }
            }
            info += "Total pagado: $" + String.format("%.2f", total);
            return info;
        }
    }

    static List<Venta> ventas = new ArrayList<>();

    public static void registrarVenta(String pelicula, String horario, String sala, int boletos, List<String> snacksComprados, double total) {
        ventas.add(new Venta(pelicula, horario, sala, boletos, snacksComprados, total));
        System.out.println("\n--- Venta registrada ---");
        System.out.println(ventas.get(ventas.size() - 1));
        System.out.println("------------------------\n");
    }

    public static void mostrarVentas() {
        System.out.println("Resumen de Ventas:");
        if (ventas.size() == 0) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (Venta venta : ventas) {
                System.out.println(venta);
                System.out.println("------------------------");
            }
        }
    }

}
