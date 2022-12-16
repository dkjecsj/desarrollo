
package test.objetos;

public class Estudiantes  extends Examenes{
    
    private String nombre;
 
    
    
    public Estudiantes(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + '}';
    }
    
    
    
    
    
}
