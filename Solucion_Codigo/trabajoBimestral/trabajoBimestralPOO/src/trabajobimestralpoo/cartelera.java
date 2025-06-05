/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajobimestralpoo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author abrah
 */
public class cartelera {

    static Scanner datos = new Scanner(System.in);

    /*public static void cartelera(String opc) {

        System.out.println("""                                             
                           (1)DESTINO FINAL: LAZOS DE SANGRE   HORARIOS: 14:10 - 16:20 - 18:30 - 20:40
                           (2)KARATE KID: LEYENDAS             HORARIOS: 14:00 - 16:00 - 18:00 - 20:00
                           (3)THUNDERBOLTS                     HORARIOS: 15:50 - 18:20 - 20:50
                           (4)una pelicula de minecraft        HORARIOS: 13:50""");
        System.out.println("\nQue opcion de pelicula quiere ver?");
        int op = datos.nextInt();
        datos.nextLine();
        switch(op){
            case 1:
                facturacion.facturacion1(opc);
                break;
                case 2:
                    facturacion.facturacion2(opc);
                break;
                case 3:
                    facturacion.facturacion3(opc);
                break;
                case 4:
                    facturacion.facturacion4(opc);
                break;
                default:
                    System.out.println("Opcion no valida");
                break;
        }

    }
     */
    public static void cartelera(String opc) {
        ArrayList<Pelicula> cartelera = new ArrayList<>();
        cartelera.add(new Pelicula("(1) DESTINO FINAL: LAZOS DE SANGRE",
                 "14:10 - 16:20 - 18:30 - 20:40",
                 "03|05|01|02"));
        cartelera.add(new Pelicula("(2) KARATE KID: LEYENDAS",
                 "14:00 - 16:00 - 18:00 - 20:00",
                 " 02|01|05|03"));
        cartelera.add(new Pelicula("(3) THUNDERBOLTS",
                 "15:50 - 18:20 - 20:50",
                 "04|02|05"));
        cartelera.add(new Pelicula("(4) UNA PELICULA DE MINECRAFT",
                 "13:50",
                 "03"));

        for (int i = 0; i < cartelera.size(); i++) {
            System.out.println(cartelera.get(i));      
        }
        System.out.println("Que opcion de pelicula desea ver?");
        int op = datos.nextInt();
        switch (op){
                case(1):
                    facturacion.facturacion1(opc);
                    break;
                    case(2):
                        facturacion.facturacion2(opc);
                        break;
                        case(3):
                            facturacion.facturacion3(opc);
                            break;
                            case(4):
                                facturacion.facturacion4(opc);
                                break;
                            default: 
                                System.out.println("opcion invalida");
                                break;
                                    
                        }
    }
}
