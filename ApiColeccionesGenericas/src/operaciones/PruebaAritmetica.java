/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author grislypaolabeltranbarrios
 */

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        //Variables locales
        
        int a = 10; //no pueden usarse e otro metodo, solo en el que se definio
        int b = 2;
        miMetodo();
        
        
        Aritmetica aritmetica = new Aritmetica ();
        System.out.println("Aritmetica a :"+ aritmetica.a);
        System.out.println("Aritmetica b :" + aritmetica.b);
        
        Aritmetica aritmetica2 = new Aritmetica (5,8);
        System.out.println("Aritmetica a :"+ aritmetica2.a);
        System.out.println("Aritmetica b :" + aritmetica2.b);
                
        /*aritmetica.a = 3;
        aritmetica.b = 2;
        aritmetica.sumar();
        
        var resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado desde clase prueba = " + resultado);
        
        
        resultado = aritmetica.sumarConArgumentos(5, 8); //parametros
        System.out.println ( "resultado usando argumentos " + resultado);*/
     
    
}
    
    public static void miMetodo(){
        //a = 10; La variable esta fuera del alcance donde fue definida
        System.out.println("Otro metodo");
        
    }
    
}