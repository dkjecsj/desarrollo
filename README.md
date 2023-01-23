# CURSO UDEMY JAVA DE CERO A EXPERTO

## Indice

1. Indice
2. Descripción del proyecto
3. Guia de inicio
    - Requisitos de instalación
    1. Contar con IDE de preferencia en este caso NetbBeans.
    2. Hacer uso del sistema de control GitHub
    3. Descargar Framework Spring Boot 
4. Contenido del curso
   - Universidad Java De Cero A Experto.
   - SpringBoot
5. Ejercicios
   - Operaciones Aritmeticas 
   - Plataforma Colegio
   - Palindromo
   - Recuento
   - Correcciones de código 
   - Arreglo Numero Mayor y Menor.
6. Personas Contribuyentes
7. Personas Desarrolladores del proyecto


## Descripción del proyecto

En el repositorio podremos encontrar el desarrollo los cursos establecidos en el proceso de capacitación este abarcara diferentes temas como JAVA, SpringBoot , GitHuB , Bases de datos en los cuales obtendremos conocimientos previos para poder realizar las actividades que se no sean asignadas en el transcurso de los meses de trabajo.


## Guia de inicio

### **Requisitos de Instalación**

1. Contar con IDE de preferencia en este caso se utilizo NetBeans.
2. Hacer uso del sistema de control GitHub.


## **Contenido del curso**

### **Universidad Java De Cero A Experto.**

El curso se divide por secciones en las cuales se abordan temas desde los mas básicos en java hasta las tecnologías que hoy en día son usadas para el desarrollo de plataformas a nivel laboral.

En el transcurso de la primera semana abordamos las siguientes secciones:

- Sección 1 a la sección 6: En estas secciones se trabajaron temas como variables, tipos de datos, caracteres especiales, operadores aritméticos y lógicos, sentencias de control y ciclos. El curso cuenta con ejercicios de practica los cuales ayudan a reforzar los conocimientos que previamente vamos obteniendo.

---

- Sección de la 7 a la 14: En estas secciones se trabajaron los temas de creación de clases en java , métodos, constructores , alcance de variables , paso por valor y por referencia, uso de la palabra return , nula y this y uno de los temas fundamentales de la programación en java encapsulamiento.De igual manera el curso de desarrolla por diferentes contenidos en los cuales podemos desarrollar ejercicios que nos ayuden a reforzar los conocimientos obtenidos. 
 
---
- Sección 15 a la 20: A partir de esta sección el curso empieza a tratar temas un poco mas avanzados , en los cuales podemos encontrar que es el Contexto Estático en Java (Static),                                                                                                        Herencia, sobre carga de constructores y métodos ,el uso de paquetes y la palabra final, manejo de arreglos. Estos temas son fundamentales para el desarrollo de todos los programas que queramos implementar por eso es bueno que pongamos en practica todos los conceptos tratados en cada una de las secciones , para poder aclarar dudas que surgen y que estas no afecten el avance del aprendizaje.   

---

- Sección 21, 22 y 27: En estas secciones se trabajaron temas como manejo de matrices , diseño de clases , manejo de forEach en java. 

---

- Sección 31 a la 37 : Los temas que se  trabajaron en esta sección son de gran importancia debido a que vemos los pilares fundamentales para el desarrollo de programas en java como lo es el polimorfismo el cual es un tema bastante abstracto en cual se debe estudiar y revisar de una manera frecuente ya que esto se utiliza con mucha frecuencia al momento de trabajar con java. Tambien se ven temas como conversión de objetos (Casting), la clase Object en java especificamente los métodos Equals, hashCode y toString, Clases Abstractas , manejo de Interfaces y manejo de JavaBeans el cual nos abre las puertas para poder implementar otras tecnologías que hacen que el desarrollo posee una mejor adaptación. 


---

- Sección 38 a la 40 : En los temas de visto en esta sección se pudo trabajar con el manejo de Excepciones en Java , API Collections en donde trabajamos toda la parte de ArrayList de que manerA se crea ,  y las diferentes aplicaciones con las que cuenta y por ultimo Manejo de Generics en java el cual es muy frecuente verlo en el día a dia debido que eso nos ahorra códigos al momento de querer especificar el tipo de un objeto. Con estas secciones daríamos fin al curso de java de cero a experto.


### Ejercicios 

En el transcurso de los temas se realizaron diferentes ejercicios los cuales de desarrollaron de la siguiente manera.

## Operaciones Aritméticas:

 El primer ejercicio solicitaban crear un programa el cual fuese capaz de realizar operaciones aritméticas. El programa debía  solicitar el nombre, cédula de la persona una sola vez , también se debía solicitar el numero y numero , ingresar que operacion aritmética quería realizar (Suma , Resta , Multiplicación y División)  el programa finalizaba cuando el usuario ingresa terminar todo esto se debía solicitar por medio de consola. A continuación se mostrara en código el cual brinda la solución requerida para la solicitud.

```
package calculos;

public class Calculos {

    //Atributos 
    int cedula;
    int numeroUno;
    int numeroDos;
    int resultado;
    String nombre;
    String operacion = "";
    String suma = "suma";
    String resta = "resta";
    String multiplicacion = "multiplicacion";
    String division = "division";
    String terminar = "terminar";

    //Constructor vacio
    public Calculos() {

    }

    //Metodo operaciones
    public void operador() {

        if (this.operacion.equals(suma)) {
            this.resultado = this.numeroUno + this.numeroDos;
            System.out.println("Nombre: " + nombre + "\ncedula: " + cedula + "\nEl resultado de la suma es: " + resultado);

        } else if (this.operacion.equals(resta)) {
            this.resultado = this.numeroUno - this.numeroDos;
            System.out.println("Nombre: " + nombre + "\ncedula: " + cedula + "\nEl resultado de la resta es :" + resultado);

        } else if (this.operacion.equals(multiplicacion)) {
            this.resultado = this.numeroUno * this.numeroDos;
            System.out.println("Nombre: " + nombre + "\ncedula: " + cedula + "\nEl resultado de la multiplicacion es: " + resultado);

        } else if (this.operacion.equals(division)) {
            this.resultado = this.numeroUno / this.numeroDos;
            System.out.println("Nombre: " + nombre + "\ncedula: " + cedula + "\nEl resultado de la division es: " + resultado);

        }

    }

}

```

- Código de la clase ejecutora.

```

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



```

## Plataforma Colegio:

En este segundo ejercicio solicitaban crear una plataforma para un colegio en donde se almacenaran los profesores , estudiantes y el resultado de los exámenes de 3 preguntas. La informacion debía solicitarse por medio de consola la cual se trataba de ingresar el nombre del profesor evaluado, el nombre de los estudiantes y el puntaje que saco en cada uno de los exámenes, al finalizar  el programa debía imprimir el nombre del profesor con su cédula , el nombre de los estudiantes y la nota final. Para la solución de esta solicitud se hizo uso de objetos , métodos en los cuales se realiza la operación para promediar la notas ingresadas, uso de  arreglos , ciclos y condicionales. A continuación se mostrara en código el cual brinda la solución requerida para la solicitud.


- Paquete test

### clase profesores



```

package test;

/**
 *
 * @author grislypaolabeltranbarrios
 */
public class Profesores {
    
     private String nombre , apellido;
     
     
     public Profesores (){
         
     
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
     
    
     
     
}



```

### clase Testmain

```
package test;

import test.objetos.Estudiantes;
import java.util.Scanner;

public class Testmain {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        Estudiantes alumnos[] = new Estudiantes[3];

        Profesores profesor = new Profesores();
        System.out.println("Ingrese nombre del docente");
        profesor.setNombre(consola.nextLine());
        System.out.println("Ingrese apellido del docente");
        profesor.setApellido(consola.nextLine());

        int i = 0;
        int contador = 0;

        while (i < alumnos.length) {

            System.out.println("Desea Terminar");
            if (consola.nextLine().equals("si")) {
                i = alumnos.length;
                for (int j = 0; j < alumnos.length; j++) {
                    System.out.println("Calificion Examenes Estudiantes: " + alumnos[j].getNota()+" " + alumnos[j].toString() +" "+ profesor.toString());

                }

            } else {

                if (contador < alumnos.length) {

                    Estudiantes estudiante = new Estudiantes();

                    System.out.println("Ingrese nombre estudiante");
                    estudiante.setNombre(consola.nextLine());

                    System.out.println("Ingrese calificacion examen A: ");
                    estudiante.setA(Integer.parseInt(consola.nextLine()));
                    System.out.println("Ingrese calificacion examen B: ");
                    estudiante.setB(Integer.parseInt(consola.nextLine()));
                    System.out.println("Ingrese calificacion examen C: ");
                    estudiante.setC(Integer.parseInt(consola.nextLine()));

                    Testmetodos nota = new Testmetodos();

                    estudiante.setNota(nota.Sumar(estudiante.getA(), estudiante.getB(), estudiante.getC()));

                    alumnos[contador] = estudiante;
                    contador = contador + 1;
                    
                    

                } else {

                    System.out.println("Supero el tamaño del arreglo");
                }

            }

        }

    }

}



```



### clase Testmetodo


```
package test;

public class Testmetodos {
    
   public int Sumar (int a , int b , int c){
       int nota = (a+b+c)/3;
       return nota ;
  
   

   
 


    


    }
}

    

```


- Paquete  test.objetos


### Clase Estudiantes

package test.objetos;

public class Estudiantes  extends Examenes{
    
    private String nombre;
 
    
    
    public Estudiantes(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + '}';
    }
    
    
    
    
    
}


### Examenes



```
package test.objetos;

public class Examenes {
    
    private int a ;
    private int b; 
    private int c;
    private int nota;
    
    
   public Examenes (){
   
   }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
   
     public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Examenes{" + "a=" + a + ", b=" + b + ", c=" + c + ", nota=" + nota + '}';
    }
    
    
   
   
}


```

## Palindromo :

En este ejercicio debíamos determinar si una matriz de n elementos es simétrica es decir si se ve igual invertida. Por ejemplo (a, b , c , d , d , c , b ,a) n siempre será un numero par entre 2 y 10. Si es simétrica el programa debe imprimir "Symmetric"  , de lo contrario debía imprimir "Asymmetric". A continuación se mostrara en código el cual brinda la solución requerida para la solicitud.

```
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



```

## Recuento:

En el siguiente ejercicio se solicitaba un programa el cual tuviese un arreglos de nombre miArray con 10 elementos enteros del 1 al 9. Este debía imprimir el numero que tiene mas ocurrencias seguidas en el arreglo y tambien debía imprimir la cantidad de veces que aparece en la secuencia. El programa debía analizarlo de izquierda a derecha para que en caso de que dos numeres cumplan la condición  se muestre el que aparece por primera vez.A continuación se mostrara en código el cual brinda la solución requerida para la solicitud.

```

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

                System.out.println("Contador 1 : " + cont + "Contador 2 :" + cont2);

                if (cont2 < cont) {

                    cont2 = cont; // Muestra el valor que mas se repitio.
                    numeroMayor = miArray[i-1];

                    System.out.println("Valor que mas se repite " + cont2);

                    System.out.println("mi Array " + miArray[i - 1]);

                }

                cont = 1;
                num = miArray[i];
                

            }
        }

        System.out.println("Longest: " + cont2);
        System.out.println("Number: " + numeroMayor);

    }

}


```

### Correcciones:


El objetivo de este ejercicio se basa en analizar el código que otra persona ya había desarrollando el cual tenia ciertos errores los cuales no permitían obtener el resultado que se solicitaba . Se debía corregir dichos errores para que el programa corriera de la manera correcta.A continuación se mostrara en código el cual brinda la solución requerida para la solicitud.


```
import java.util.*;

public class ListClass {

    public static void main(String[] args) {
        
        
        ArrayList arry = new ArrayList(8);
        
        arry.add(44);
        arry.add(65);
        arry.add(33);
        arry.add(44);
        arry.add(13);
        arry.add(31);
        arry.add(32);
        arry.add(51);
      
    
       int intelement = arry.lastIndexOf(44);
       System.out.println("Index: "+ intelement);
            
         
            
        }
       
     
      
           
       }

```

### Arreglo Numero Mayor  y Menor: 

El objetivo de este ejercicio es  realizar un programa en el que reciba un arreglo de tamaño 10 con distintos números. Se debe digiera un numero mediante consola, y el numero ingresado debe compararse con cada una de las posiciones del arreglo si el numero digitado es mayor de guardara el numero del arreglo en otro arreglo  asignado como mayor, en caso de que sea menor en un arreglo definido como menor, y en caso de que sea igual no deberá ser almacenado.A continuación se mostrara en código el cual brinda la solución requerida para la solicitud.


- Paquete  domain

### Clase Números

```

package domain;

public class Numeros {
    
 
    private int numero;
    private int numeroMayor;
    private int numeroMenor;
    
    
   
    public Numeros (){
     
    
     }
    
    
    //Metodos get y set

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroMayor() {
        return this.numeroMayor;
    }

    public void setNumeroMayor(int numeroMayor) {
        this.numeroMayor = numeroMayor;
    }

    public int getNumeroMenor() {
        return this.numeroMenor;
    }

    public void setNumeroMenor(int numeroMenor) {
        this.numeroMenor = numeroMenor;
    }

    @Override
    public String toString() {
        return "Numeros{" + "numero=" + numero + ", numeroMayor=" + numeroMayor + ", numeroMenor=" + numeroMenor + '}';
    }
    
    
        
    
}



```


- Paquete  test

### Clase TestArreglos


```

package test;

import domain.Numeros;
import java.util.Scanner;

public class TestArreglos {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        Numeros numero = new Numeros();
        System.out.println("Ingrese un numero");
        numero.setNumero(Integer.parseInt(consola.nextLine())); 
        System.out.println("numero = " + numero.getNumero()); 
        int miArray[] = {2, 3, 4, 5, 3, 6, 7, 9, 0, 8};
        int arrayMenor[] = new int[10];
        int arrayMayor[] = new int[10];
        
        
        
        for (int i = 0; i < miArray.length; i++) {
           // System.out.println("array " + miArray[i]);
            
            if (miArray[i] > numero.getNumero()) {
               numero.setNumeroMayor(miArray[i]);
               arrayMayor [i] = numero.getNumeroMayor();
              System.out.println("mi array mayor:" + arrayMayor[i]);
                 
                
            }
            
            else if(miArray[i] < numero.getNumero()){
                numero.setNumeroMenor(miArray[i]);
                arrayMenor[i] = numero.getNumeroMenor();
               
                 
               
                
            }
            
            System.out.println("Mi array es :" + numero.toString());
           
        }


    }

} 


```


### **Spring Boot.**

Spring Boot es una de las herramientas principales del ecosistema de desarrollo web backend con java , con Spring Boot nos olvidamos de tener que desplegar artefactos Jar o War de manera independiente en uno o muchos servidores web diferentes. Por que nos provee una serie de contenedores  web servlet para que se despliegue nuestra aplicacion automáticamente solo con "Run".

En el contexto de Spring tenemos dos conceptos muy importantes: la inyección de dependencias y la inversión de control. Lo importante a tener en cuenta es que, aunque son conceptos que se relacionan, son distintos. Es decir, la inyección de dependencias es un patrón de diseño que nos permite implementar el principio de inversión de control.


Unas de las características de Spring Boot son :

1. Maneja componente ioC inversión de control. Registramos y guardamos  los objetos que son conocidos como Beas o componentes permite modularidad bajo acoplamiento y se puede inyectar un componente  puede tener un atributo o referencia de otro componente y se hace mediante anotaciones esto evita que creemos las instancias de forma explicita con el operador new el framework ya se encarga de eso.

---

2. MVC modelo vista controlador :

- M : Se usa para desarrollar aplicaciones web y Apirest
- C : Maneja todas las peticiones del usuario
- V : Mostrar los datos (html, pdf, son, etc)

---

3.Spring incorpora una programación reactiva webFlux es asincrono.Se debe de trabajar con bases de datos que sean de igual manera reactivas.


--- 

4. Es una programación orientada a aspectos AIP es un programa basado en intersectores permite modular izar la aplicación


---

5.Administrador de dependencias nos permite crear un Jar o War  y  manejo de librerías.

---

6. Los paquetes Jar se usan como plantillas Timeline y Api rest.  Los  War cuando queremos publicar en un  servidor externo y vista JC.


### **My SQL.**

El lenguaje de consulta estructurada (SQL) es un lenguaje de consulta de programacion para almacenar y procesar informacion en una base de datos
relacional. Un base de datos relacional almacena informacion en forma de tabla, con filas y columnas que 
representan almacena informacion en forma de tabla, con filas y columnas que representan diferentes atributos
de datos y las diversas relaciones entre los valores de datos.

Puede usar las instrucciones SQL para almacenar , actualizar, eliminar, buscar y recuperar informacion de la base de datos. Tambien puede usar SQL para
mantener y optimizar el redimiento de la base de datos.


### Instrucciones:

1. Select : Se utiliza para seleccionar datos de una base de datos. Tambien lo podemos usar para cambiar los nombres las las columnas.
git

![This is an image](https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tutorialesprogramacionya.com%2Fmysqlya%2Ftemarios%2Fdescripcion.php%3Fcod%3D6%26punto%3D7%26inicio%3D&psig=AOvVaw1rQiVxqHOZEfzv0yU7U3r5&ust=1674591602960000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCIiph__B3vwCFQAAAAAdAAAAABAE)

---
2. Distic : Se utiliza en conjunto de la opcion SELECT y nos ayuda a traer valores diferente.
---
3. ORDER BY : Se utiliza para ordenar la informacion de nuestras tablas, ya sea de manera ascedente o descendente.
---
4. WHERE : Se utiliza para extraer aquellos registros que cumplen una condicion especifica.
---
5. AND : Lo usamos cuando queremos que dos condiciones sean verdaderas.
---
6. OR : Realiza la consulta de la primera condicion y luego de la segunda. Muestra los resultados que cumplas
ambas condiciones.
---
7. NOT : Lo utilizamos cuando no queremos consultar una condicion en especifico.
---
8. IN : Es una abreviatura de multiples condiciones or.
---
9. BETWEEN : Lo utilizamos para seleccionar valores dentro de un rango dado.
---
10. LIKE : Se utiliza para buscar un patron especifico de una columna.
---
11. INNER JOIN : Si se quiere unir dos o mas tablas ,estas deben tener una llaven en comun entre ellas.
---
12. LEFT JOIN : Si quiero mantener los datos de la izquiera y quiero unirlos con los datos de las derecha.
---
13. RIGHT JOIN : Si quiero mantener los datos de la derecha y quiero unirlos con los daros de la izquierda.





