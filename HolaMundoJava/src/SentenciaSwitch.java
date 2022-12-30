
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class SentenciaSwitch {

    public static void main(String[] args) {

        //SETENCIA SWITCH    
        int numero = 1;
        String numeroTexto = "Valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero Dos";
                break;
            case 3:
                numeroTexto = "Numero Tres";
                break;
            case 4:
                numeroTexto = "Numero Cuatro";
                break;
            default:
                numeroTexto = "caso no encontrado";

        }

        System.out.println("numeroTexto = " + numeroTexto);

        //EJERCICIO CALCULO ESTACION DEL AÑO
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporcione el numero del mes:");
        int mes = Integer.parseInt(consola.nextLine());
        String estacion = "Estacion desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;

            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;

            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;

            case 9:
            case 10:
            case 11:
                estacion = "Otonio";
                break;

        }
        
        System.out.println("estacion = " + estacion);

    }
}
