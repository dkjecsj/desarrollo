package domian;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class Personal { //La palabra final en una clase no pemirte que esta sea heredada

    public final static int MI_CONSTANTE = 1;// esta combinacion se le conoce como constante y se usan en mayuscula

    private String nombre;

    public void imprimir() { // la palabra final en un metodo no pemite sobreescribirlo en otra clase.
        System.out.println("Metodo imprimir");

        // Personal.MI_CONSTANTE = 6; El valor de una constante no se puede modificar,
        System.out.println("Mi constante: " + Personal.MI_CONSTANTE);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
