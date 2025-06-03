package trabajobimestralpoo;

import java.util.Scanner;

public class TrabajoBimestralPOO {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Los Horarios de que dia quiere observar?");
        String opc = datos.nextLine().toLowerCase();
        switch (opc) {
            case "lunes":
                cartelera.cartelera(opc);
                break;
            case "martes":
                cartelera.cartelera(opc);
                break;
            case "miercoles":
                cartelera.cartelera(opc);
                break;
            case "jueves":
                cartelera.cartelera(opc);
                break;
            case "viernes":
                cartelera.cartelera(opc);
                break;
            default:
                System.out.println("Dia no valido ");
                break;

        }
        

            
        
        
    }

}
