/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Supaada-q214
 */
public class Test2 {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        
        /*
         Método que simula la implementación de un log (peek)
        */
        list.stream().peek(System.out::print).parallel().forEach(System.out::print);
    }    
}
