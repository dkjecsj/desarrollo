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
public class Aritmetica {
    
    // Atributos de la clase
    int a;
    int b;
    
    //Metodo
    
 public void sumar (){
     int resultado = a + b;
     System.out.println("resultado = " + resultado);
 }
 
 public int sumarConRetorno(){
 return a + b;
 }
 
//Metodo con argumentos
 
 public int sumarConArgumentos(int arg1  , int arg2){
     a = arg1;
     b= arg2;
     return sumarConRetorno();
     
     
     
 }
 
 }
         
    

