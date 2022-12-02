
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
public class TareaDosCuatro {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Porporciona el numero uno:");
        int numeroUno = Integer.parseInt(consola.nextLine());
        System.out.println("Porporciona el numero dos:");
        int numeroDos = Integer.parseInt(consola.nextLine());
        
        if(numeroUno > numeroDos)
            System.out.println("El numero mayor es : " + numeroUno);
        else
            System.out.println("El numero mayor es = " + numeroDos);
        
        
        
        
        
        
  
        
        
    }
    
}
