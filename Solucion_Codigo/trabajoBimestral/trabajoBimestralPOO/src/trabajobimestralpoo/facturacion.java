package trabajobimestralpoo;

import java.util.Scanner;

public class facturacion {

    static Scanner facturacion = new Scanner(System.in);

    public static void facturar(Pelicula peli, String dia) {
        System.out.println("Horarios disponibles:");
        for (int i = 0; i < peli.horarios.size(); i++) {
            System.out.printf("(%d) %s | Sala: %s\n", i + 1, peli.horarios.get(i), peli.salas.get(i));
        }

        System.out.println("Seleccione el horario deseado:");
        int op = facturacion.nextInt();
        facturacion.nextLine();

        if (op >= 1 && op <= peli.horarios.size()) {
            String horario = peli.horarios.get(op - 1);
            String sala = peli.salas.get(op - 1);
            procesarVenta(peli.titulo, horario, sala, dia);
        } else {
            System.out.println("Opción de horario inválida.");
        }
    } 
        
        

    private static void procesarVenta(String pelicula, String horario, String sala, String dia) {
        double precioBoleto;

        if (dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("jueves")) {
            precioBoleto = 3.75;
        } else {
            precioBoleto = 7.50;
        }
        System.out.println("Precio del boleto: $" + precioBoleto);
        System.out.println("Ingrese la cantidad de boletos a comprar");
        int boletos = facturacion.nextInt();
        facturacion.nextLine();
        double totalBoletos = boletos * precioBoleto;
        System.out.println("Usted tiene que pagar el monto de: $" + totalBoletos);

        snacks.ResultadoSnacks resultadoSnacks = snacks.venta();

        double totalVenta = totalBoletos + resultadoSnacks.totalSnacks;
        System.out.println("Monto total de la compra (boletos + snacks): $" + totalVenta);

        RegistroVentas.registrarVenta(pelicula, horario, sala, boletos, resultadoSnacks.snacksComprados, totalVenta);
    }
}
