
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
public class TareaCuatro {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el alto:");
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho:");
        int ancho = Integer.parseInt(consola.nextLine());

        int area = alto * alto;
        System.out.println("Area = " + area);
        int perimetro = (alto + alto) * 2;
        System.out.println("Perimetro = " + perimetro);

    }

}
