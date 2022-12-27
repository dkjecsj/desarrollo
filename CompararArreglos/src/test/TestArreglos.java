package test;

import domain.Numeros;
import java.util.Scanner;

public class TestArreglos {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        Numeros numero = new Numeros();
        System.out.println("Ingrese un numero");
        numero.setNumero(Integer.parseInt(consola.nextLine())); // Ingresa el numero desde la consola
        System.out.println("numero = " + numero.getNumero()); // Trae el numero ingresado

        int miArray[] = {2, 3, 4, 5, 3, 6, 7, 9, 0, 8};
        int arrayMenor[] = new int[10];
        int arrayMayor[] = new int[10];
        
        
        
        for (int i = 0; i < miArray.length; i++) {
           // System.out.println("array " + miArray[i]);
            
            if (miArray[i] > numero.getNumero()) {
               numero.setNumeroMayor(miArray[i]);
               arrayMayor [i] = numero.getNumeroMayor();
              // System.out.println("mi array mayor:" + arrayMayor[i]);
                 //System.out.println("Mi array Mayor :" + numero.toString()); 
                
            }
            
            else if(miArray[i] < numero.getNumero()){
                numero.setNumeroMenor(miArray[i]);
                arrayMenor[i] = numero.getNumeroMenor();
               // System.out.println("Mi array menor: " + arrayMenor[i]);
                 System.out.println("Mi array es :" + numero.toString()); //imprimir con el metodo ToString
                 
               
                
            }
            
          
           
        }


    }

} 
