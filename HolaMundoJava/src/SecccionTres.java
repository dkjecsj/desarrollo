
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
public class SecccionTres {
    
    public static void main(String[] args) {
        int numeroUno = 10;
        System.out.println("El numero es = " + numeroUno);
        
        double numeroDos = 10.0;
        System.out.println("El numero es = " + numeroDos);
        
        float numeroTres = 10.0F;
        System.out.println("El numero es = " + numeroTres);
        
        
        //VATIABLE TIPO CHAR
        
        char nombreCaracter = 'a';
        System.out.println("nombreCaracter = " + nombreCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varDecimal = 33;
        System.out.println("varDecimal = " + varDecimal);
        
        char varSigno = '!';
        System.out.println("varSigno = " + varSigno);
        
       
        
        char varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        char varDecimal2 = 33;
        System.out.println("varDecimal2 = " + varDecimal2);
        
        char varSigno3 = '!';
        System.out.println("varSigno3 = " + varSigno3);
        
        int variableEnteraSimbolo = '!' ;
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
       //TIPO BOOLEAN
       
       boolean varTipoBoolean = false;
        System.out.println("varTipoBoolean = " + varTipoBoolean);
       
        if(varTipoBoolean){
            System.out.println("La Bandera es verdadera");
        
        }
        
        else {
            System.out.println("La Bandera es falsa");
        
        }
        
       
          int edad = 15;
          
          
          if (edad >= 18) {
              
              System.out.println("Eres mayor de edad");
            
        }
          else {
              
              System.out.println("Eres menor de edad");
          }
          
         //CONVERTIR UN TIPO STRING A UN TIPO INT
         
         int entero = Integer.parseInt("20");
         System.out.println("entero = " + (entero + 1));
     
         double valorPI = Double.parseDouble("3.1416");
         System.out.println("valorPI = " + valorPI);
         
         //Pedir un Valor
         
         Scanner consola = new Scanner (System.in);
//         System.out.println("Ingresa tu edad: ");
//         edad = Integer.parseInt(consola.nextLine());
//         System.out.println("edad = " + edad);
         
         // CONVERTIR UN TIPO INT A STRING
         
         String  edadTexto = String.valueOf(10);
         System.out.println("edadTexto = " + edadTexto);
         
        // Como recuperar un caracter de un cadena.
        
        char caracter = "Hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Ingresa un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
       String nombre2 = "Juan";
       System.out.println(nombre2);
       nombre2 = "Carlos";
       System.out.println(nombre2);
      
    }
    
  
    
}
