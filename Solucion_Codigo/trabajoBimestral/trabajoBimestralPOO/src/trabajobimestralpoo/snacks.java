package trabajobimestralpoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class snacks {

    static Scanner snacks = new Scanner(System.in);
    static int op;
    static int cant = 0;

    public static class ResultadoSnacks {

        public List<String> snacksComprados = new ArrayList<>();
        public double totalSnacks = 0;
    }

    public static ResultadoSnacks venta() {
        ResultadoSnacks resultado = new ResultadoSnacks();
        System.out.println("¿Desea comprar snacks? (si/no)");
        String respuesta = snacks.nextLine();
        if (!respuesta.equalsIgnoreCase("si")) {
            return resultado;
        }

        boolean bandera = true;
        while (bandera) {
            System.out.println("SNACKS DISPONIBLES:\n(1) Palomitas | (2) Hotdogs | (3) Papas fritas |\n(4) Nachos | (5) Bebidas | (6) Dulces");
            op = snacks.nextInt();
            snacks.nextLine();

            switch (op) {
                case 1: {
                    System.out.println("(1) Dulce | (2) Salado");
                    int p = snacks.nextInt();
                    snacks.nextLine();
                    System.out.println("¿Cuántas palomitas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    double palomitas = cant * 2.50;
                    resultado.totalSnacks += palomitas;
                    String tipo;
                    if (p == 1) {
                        tipo = "dulce";
                    } else {
                        tipo = "salado";

                    }
                    resultado.snacksComprados.add("Palomitas " + tipo + " x" + cant);
                    break;
                }
                case 2: {
                    System.out.println("¿Cuántos hotdogs desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    resultado.totalSnacks += cant * 3.00;
                    resultado.snacksComprados.add("Hotdogs x" + cant);
                    break;
                }
                case 3: {
                    System.out.println("¿Cuántas papas fritas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    resultado.totalSnacks += cant * 3.00;
                    resultado.snacksComprados.add("Papas fritas x" + cant);
                    break;
                }
                case 4: {
                    System.out.println("¿Cuántos nachos desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    resultado.totalSnacks += cant * 2.50;
                    resultado.snacksComprados.add("Nachos x" + cant);
                    break;
                }
                case 5: {
                    System.out.println("¿Qué bebida desea?\n(1) Pepsi | (2) CocaCola | (3) Sprite | (4) Fanta\n(5) Tropical | (6) Gallito | (7) 7up | (8) Agua");
                    int b = snacks.nextInt();
                    snacks.nextLine();
                    System.out.println("¿Cuántas bebidas desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    resultado.totalSnacks += cant * 0.75;

                    String bebida;
                    switch (b) {
                        case 1:
                            bebida = "Pepsi";
                            break;
                        case 2:
                            bebida = "CocaCola";
                            break;
                        case 3:
                            bebida = "Sprite";
                            break;
                        case 4:
                            bebida = "Fanta";
                            break;
                        case 5:
                            bebida = "Tropical";
                            break;
                        case 6:
                            bebida = "Gallito";
                            break;
                        case 7:
                            bebida = "7up";
                            break;
                        case 8:
                            bebida = "Agua";
                            break;
                        default:
                            bebida = "Bebida desconocida";
                            break;
                    }
                    resultado.snacksComprados.add(bebida + " x" + cant);
                    break;
                }
                case 6: {
                    System.out.println("¿Qué dulce desea?\n(1) Chocolate | (2) Caramelos | (3) Chupetes | (4) Manjar\n(5) Chocolate B | (6) Gomitas | (7) Pepas");
                    int d = snacks.nextInt();
                    snacks.nextLine();
                    System.out.println("¿Cuántos desea?");
                    cant = snacks.nextInt();
                    snacks.nextLine();
                    resultado.totalSnacks += cant * 1.00;

                    String dulce;
                    switch (d) {
                        case 1:
                            dulce = "Chocolate";
                            break;
                        case 2:
                            dulce = "Caramelos";
                            break;
                        case 3:
                            dulce = "Chupetes";
                            break;
                        case 4:
                            dulce = "Manjar";
                            break;
                        case 5:
                            dulce = "Chocolate B";
                            break;
                        case 6:
                            dulce = "Gomitas";
                            break;
                        case 7:
                            dulce = "Pepas";
                            break;
                        default:
                            dulce = "Dulce desconocido";
                            break;
                    }
                    resultado.snacksComprados.add(dulce + " x" + cant);
                    break;
                }
                default:
                    System.out.println("Opción inválida");
            }

            System.out.println("¿Desea comprar más snacks? (si/no)");
            String otra = snacks.nextLine();
            bandera = otra.equalsIgnoreCase("si");
        }

        return resultado;
    }
}
