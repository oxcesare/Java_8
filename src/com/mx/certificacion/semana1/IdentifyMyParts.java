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
 */
public class IdentifyMyParts {

    public static int x = 7;
    public int y = 3;

    public static void main(String[] args) {
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 10;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        /**
         * Se queda con el ultimo valor que se agrego 
         */
      //  System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x); 
      
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      
        System.out.println(list.toString());
        
        list.stream().forEach(System.out::print);
        
      
      
    }
}
