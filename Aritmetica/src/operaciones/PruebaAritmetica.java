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
        Aritmetica aritmetica = new Aritmetica ();
        aritmetica.a = 3;
        aritmetica.b = 2;
        aritmetica.sumar();
        
        var resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado desde clase prueba = " + resultado);
        
        
        resultado = aritmetica.sumarConArgumentos(5, 8); //parametros
        System.out.println ( "resultado usando argumentos " + resultado);
     
    
}
}