 
package test;

import domain.Empleado;
import domain.Gerente;


public class TestInstanOf {
    public static void main(String[] args) {

         Empleado  empleado = new Empleado ("Juan", 5000 );
         determinarTipo(empleado);
         empleado = new Gerente ("Karla", 5000, "Contabilidad" );
         //determinarTipo(empleado);
        
        
    }
    
    public static void determinarTipo (Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente)empleado;
            gerente.getDepartamento();
            System.out.println("gerente = " + gerente.getDepartamento());
    }
        else if (empleado instanceof Empleado){
           // Gerente gerente = (Gerente)empleado;
            //System.out.println("Es de tipo empleado");
            
            System.out.println("empleado = " + empleado.getNombre());
            
        }
        
        else if (empleado instanceof Object) {
            System.out.println("Es de tipo object");
            empleado.toString();
            
        }
            
    }
    
    
    
}
