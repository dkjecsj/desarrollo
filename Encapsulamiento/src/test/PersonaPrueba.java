
package test;

import dominio.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona ("juan", 5000, false);
        
        System.out.println("Persona1: " + persona1.toString());
        
        persona1.setNombre("Juan Carlos");
        persona1.setSueldo(2000);
        persona1.setEliminado(true);
        
        /*System.out.println("Persona1 nombre: " + persona1.getNombre());
        System.out.println("Persona1 sueldo: " + persona1.getSueldo());
        System.out.println("Persona1 eliminado: " + persona1.isEliminado()); */
        
        System.out.println("Person1 :" + persona1.toString());
    }   
    
    
    
}
