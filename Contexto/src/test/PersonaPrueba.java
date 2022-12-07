package test;

import domain.Persona;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class PersonaPrueba {
    
    private int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona("juan");
        Persona persona2 = new Persona("Karla");
        
        imprimir(persona1);
        imprimir(persona2);
      

    }

    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
    
    
    public int getContador (){
        return this.contador;
        
    }

}
