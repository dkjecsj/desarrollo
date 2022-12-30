/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class CicloWhile {
    
    public static void main(String[] args) {
        
       //CICLO WHILE EJEMPLO CONTADOR
       
     /*  var contador = 0;
       while( contador < 3){
           System.out.println("contador = " + contador);
           contador++;*/
           
      //CICLO DO WHILE En caso de que necesitemos que se ejecute una vez
      
      int contador = 0;
      
      do{
          System.out.println("contador = " + contador);
          contador++; //debemos siempre incrementar el valor de variable para no crear ciclos infinitos.
       } while(contador < 0);
      
      
           
       }
        
    }
    

