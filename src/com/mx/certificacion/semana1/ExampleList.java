/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana1;

import java.util.*;

/**
 *
 * @author Supaada-q214
 *
 * Un ArrayList si acepta duplicados.
 * 
 * Un LinkedList si acepta duplicados.
 */
public class ExampleList {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(1);
        lista.add(1);

        System.out.println("" + lista.toString());

        System.out.println("******************************");

        List<String> t = new LinkedList<>();
        t.add("A");
        t.add("A");
        t.add("A");

        System.out.println("" + t.toString());

    }

}
