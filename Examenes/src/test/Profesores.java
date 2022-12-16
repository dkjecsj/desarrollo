
package test;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class Profesores {
    
     private String nombre , apellido;
     
     
     public Profesores (){
         
     
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
     
    
     
     
}
