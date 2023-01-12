package domain;

import java.util.*;

public class Recuento {

    public static void main(String[] args) {

        int miArray[] = {9, 3, 4 , 1, 5, 6, 6, 6, 2, 2};
        //{2,2,3,4,4,4,6,7,8,9}
        Arrays.sort(miArray); //Ordena el array.
        int cont = 0;
        int cont2 = 0;
        int num = miArray[0];
        int numeroMayor = 0;

        for (int i = 0; i < miArray.length; i++) {

            if (num == miArray[i]) {
                cont++;

            } else {

                //System.out.println("Contador 1 : " + cont + "Contador 2 :" + cont2);

                if (cont2 <  cont) {

                    cont2 = cont; // Muestra el valor que mas se repitio.
                    numeroMayor = miArray[i-1];

                    //System.out.println("Valor que mas se repite " + cont2);

                   // System.out.println("mi Array " + miArray[i - 1]);

                }

                cont = 1;
                num = miArray[i];
                
            }
        }

        System.out.println("Longest: " + cont2);
        System.out.println("Number: " + numeroMayor);

    }

}
