/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 */
public class TestStream {

    public TestStream() {
        
    }
    
    public static void main(String[] args) {
        Persona obj1 = new Persona("Cesar","Xalapa", 32);
        Persona obj2 = new Persona("Julio","Xalapa", 26);
        Persona obj3 = new Persona("Lupita","Xalapa",56);
        Persona obj4 = new Persona("Gilberto","NJ", 56);
        
        List<Persona> listPersona = new ArrayList<>();
        listPersona.add(obj1);
        listPersona.add(obj2);
        listPersona.add(obj3);
        listPersona.add(obj4);
        
        Stream<Double> stream = Stream.of(14.4,15.4,16.4,17.4);
        Optional<Double> x  = stream.findAny();
        //System.out.println(""+x.isPresent());
        
        listPersona.stream().forEach(System.out::println);
        
    }
}
