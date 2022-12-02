
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
public class TareaSeccionTres {
    
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese nombre del libro: ");
        var nombre = consola.nextLine();
        System.out.println("Ingresa el ID: ");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa el precio ");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("Ingrese TRUE para envio gratuito ");
        var envioGratuito = Boolean.parseBoolean(consola.nextLine());
        System.out.println(nombre + "  " + "#" + id + "\nPrecio: $" + precio + "\nEnvio Gratuito:" +envioGratuito);
        
        //Para comparar booleanos, el espera a que sea verdadero para entrar.
        
        /*if(envioGratuito){
          System.out.println("Envio gratuito: " + envioGratuito);
        }*/
           
        
           
        
    }
    
}
        
        
      
           


            
       
       
   
       
    

