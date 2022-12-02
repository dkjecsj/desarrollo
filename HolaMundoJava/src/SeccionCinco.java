
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
public class SeccionCinco {

    public static void main(String[] args) {

        //ESCTRUCUTURA IF/ELSE
        var condicion = true;

        if (condicion) //Si la condicio es verdadera
        {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }

        //EJEMPLOS
        //1. CONVERTIR DE NUMERO A LETRA.
        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero Uno";

        } else if (numero == 2) {
            numeroTexto = "Numero Dos";
        } else if (numero == 3) {
            numeroTexto = "Numero Tres";

        } else if (numero == 4) {
            numeroTexto = "Numero  Cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
        
    // EJEMPLO ESTACION DEL AÑO
    
    Scanner consola = new Scanner (System.in);
    
    System.out.println("Proporcione numero del mes:");
    int mes = Integer.parseInt(consola.nextLine());
    var estacion = "Estacion desconocida";
    
    if(mes == 1 || mes == 2 || mes == 12){
        estacion = "Invierno";
    }
    else if (mes ==3 || mes == 4 || mes == 5){
        estacion = "Primavera";
    }
    
     else if (mes ==6 || mes == 7 || mes == 8){
        estacion = "Verano";
    }
    
     else if (mes ==9 || mes == 10 || mes == 11){
        estacion = "Otonio";
    }
    
        System.out.println("estacion = " + estacion);
    }
        
        

    }


