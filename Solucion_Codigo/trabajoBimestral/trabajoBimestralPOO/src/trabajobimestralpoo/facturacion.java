/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*package trabajobimestralpoo;

import java.util.Scanner;

/**
 *
 * @author abrah
 */
 /*public class facturacion {

    static Scanner facturacion = new Scanner(System.in);
    static double pago = 0;

    public static void facturacion1(String opc) {
        System.out.println("""
                           Los horarios disponibles son:
                                 (1)14:10 |(2) 16:20 |(3) 18:30 |(4) 20:40
                           Salas:     03  |      05  |      01  |      02""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        facturacion.nextLine();
        switch (op) {
            case (1):
                System.out.println("""
                                   DESTINO FINAL: LAZOS DE SANGRE
                                   Horario: 14:10
                                   SALA: 03""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            case (2):
                System.out.println("""
                                   DESTINO FINAL: LAZOS DE SANGRE
                                   Horario: 16:20
                                   SALA: 05""");

                break;
            case (3):
                System.out.println("""
                                   DESTINO FINAL: LAZOS DE SANGRE
                                   Horario: 18:30
                                   SALA: 01""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            case (4):
                System.out.println("""
                                   DESTINO FINAL: LAZOS DE SANGRE
                                   Horario: 20:40
                                   SALA: 02""");
                 pago = pagacion(opc);
                snacks.venta();
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    public static void facturacion2(String opc) {
        System.out.println("""
                           Los horarios disponibles son:
                                 (1)14:00 |(2) 16:00 |(3) 18:00 |(4) 20:00
                           Salas:     02  |      01  |      05  |      03""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        facturacion.nextLine();
        switch (op) {
            case (1):
                System.out.println("""
                                   KARATE KID: LEYENDAS
                                   Horario: 14:00
                                   SALA: 02""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            case (2):
                System.out.println("""
                                   KARATE KID: LEYENDAS
                                   Horario: 16:00
                                   SALA: 01""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            case (3):
                System.out.println("""
                                   KARATE KID: LEYENDAS
                                   Horario: 18:00
                                   SALA: 05""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            case (4):
                System.out.println("""
                                   KARATE KID: LEYENDAS
                                   Horario: 20:00
                                   SALA: 03""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    public static void facturacion3(String opc) {
        System.out.println("""
                           Los horarios disponibles son:
                                 (1)15:50 |(2) 18:20 |(3) 20:50 |
                           Salas:     04  |      02  |      05  |""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        facturacion.nextLine();
        switch (op) {
            case (1):
                System.out.println("""
                                   THUNDERBOLTS
                                   Horario: 15:50
                                   SALA: 04""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            case (2):
                System.out.println("""
                                   THUNDERBOLTS
                                   Horario: 18:20
                                   SALA: 02""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            case (3):
                System.out.println("""
                                   THUNDERBOLTS
                                   Horario: 20:50
                                   SALA: 05""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    public static void facturacion4(String opc) {
        System.out.println("""
                           Los horarios disponibles son:
                                 (1)13:50 |
                           Salas:     03  |""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        facturacion.nextLine();
        switch (op) {
            case (1):
                System.out.println("""
                                   UNA PELICULA DE MINECRAFT 
                                   Horario: 13:50
                                   SALA: 03""");
                pago = pagacion(opc);
                snacks.venta();
                break;
            
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    public static double pagacion(String opc) {
        if(opc.equalsIgnoreCase("martes")||opc.equalsIgnoreCase("jueves")){
            System.out.println("precio del boleto a mitad de precio : 3,75$");
        double valorTK = 3.75;
        System.out.println("Ingrese la cantidad de boletos a comprar");
        int tickets = facturacion.nextInt();
        facturacion.nextLine();
        double MontoPagar = tickets * valorTK;
        System.out.println("Usted tiene que pagar el monto de: " + MontoPagar + "$");
        return MontoPagar;
        }else{
            
        
        System.out.println("precio de boleto: 7,50$");
        double valorTK = 7.50;
        System.out.println("Ingrese la cantidad de boletos a comprar");
        int tickets = facturacion.nextInt();
        facturacion.nextLine();
        double MontoPagar = tickets * valorTK;
        System.out.println("Usted tiene que pagar el monto de: " + MontoPagar + "$");
        
        return MontoPagar;
        }
    }

}
 */
package trabajobimestralpoo;

import java.util.Scanner;

public class facturacion {

    static Scanner facturacion = new Scanner(System.in);

    public static void facturacion1(String dia) {
        System.out.println("""
            Los horarios disponibles son:
                  (1)14:10 |(2) 16:20 |(3) 18:30 |(4) 20:40
            Salas:     03  |      05  |      01  |      02""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        facturacion.nextLine();
        switch (op) {
            case 1 ->
                procesarVenta("DESTINO FINAL: LAZOS DE SANGRE", "14:10", "03", dia);
            case 2 ->
                System.out.println("Opción no implementada para facturación");
            case 3 ->
                procesarVenta("DESTINO FINAL: LAZOS DE SANGRE", "18:30", "01", dia);
            case 4 ->
                procesarVenta("DESTINO FINAL: LAZOS DE SANGRE", "20:40", "02", dia);
            default ->
                System.out.println("Opción inválida");
        }
    }

    public static void facturacion2(String dia) {
        System.out.println("""
            Los horarios disponibles son:
                  (1)14:00 |(2) 16:00 |(3) 18:00 |(4) 20:00
            Salas:     02  |      01  |      05  |      03""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        facturacion.nextLine();
        switch (op) {
            case 1 ->
                procesarVenta("KARATE KID: LEYENDAS", "14:00", "02", dia);
            case 2 ->
                procesarVenta("KARATE KID: LEYENDAS", "16:00", "01", dia);
            case 3 ->
                procesarVenta("KARATE KID: LEYENDAS", "18:00", "05", dia);
            case 4 ->
                procesarVenta("KARATE KID: LEYENDAS", "20:00", "03", dia);
            default ->
                System.out.println("Opción inválida");
        }
    }

    public static void facturacion3(String dia) {
        System.out.println("""
            Los horarios disponibles son:
                  (1)15:50 |(2) 18:20 |(3) 20:50
            Salas:     04  |      02  |      05""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        facturacion.nextLine();
        switch (op) {
            case 1 ->
                procesarVenta("THUNDERBOLTS", "15:50", "04", dia);
            case 2 ->
                procesarVenta("THUNDERBOLTS", "18:20", "02", dia);
            case 3 ->
                procesarVenta("THUNDERBOLTS", "20:50", "05", dia);
            default ->
                System.out.println("Opción inválida");
        }
    }

    public static void facturacion4(String dia) {
        System.out.println("""
            Los horarios disponibles son:
                  (1)13:50
            Salas:     03""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        facturacion.nextLine();
        if (op == 1) {
            procesarVenta("UNA PELICULA DE MINECRAFT", "13:50", "03", dia);
        } else {
            System.out.println("Opción inválida");
        }
    }

    private static void procesarVenta(String pelicula, String horario, String sala, String dia) {
        double precioBoleto = (dia.equalsIgnoreCase("martes") || dia.equalsIgnoreCase("jueves")) ? 3.75 : 7.50;
        System.out.println("Precio del boleto: $" + precioBoleto);
        System.out.println("Ingrese la cantidad de boletos a comprar");
        int boletos = facturacion.nextInt();
        facturacion.nextLine();
        double totalBoletos = boletos * precioBoleto;
        System.out.println("Usted tiene que pagar el monto de: $" + totalBoletos);

        // Venta de snacks
        snacks.ResultadoSnacks resultadoSnacks = snacks.venta();

        double totalVenta = totalBoletos + resultadoSnacks.totalSnacks;
        System.out.println("Monto total de la compra (boletos + snacks): $" + totalVenta);

        // Registrar la venta
        RegistroVentas.registrarVenta(pelicula, horario, sala, boletos, resultadoSnacks.snacksComprados, totalVenta);
    }
}
