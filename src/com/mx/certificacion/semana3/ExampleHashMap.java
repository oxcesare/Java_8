/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Supaada-q214
 */
public class ExampleHashMap {
    
    
    public static void main(String[] args) {
        
        Map<String, List<String>> stateCitiesMap = new HashMap<>();
        
         List<String> cities = new ArrayList<>();         
         cities.add("New York");         
         cities.add("Albany");         
         stateCitiesMap.put("NY", cities);
         
         
    }
    
    
    
}
