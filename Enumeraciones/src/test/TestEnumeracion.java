package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeracion {

    public static void main(String[] args) {
       // System.out.println("Dia 1 :" + Dias.LUNES);
       // indicarDiaSemana(Dias.LUNES);
       
        System.out.println("Continente no.4 " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to continente : " + Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            default:
                throw new AssertionError();
        }

    }

}
