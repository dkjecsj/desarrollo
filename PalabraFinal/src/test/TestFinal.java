package test;

import domian.Personal;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class TestFinal {

    public static void main(String[] args) {
        //final en variables

        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        // miVariable = 5; al tener la final no se puede modificar el valor asignado. 

        final Personal persona1 = new Personal();
        // persona = new Personal (); no podemos volver asignar una nueva referencia a la variable, ya que se marco como final.
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre: " + persona1.getNombre());

    }

}
