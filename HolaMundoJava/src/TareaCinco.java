
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
public class TareaCinco {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Porporcione un valor entre 0 y 10");
        int numero = Integer.parseInt(consola.nextLine());
        String nota = "Valor desconocido";

        /* switch (numero) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                nota = "F";
                break;

            case 6:
                nota = "D";
                break;

            case 7:
                nota = "C";
                break;

            case 8:
                nota = "B";
                break;
            
            case 9:
            case 10:
                nota = "A";
                break;

        }

        System.out.println(nota);*/
        //IF- ELSE
        if (numero == 0 || numero < 6) {
            nota = "F";
        } else if (numero == 6 || numero < 7) {
            nota = "D";

        } else if (numero == 7 || numero < 8) {
            nota = "C";
        } else if (numero == 8 || numero < 9) {
            nota = "B";

        } else if (numero == 9 || numero == 10) {
            nota = "A";

        }
        
        System.out.println(nota);

    }

}
