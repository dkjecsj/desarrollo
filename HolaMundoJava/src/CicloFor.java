/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class CicloFor {

    public static void main(String[] args) {

        //CICLO FOR
        int contador = 0;

        for (contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                 continue ; //ir a la siguiente ireracion 
               
            }
             System.out.println("contador = " + contador);
        }

        //Break y continue en JAVA
        //for( contador = 0 ; contador < 3 ; contador++){
        // if(contador % 2 == 0) {
        //  System.out.println("contador = " + contador);
        //  break inicio;
    
     
      //Etiquetas en java
      
      /*1.nos permiten idicar a las palabras continue o break ir hacia un lugar
      especifico de nuestro programa
      2. Esto no es muy recomenable de aplicar debido  a que a esta programacion
      se conoce como la programacion de tipo go to. 
      3. no es buen practica y ademas no es conveniente aplicarlo a proyectos
      de la vida real.
      */ 
      
      inicio:
      for(contador = 0; contador < 3; contador++){
              if(contador == 2){
                  continue inicio; //ir a la linea de  codigo de la etiqueta que hemos agregado
              }
          System.out.println("contador = " + contador);
      }
      
      



}
    
}
