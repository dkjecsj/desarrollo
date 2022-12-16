
package domain;

import java.io.Serializable;

public class Persona  implements Serializable{
    
    //Atributos privados
    private String nombre;
    private String apellido;
    
    
    //Constructor vacio y publico
    public Persona(){
        
    }
    
    public Persona(String nombre , String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //crear los metodos get y set de los atributos privados
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
            
    
    
    
}
