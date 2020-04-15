/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana3;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Supaada-q214
 * 
 * El metodo binarySearch busca un elemento 
 * dentro de un arreglo utilizando el metodo compare.
 * 
 * La clase MyStrinComparator debe de implementar Comparator para
 * poder usar uso de este metodo.
 *  
 */
public class MyStringComparator implements Comparable<Object> {
    
    static String[] sa = { "d", "bbb", "aaaa" }; 

    public int compare(Object o1, Object o2) {
        int s1 = ((String) o1).length();
        int s2 = ((String) o2).length();
        return s1 - s2;
    }
    
    public static void main(String[] args) {
        Arrays.binarySearch(sa, "cc", new MyStringComparator()); 
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
