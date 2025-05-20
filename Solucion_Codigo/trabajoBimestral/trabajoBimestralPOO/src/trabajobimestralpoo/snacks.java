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
public class snacks {
    static Scanner snacks = new Scanner (System.in);
   public static double venta(){
       double subPago = facturacion.pago;
       double pagoFinal=0;
       System.out.println("""
                          SNACKS DISPONIBLES: 
                                             (1) Palomitas |(2) Hotdogs |(3) Papas fritas |
                                             (4) Nachos    |(5) Bebidas |(6) dulces       |""");
       int op =  snacks.nextInt();
       switch (op){
       case(1):
           System.out.println("(1)DULCE  |(2)SALADO");
           int p = snacks.nextInt();
       break;
       case(2):
       break;
       case(3):
       break;
       case(4):
       break;
       case(5):
       break;
       case(6):
       break;
       default:
           System.out.println("Opcion no valida");
       break;
   }
       
       return pagoFinal;
   } 
}
