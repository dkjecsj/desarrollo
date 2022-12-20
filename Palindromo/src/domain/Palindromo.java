package domain;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        
         int contador = 1;

         while (contador != 0) {
       
            System.out.println("Ingrese caracteres pares del 2 al 10: ");
            String entrada = consola.nextLine();
            int pos = 0;
            entrada = entrada.replaceAll(" ", "");

            if (entrada.equals("Terminar")) {
                contador = 0;
                System.out.println("Programa finalizado");

            } else {

                char[] ordenado = entrada.toCharArray() ;
                char[] inverso = new char[ordenado.length];

                for (int i = ordenado.length; i > 0; i--) {
                    inverso[pos] = ordenado[i - 1];
                    pos++;
                }

                String inversoDos = new String(inverso);
                if (entrada.equals(inversoDos)) {
                    System.out.println("Symmetric");

                } else {

                    System.out.println("Asymmetri");
                }

            }

        }

    }

}


