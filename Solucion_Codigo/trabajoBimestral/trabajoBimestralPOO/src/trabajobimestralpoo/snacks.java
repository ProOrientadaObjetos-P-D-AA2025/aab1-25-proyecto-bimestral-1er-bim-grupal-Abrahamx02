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
/*public class snacks {

    static Scanner snacks = new Scanner(System.in);
    static int op;
    static int cant = 0;

    public static double venta() {
        double subPago = facturacion.pago;
        double pagoFinal = 0;
        boolean bandera = true;
        while (bandera) {
            System.out.println("""
                          SNACKS DISPONIBLES: 
                                             (1) Palomitas |(2) Hotdogs |(3) Papas fritas |
                                             (4) Nachos    |(5) Bebidas |(6) dulces       |""");
            op = snacks.nextInt();
            snacks.nextLine();
            switch (op) {
                case (1) -> {
                    System.out.println("(1)DULCE  |(2)SALADO");
                    System.out.println("Cuantas palomitas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double palomitas = cant * 2.50;
                    pagoFinal = pagoFinal + palomitas;
                }

                case (2) -> {
                    System.out.println("cuantos hotDogs desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double hotDogs = cant * 3.00;
                    pagoFinal = pagoFinal + hotDogs;
                }
                case (3) -> {
                    System.out.println("cuantas papas fritas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double fries = cant * 3.00;
                    pagoFinal = pagoFinal + fries;
                }
                case (4) -> {
                    System.out.println("cuantos nachos desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double nachos = cant * 2.50;
                    pagoFinal = pagoFinal + nachos;
                }
                case (5) -> {
                    System.out.println("que bebida desea?");
                    System.out.println("""
                                         (1)Pepsi    | (2)Cocacola | (3)Sprite | (4)Fanta
                                         (5)Tropical | (6)Gallito  | (7)7up    | (8)agua
                                         """);
                    System.out.println("cuantas bebidas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double bebidas = cant * 0.75;
                    pagoFinal = pagoFinal + bebidas;
                }

                case (6) -> {
                    System.out.println("que dulce desea?");
                    System.out.println("""
                                         (1)chocolate   | (2)caramelos | (3)chupetes | (4)manjar
                                         (5)chocolate B | (6)gomitas   | (7)pepas    |
                                         """);
                    System.out.println("cuantos dulces desea?");
                    cant = snacks.nextInt();
                    snacks.nextInt();
                    snacks.nextLine();
                    double dulces = cant * 1.00;
                    pagoFinal = pagoFinal + dulces;
                }

                default ->
                    System.out.println("Opcion no valida");

            }
            System.out.println("quiere comprar mas snacks? escriba (si)");
            String salida = snacks.nextLine();
            bandera = salida.equalsIgnoreCase("si");
        }
        pagoFinal = pagoFinal + subPago;

        return pagoFinal;
    }
}
*/
package trabajobimestralpoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class snacks {
    static Scanner snacks = new Scanner(System.in);
    static int op;
    static int cant = 0;

    public static class ResultadoSnacks {
        List<String> snacksComprados = new ArrayList<>();
        double totalSnacks = 0;
    }

    public static ResultadoSnacks venta() {
        ResultadoSnacks resultado = new ResultadoSnacks();
        boolean bandera = true;
        while (bandera) {
            System.out.println("""
                  SNACKS DISPONIBLES: 
                  (1) Palomitas |(2) Hotdogs |(3) Papas fritas |
                  (4) Nachos    |(5) Bebidas |(6) Dulces       |""");
            op = snacks.nextInt();
            snacks.nextLine();
            switch (op) {
                case (1) -> {
                    System.out.println("(1)DULCE  |(2)SALADO");
                    System.out.println("Cuantas palomitas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double palomitas = cant * 2.50;
                    resultado.totalSnacks += palomitas;
                    resultado.snacksComprados.add("Palomitas x" + cant);
                }
                case (2) -> {
                    System.out.println("Cuantos hotDogs desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double hotDogs = cant * 3.00;
                    resultado.totalSnacks += hotDogs;
                    resultado.snacksComprados.add("Hotdogs x" + cant);
                }
                case (3) -> {
                    System.out.println("Cuantas papas fritas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double fries = cant * 3.00;
                    resultado.totalSnacks += fries;
                    resultado.snacksComprados.add("Papas fritas x" + cant);
                }
                case (4) -> {
                    System.out.println("Cuantos nachos desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double nachos = cant * 2.50;
                    resultado.totalSnacks += nachos;
                    resultado.snacksComprados.add("Nachos x" + cant);
                }
                case (5) -> {
                    System.out.println("Que bebida desea?");
                    System.out.println("""
                         (1)Pepsi    | (2)Cocacola | (3)Sprite | (4)Fanta
                         (5)Tropical | (6)Gallito  | (7)7up    | (8)Agua
                         """);
                    System.out.println("Cuantas bebidas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double bebidas = cant * 0.75;
                    resultado.totalSnacks += bebidas;
                    resultado.snacksComprados.add("Bebidas x" + cant);
                }
                case (6) -> {
                    System.out.println("Que dulce desea?");
                    System.out.println("""
                         (1)Chocolate   | (2)Caramelos | (3)Chupetes | (4)Manjar
                         (5)Chocolate B | (6)Gomitas   | (7)Pepas    |
                         """);
                    System.out.println("Cuantos dulces desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double dulces = cant * 1.00;
                    resultado.totalSnacks += dulces;
                    resultado.snacksComprados.add("Dulces x" + cant);
                }
                default ->
                    System.out.println("Opción no válida");
            }
            System.out.println("¿Quiere comprar más snacks? escriba (si)");
            String salida = snacks.nextLine();
            bandera = salida.equalsIgnoreCase("si");
        }
        return resultado;
    }
}
