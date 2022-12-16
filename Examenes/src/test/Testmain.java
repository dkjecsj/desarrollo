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
