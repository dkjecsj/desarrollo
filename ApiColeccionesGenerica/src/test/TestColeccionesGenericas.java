package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        //La lista mantiene el orden
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
       // imprimir(miLista);

        //Funcion landa
      //  miLista.forEach(elemento -> {
         //   System.out.println("elemento: " + elemento);
        //});

        //La lista set no mantiene el orden
        Set<String>miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
       // String elemento = miLista.get(0);
        //System.out.println("elemento = " + elemento);
        //imprimir(miSet);
        
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Juan" );
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");
        
        String elementoMapa =  miMapa.get("Valor1"); // Se coloca la llave y se hace la conversion de object a string
        //System.out.println("elementoMapa = " + elementoMapa);
       imprimir(miMapa.keySet()); // Imprime las llaves
       imprimir(miMapa.values()); //Imprime los valores
        
        
        

    }
    
    public static void imprimir (Collection<String> coleccion){
        for(Object elemento :  coleccion){
            System.out.println(" elemento = " + elemento);
        }
        
        
    }

}
