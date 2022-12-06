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
   
    //Constructor vacio
    
    public Aritmetica (){
        System.out.println("Ejecutando Constructor");
    
    }
    
    public Aritmetica (int a,  int b){
       this.a = a;
       this.b = b;
       System.out.println("Ejecutando constructor con argumentos ");
        
    }
    
    
    //Metodo
    
 public void sumar (){
     int resultado = this.a + this.b;
     System.out.println("resultado = " + resultado);
 }
 
 public int sumarConRetorno(){
 return this.a + this.b;
 }
 
//Metodo con argumentos
 
 public int sumarConArgumentos(int a  , int b){
     this.a = a; //El argumento a se asigna al atributo this.a
     this.b= b;
     return this.sumarConRetorno();
     
     
     
 }
 
 }
         
    

