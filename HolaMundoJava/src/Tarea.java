
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
public class Tarea {
    public static void main(String[] args) {
        
                
       Scanner consola = new Scanner(System.in);
       System.out.println("Ingrese titulo del libro : ");
       var tituloLibro = consola.nextLine();
       System.out.println("Ingrese nombre del autor");
       var autor = consola.nextLine();
       System.out.println(tituloLibro + " " + "Fue escrito por: "+ autor);
        
    }
}
