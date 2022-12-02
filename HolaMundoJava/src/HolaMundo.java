
import java.util.Scanner;

// Mi clase java

public class HolaMundo {

    public static void main(String args[]) {
        // Tipo  Nombre  Valor de la variable
        //Definimos la variable
        int miVariableEnteraPorSiempre = 10;


        System.out.println(miVariableEnteraPorSiempre);

        //Cuando la variable ya esta definida , no hay que volver al colocar el tipo de dato.
        //Modificamos el valor de la varible
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //Var hara inferencia de tipos en JAVA
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Ejemplo";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //Valores permitidos para nombre de variables.
        var miVariable = 10;
        var _miVariable = 2;
        var $mivariable = 2;
        // var áVariable = 1; no se recomienda utilizar
        // var #variable = 1 ; no se permite utilizar caracter especial.

        var usuario = "Emma";
        var carrera = "Ingeniera";

        var union = carrera + " " + usuario;
        System.out.println("union = " + union);

        var a = 10;
        var b = 2;
        System.out.println(a + b); // realiza la suma de numeros
        System.out.println(a + b + usuario); //Evaluacion de izq a der, realiza suma
        System.out.println(usuario + a + b); // Contexto Cadena, todo es una cadena
        System.out.println(usuario + (a + b)); // uso de parentesis modifican la prioridad en la evaluacion

        //CARACTERES ESPECIALES
        var nombre = "Paola";
        System.out.println("Nueva linea:    \n" + nombre);
        System.out.println("Tabulador:    \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla Simple: \'" + nombre + "\'");
        System.out.println("Comilla Simple: \"" + nombre + "\" ");
        
        // SCANNER
        
        /* System.out.println("Ingrese su nombre:");
        Scanner consola = new Scanner(System.in);//Esta clase nos permite leer informacion de la consola
        var nombres = consola.nextLine(); // Metodo que lee una linea completa de la consola
        System.out.println("Nombre = " + nombres);
        System.out.println("Escribre el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: "+ titulo + " " + nombres);*/
        
        
      /*TAREA
        
       Scanner consola = new Scanner(System.in);
       System.out.println("Ingrese titulo del libro : ");
       var tituloLibro = consola.nextLine();
       System.out.println("Ingrese nombre del autor");
       var autor = consola.nextLine();
       System.out.println(tituloLibro + " " + "Fue escrito por: "+ autor); 
        
      */
       
      /*
      TIPOS PRIMITIVOS ENTEROS : 
       Byte 
       Short
       Int
       Long
      */
      
      byte numeroByte = 10;
      byte numeroByteDos = (byte)129; // Sintaxis para convertir un numero entero a byte
      System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
      System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
      
      short numeroShort = 10;
      System.out.println("numero Short = " + numeroShort);
      System.out.println("Valor minimo short:" + Short.MIN_VALUE);
      System.out.println("Valor maximo short:" + Short.MAX_VALUE);
      
      int numeroInt = 11;
      System.out.println("numero Int = " + numeroInt);
      System.out.println("Valor minimo Entero:" + Integer.MIN_VALUE);
      System.out.println("Valor maximo Entero:" + Integer.MAX_VALUE);
            
      long numeroLong = 10; 
      System.out.println("numero Long = " + numeroLong);
      System.out.println("Valor minimo Long:" + Long.MIN_VALUE);
      System.out.println("Valor maximo Long:" + Long.MAX_VALUE);
      
        /*
      TIPOS PRIMITIVOS FLOTANTES : 
       Float
       Double
      */
        
      float numeroFloat = 3.4028235E38F;
      System.out.println("numero Float = " + numeroFloat);
      System.out.println("Valor minimo Float:" + Float.MIN_VALUE);
      System.out.println("Valor maximo Float:" + Float.MAX_VALUE);
      
      double numeroDouble = 10;
        System.out.println("numero Double = " + numeroDouble);
        System.out.println("Valor minimo Float:" + Double.MIN_VALUE);
        System.out.println("Valor maximo Float:" + Double.MAX_VALUE);
        
      

    }

}
