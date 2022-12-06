
package pasoporreferencia;

import clases.Personas;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        
        Personas personaUno = new Personas();
        personaUno.nombre = "Juan";
        System.out.println("persona nombre = " + personaUno.nombre);
        personaUno = cambiaValor(personaUno);
        System.out.println("persona cambio de nombre = " + personaUno.nombre);
    }
    
    public static Personas cambiaValor (Personas persona){
        persona.nombre= "Karla";
        return persona;
    
    }
    
}
