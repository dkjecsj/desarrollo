
package test;

import domain.Empleado;
import domain.Gerente;


public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente ("Karla" , 1000, "Contabilidad");
       // System.out.println("gerente1 : " + gerente1.obtenerDetalles());
       imprimir(gerente1);
       
        
        Empleado  empleado = new Empleado ("Juan", 5000 );
        //System.out.println("Empleado : " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        
        
    }
    
    public static void imprimir (Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
    
    
}
