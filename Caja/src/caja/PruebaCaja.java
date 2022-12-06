/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class PruebaCaja {

    public static void main(String[] args) {

        Caja caja = new Caja();
        caja.alto = 3;
        caja.ancho =2;
        caja.profundo = 6;
        caja.calcularVolumen();
        
        
        Caja caja2 = new Caja(3, 2, 6);
        caja2.calcularVolumen();

    }

}
