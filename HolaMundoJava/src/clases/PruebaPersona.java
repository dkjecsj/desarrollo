/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class PruebaPersona {

    public static void main(String[] args) {
        //crear objetos
        Personas personaUno = new Personas(); //el constructor nos permite asignar valores al obejo y reserbar memoria.
        personaUno.nombre = "Juan";
        personaUno.apellido = "Perez";
        personaUno.desplegarInformacion();

        Personas personaDos = new Personas();
        personaDos.nombre = "Karla";
        personaDos.apellido = "Lara";
        personaDos.desplegarInformacion();

        System.out.println("personaUno = " + personaUno);
        System.out.println("personaDos = " + personaDos);

    }

}
