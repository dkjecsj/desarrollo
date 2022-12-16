
package test;

import domain. *;


public class TestAbstractas {
    
    public static void main(String[] args) {
        //no podemos crear objetos de clases abstractas.
       // FiguraGeometrica figura = new FiguraGeometria ();
       
       FiguraGeometrica figura = new Rectangulo ("Rectangulo");
       figura.dibujar();
    }
    
    
    
    
    
    
    
}
