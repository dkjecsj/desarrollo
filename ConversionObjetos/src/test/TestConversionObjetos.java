
package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;


public class TestConversionObjetos {
    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado  = new Escritor ("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        
        System.out.println( empleado.obtenerDetalles());
        
        // Se hace la convercion Dowcasting de la clase padre a una clase hija
        //((Escritor)empleado).getTipoEscritura();
        
        
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
       //Se hace una conversion UpCasting  de la clase hija a la clase padre. 
       Empleado empleado2 = escritor;
       empleado2.obtenerDetalles();
        
    }
    
}
