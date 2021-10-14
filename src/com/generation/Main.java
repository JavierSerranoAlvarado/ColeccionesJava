package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* Iniciar arreglo en 2 lineas
        String universidades[];
        */

        /*Inicializar en una linea
        String universidades[] = new String[];
         */

        /* agregar los datos a los arreglos
        universidades[0] = "ITVH";
        universidades[1] = "ULA";
        universidades[2] = "UAM";
        universidades[3] = "UADM";
        universidades[4] = "UNADM";
        universidades[5] = "UPN";
        universidades[6] = "IPN";
        universidades[7] = "TESCO";
         */

        /*
        //Inicializar en una linea y agregar los datos desde ahí
        String universidades[] = new String[]{"ITVL","ULA","UAM"};


        for (String universidad : universidades){
            System.out.println(universidad);
        };
         */

        Set<String> frutas = new HashSet(4);
        //Caracteristicas principales de Set
        // No puede contener elementos duplicados
        // Almancena los elementos en una tabla HASH
        //El orden de los elementos puede variar.
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");

        for(String fruta : frutas){
            System.out.println(fruta);
        }
        System.out.println("----------------------------------");

        Set<String> frutas2 = new TreeSet<String>();
        //Mas lento del HashSet
        //Oridena los elemento en ofrden alfabetico
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Pera");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");

        for(String fruta : frutas2){
            System.out.println(fruta);
        }

        System.out.println("-----------------------");
        Set<String> frutas3 = new LinkedHashSet<>(4);
        //Es un poco mas costosa qie hasSet
        //Almacena los valores en orden de insercion
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Pera");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");

        for(String fruta : frutas3){
            System.out.println(fruta);
        }
        /*

        System.out.println("------------------------------");
        System.out.println("Javier Serrano");

        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set treeSet = new TreeSet();
        final Long startTreeSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set linkedHashSet = new LinkedHashSet(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));


         */

        System.out.println("----------Array List-------------");

        List<String> frutas4 = new ArrayList<>();
        //List si admite elementos duplicados

        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Pera");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        frutas4.add("mango");

        for(String fruta : frutas4){
            System.out.println(fruta);
        }

        System.out.println("Elementos array");
        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("Melon");

        System.out.println(frutas4.get(indice));
        System.out.println("----------Array List-------------");

        List<String> frutas5 = new LinkedList<>();
        //Lista doblemente enlazada, cada item sabe que item esta adelante y atras
        //Todos los elementos tiene un puntero al anterior y siguiente elemento
        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Pera");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        frutas5.add("mango");

        for(String fruta : frutas4){
            System.out.println(fruta);
        }

        System.out.println("----------Array MAP-------------");
        //Se trabaja con una clave y valor
        //NO puede tener claves repetidas.
        //Solo puede tener un valor asociado a la clave
        Map<Integer, String> universidades = new HashMap<Integer, String>();
        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAEM");
        universidades.put(4, "EAM");
        universidades.put(5, "TESCO");

        System.out.println(universidades.get(3));

        for (Map.Entry universidad: universidades.entrySet()
             ) {
            System.out.println("Clave=" + universidad.getKey()
            + ",valor= " + universidad.getValue());
        }


    }
}
