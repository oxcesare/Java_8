/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana7;

import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class TestMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf"); //Hoja

        String kinOf = map.get("koala");
        for (String key : map.keySet()) {
            System.out.println("key" + " " + key);
        }
    }

}
