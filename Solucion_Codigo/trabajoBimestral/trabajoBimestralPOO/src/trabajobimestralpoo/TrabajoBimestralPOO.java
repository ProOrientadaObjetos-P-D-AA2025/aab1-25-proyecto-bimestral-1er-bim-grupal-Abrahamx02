package trabajobimestralpoo;

import java.util.Scanner;

public class TrabajoBimestralPOO {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Los Horarios de que dia quiere observar?");
        String op = datos.nextLine().toLowerCase();
        switch (op) {
            case "lunes":
                cartelera.carteleraL();
                break;
            case "martes":
                cartelera.carteleraM();
                break;
            case "miercoles":
                cartelera.carteleraMC();
                break;
            case "jueves":
                cartelera.carteleraJ();
                break;
            case "viernes":
                cartelera.carteleraV();
                break;
            default:
                System.out.println("Dia no valido ");
                break;
                
                

        }
    }

}
