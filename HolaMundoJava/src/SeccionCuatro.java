/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class SeccionCuatro {
    
    public static void main(String[] args) {

        /*int c = a + 5 - b; int a = 3, b = 2;
        int c = a + 5 - b;
        var resultado = a + b;
        System.out.println("c = " + c);
        System.oic void main(String[] args) {

        /* int ut.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println(" resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("resultado division = " + resultado);

        resultado = a % b;
        System.out.println("resultado reciduo = " + resultado);

        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("En numero impar");
        }

        //Operadores de asignacion  (=)
        a += 1; //sintaxis del operador de composicion a = a +1
        System.out.println("a = " + a);

        a += 3; //a = a +3 ;
        System.out.println("a = " + a);

        a -= 2; //a= a - 2;
        System.out.println("a = " + a);

        a *= 4; //a = a + 4;
        System.out.println("a = " + a);

        a /= 6; //a = a / 6;
        System.out.println("a = " + a);

        a %= 2; // a = a % 6;
        System.out.println("a = " + a);

        //OPERADORES UNARIOS  
        var d = 3;
        var e = -d; //cambio de signo
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        //Operador de negacion para variables de tipo boolean
        var i = true;
        var j = !i;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //Operadores Unarios de incremento y decremento.
        // 1. Preincremento (simbolo antes de la variable)
        var f = 3;
        var n = ++f; //primero se incrementa la variable y despues se usa su valor

        System.out.println("f = " + f);
        System.out.println("n = " + n);

        // 2. Postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; // primero se usa el valor de la variable y luego se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Decremento 
        // 1. Predecremento
        var l = 2;
        var m = --l;
        System.out.println("l = " + l); // Ya esta decrementada
        System.out.println("m = " + m);

        // 2. Posdecremento
        var k = 4;
        var o = k--; // Primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k); //Pendiente un decremento
        System.out.println("o = " + o); */
//OPERADORES DE IGUALDAD
        int a = 2;
        int b = 3;
        
        boolean c = (a == b);
        System.out.println("c = " + c);

        //Operador diferente de
        boolean d = (a != b);
        System.out.println("d = " + d);

        // Operador para comparar cadenas
        String cadena = "Hola";
        String cadena2 = "Hola";
        boolean e = (cadena == cadena2); // Se compara la referencia de objetos.
        System.out.println("e = " + e);
        
        boolean f = cadena.equals(cadena2);
        System.out.println("f = " + f);// Se comparan los contenidos de cadenas

        //OPERADORES RELACIONALES
        //1. Estos nos van a indicar si un valor es igual o menor , mayor a otro
        boolean g = a >= b;
        System.out.println("g = " + g);
        
        if (a % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es numero Impar");
        }
        
        int edad = 10;
        int adulto = 18;
        
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }

        //OPERADORES CONDICIONALES (&& )
        int h = 8;
        int valorMinimo = 0;
        int valorMaximo = 10;
        
        boolean resultado = h >= 0 && h <= 10;
        if (resultado) {
            System.out.println("Dentro del Rango");
        } else {
            System.out.println("Fuera de rango");
        }
        // Operador (||) si alguna de las dos condiciones es verdadera todo el resultado de la operacion sera verdadero.
        boolean vacaciones = false;
        boolean diaDescanso = true;
        
        if (vacaciones || diaDescanso) {
            System.out.println("El padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }

        //OPERADOR TERNARIO 
        /* 1. la primera parte del operador ternario lo que hace es una expresion booleana
          2. el signo ? nos indica la operacion que  realizara si la expresion es verdadera
          3. el signo : nos indicara la operacion que realizara si la expresion en falsa
         */
        String respuesta = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("respuesta = " + respuesta);
        
        int  numero = 8;
        respuesta = (numero % 2 == 0 )? "El numero es par" : "El numero es impar";
        System.out.println("respuesta = " + respuesta);
                
        
        //PRESEDENCIA DE OPERADORES
        
        int x = 5;
        int y = 10;
        int z = ++x  + y--;
       
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        int operacion = 4 + ((5 * 6) / 3);
        System.out.println("operacion= " + operacion);
        
        operacion = (4 + 5)* 6 /3;
        System.out.println("operacion = " + operacion);
        
    }
    
}
