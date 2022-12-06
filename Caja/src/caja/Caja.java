/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

public class Caja {

    //Atributos de la clase
    int alto;
    int ancho;
    int profundo;

    //Constructor Vacio 
    public Caja() {
        System.out.println("Constructor vacio:");

    }

    //Constructor con argumentos
    public Caja(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
        System.out.println("Constructor con argumentos:");

    }

    //Metodo calcular volumen
   
    public void calcularVolumen() {
        int resultado = this.alto * this.ancho * this.profundo;
        System.out.println("resultado = " + resultado);

    }

}
