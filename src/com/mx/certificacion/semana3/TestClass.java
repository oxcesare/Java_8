/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana3;
import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class TestClass {

    public static void main(String[] args) {
    // put declaration here       
      Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>();  //2 and //3 are commented out.

        m.put("1", new ArrayList());    //1       
        //m.put(1, new Object());    //2       
        //m.put(1.0, "Hello");     //3       
        System.out.println(m);
    }
}
