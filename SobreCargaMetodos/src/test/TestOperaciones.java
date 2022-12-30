package test;

import operaciones.Operaciones;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class TestOperaciones {

    public static void main(String[] args) {
        int resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        double resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado = " + resultado2);
        
    }
    
}
