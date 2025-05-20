package trabajobimestralpoo;

import java.util.Scanner;

public class TrabajoBimestralPOO {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Los Horarios de que dia quiere observar?");
        String op = datos.nextLine().toLowerCase();
        switch (op) {
            case "lunes":
                cartelera.cartelera();
                break;
            case "martes":
                cartelera.cartelera();
                break;
            case "miercoles":
                cartelera.cartelera();
                break;
            case "jueves":
                cartelera.cartelera();
                break;
            case "viernes":
                cartelera.cartelera();
                break;
            default:
                System.out.println("Dia no valido ");
                break;

        }
    }

}
