
package domain;


public class Persona {
    private String nombre;
    
    public Persona (String nombre){
        this.nombre = nombre;
    
    }    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    Persona personas [] = {new Persona("juan"), new Persona ("Karla")};
   for(Persona persona : Personas){
            System.out.println("persona = " + persona);

}
    
    
    
    
    
    
}
