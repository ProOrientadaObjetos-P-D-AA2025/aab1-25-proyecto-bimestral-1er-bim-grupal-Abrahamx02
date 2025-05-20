/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajobimestralpoo;

import java.util.Scanner;

/**
 *
 * @author abrah
 */
public class facturacion {

    static Scanner facturacion = new Scanner(System.in);
    static double pago = 0;

    public static void facturacion1() {
        System.out.println("""
                           Los horarios disponibles son:
                                 (1)14:10 |(2) 16:20 |(3) 18:30 |(4) 20:40
                           Salas:     03  |      05  |      01  |      02""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        switch (op) {
            case (1):
                System.out.println("""
                                   DESTINO FINAL: LAZOS DE SANGRE
                                   Horario: 14:10
                                   SALA: 03""");
                pago = pagacion();
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
                pago = pagacion();
                snacks.venta();
                break;
            case (4):
                System.out.println("""
                                   DESTINO FINAL: LAZOS DE SANGRE
                                   Horario: 20:40
                                   SALA: 02""");
                pago = pagacion();
                snacks.venta();
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    public static void facturacion2() {
        System.out.println("""
                           Los horarios disponibles son:
                                 (1)14:00 |(2) 16:00 |(3) 18:00 |(4) 20:00
                           Salas:     02  |      01  |      05  |      03""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        switch (op) {
            case (1):
                System.out.println("""
                                   KARATE KID: LEYENDAS
                                   Horario: 14:00
                                   SALA: 02""");
                pago = pagacion();
                snacks.venta();
                break;
            case (2):
                System.out.println("""
                                   KARATE KID: LEYENDAS
                                   Horario: 16:00
                                   SALA: 01""");
                pago = pagacion();
                snacks.venta();
                break;
            case (3):
                System.out.println("""
                                   KARATE KID: LEYENDAS
                                   Horario: 18:00
                                   SALA: 05""");
                pago = pagacion();
                snacks.venta();
                break;
            case (4):
                System.out.println("""
                                   KARATE KID: LEYENDAS
                                   Horario: 20:00
                                   SALA: 03""");
                pago = pagacion();
                snacks.venta();
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    public static void facturacion3() {
        System.out.println("""
                           Los horarios disponibles son:
                                 (1)15:50 |(2) 18:20 |(3) 20:50 |
                           Salas:     04  |      02  |      05  |""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        switch (op) {
            case (1):
                System.out.println("""
                                   THUNDERBOLTS
                                   Horario: 15:50
                                   SALA: 04""");
                pago = pagacion();
                snacks.venta();
                break;
            case (2):
                System.out.println("""
                                   THUNDERBOLTS
                                   Horario: 18:20
                                   SALA: 02""");
                pago = pagacion();
                snacks.venta();
                break;
            case (3):
                System.out.println("""
                                   THUNDERBOLTS
                                   Horario: 20:50
                                   SALA: 05""");
                pago = pagacion();
                snacks.venta();
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    public static void facturacion4() {
        System.out.println("""
                           Los horarios disponibles son:
                                 (1)13:50 |
                           Salas:     03  |""");
        System.out.println("Ingrese la opcion a escoger");
        int op = facturacion.nextInt();
        switch (op) {
            case (1):
                System.out.println("""
                                   UNA PELICULA DE MINECRAFT 
                                   Horario: 13:50
                                   SALA: 03""");
                pago = pagacion();
                snacks.venta();
                break;
            
            default:
                System.out.println("opcion invalida");
                break;
        }

    }

    public static double pagacion() {

        System.out.println("precio de boleto: 7,50$");
        double valorTK = 7.50;
        System.out.println("Ingrese la cantidad de boletos a comprar");
        int tickets = facturacion.nextInt();
        double MontoPagar = tickets * valorTK;
        System.out.println("Usted tiene que pagar el monto de: " + MontoPagar + "$");
        return MontoPagar;
    }

}
