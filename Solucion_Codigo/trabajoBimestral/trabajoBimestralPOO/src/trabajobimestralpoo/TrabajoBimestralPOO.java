package trabajobimestralpoo;

import java.util.Scanner;

public class TrabajoBimestralPOO {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean continuar = true;
        while(continuar){
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
        System.out.println("¿Desea realizar otra consulta/venta? (si/no)");
            String respuesta = datos.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }
        RegistroVentas.mostrarVentas();
    }
    
        

}
