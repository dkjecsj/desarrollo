
package test;

import domain.Empleado;


public class TestClaseObject {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado ("juan", 5000);
        Empleado empleado2 = new Empleado ("Juan", 5000);
        
        if(empleado1 == empleado2){ //Compara el espacio en memoria o referencia
            System.out.println("Tienen la misma refencia en memoria");
            
        }
        
        else{
            System.out.println("Tienen distinta refencia en memoria");
        }
        
    if(empleado1.equals(empleado2)){
        System.out.println("los objetos son iguales en contenido");
    }
    
    else{
        System.out.println("los objetos son distintos en contenido");
    }
    
    if(empleado1.hashCode() == empleado2.hashCode()){
        System.out.println("el valor hascode es igual");
    
    }
    
    else{
        System.out.println("el valor hascode es distinto");
    }
    
      
        
        
    }

    
}
