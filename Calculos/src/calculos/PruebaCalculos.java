
package calculos;

import java.util.Scanner;


public class PruebaCalculos {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        Calculos persona = new Calculos();

        System.out.println("Ingrese su nombre: ");
        persona.nombre = consola.nextLine();
        System.out.println("Ingrese su cedula: ");
        persona.cedula = Integer.parseInt(consola.nextLine());

        int contador = 1;

        while (contador != 0) {

            System.out.println("Ingrese que operacion quiere realizar :");
            System.out.println("suma , resta , multiplicacion , division o terminar");
            persona.operacion = consola.nextLine();

            if (persona.operacion.equals("terminar")) {
                contador = 0;
                System.out.println("Programa Finalizado");

            } else {

                System.out.println("Ingrese numero uno: ");
                persona.numeroUno = Integer.parseInt(consola.nextLine());
                System.out.println("Ingrese numero dos: ");
                persona.numeroDos = Integer.parseInt(consola.nextLine());
                persona.operador();

            }

        }

    }
}
