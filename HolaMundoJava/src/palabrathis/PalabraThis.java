
package palabrathis;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("Personas nombre: " + persona.nombre);
        System.out.println("Personas apellido: " + persona.apellido);
    }
    
    
    
}

class Persona{
    
    String nombre;
    String apellido;
    
    Persona(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        new  Imprimir().Imprimir(this);
    
    }
       
}

class Imprimir {
   public void Imprimir (Persona persona){
       System.out.println("Persona desde imprimir :" + persona);
       System.out.println("Impresion del objeto actual this:  "+ this);
       
   
   }

}