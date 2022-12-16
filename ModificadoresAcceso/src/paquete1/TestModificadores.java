
package paquete1;

import paquete1.Clase1;

public class TestModificadores {
    public static void main(String[] args) {
           
        Clase1 clase1 = new Clase1();
        clase1.atributoDefault = "Cambio desde la prueba";
        System.out.println("Clase atributo default = " + clase1.atributoDefault);
        clase1.metodoDefault();
        
        
        
            
        
    }
    
 
    
}
