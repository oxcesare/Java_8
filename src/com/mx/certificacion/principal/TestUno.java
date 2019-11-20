/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.principal;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 */
public class TestUno {
    
    public static void main(String[] args) {
        Stream<Double> streamExample1 = Stream.of(2.2,2.3,2.5);
        
        Stream<String> streamExample2 = Stream.of("2.2","2.3","2.5");
        
        Stream<Integer> streamExample3 = Stream.of(2,3,4,5);
        
        Stream<Float> streamExample4 = Stream.of(2.2F,2.3F,2.5F);
        
        /*
        
         cuando se utiliza el método of de Stream 
         cada elemento utliza una posición 
        en este caso al ser 2.2 la posicion 0 es "2".
        */
        
        Stream<String> out = streamExample2.map((String s)-> s.substring(0,2));
        
        //Operacion terminal ForEach Aplicada a un stream
        out.forEach(System.out::print);
        
        System.out.println("***********************");
        ExampleUno();      
        
        System.out.println("***********************");
        ExampleDos();
    }
    
    /*
    Otra forma de crear un conjunto de datos muy similar a Stream<>
    */
    public static void ExampleUno(){
        IntStream ints = IntStream.of(7,5,3,4);
        System.out.print(ints.filter(e ->e>3).distinct().average().getAsDouble());
    }
    
    /**
     * Solo busca los elementos que hagan match con el tipo Number en cuanto uno no es 
     * ahi termina la ejecucción
     */
      public static void ExampleDos(){
        Stream stream = Stream.of(2,3,5);         
        boolean out = stream.allMatch(in -> in instanceof Number);         
        System.out.println("out"+ " " + out);        
    }
      
      
    /*
        Compila con error porque el metodo anyMatch regresa un booleano
      y se quiere asginar a Optional <String>.
     */
    public static void ExampleTres(){
        Stream<String> stream = Stream.of("2","3","5");         
       // Optional<String> out = stream.anyMatch(s -> s.length()>2);
       
    }
}
