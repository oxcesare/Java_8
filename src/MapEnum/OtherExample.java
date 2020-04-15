/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapEnum;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 */
public class OtherExample {
    
    public static void main(String[] args) {
        
        //Stream<String> ohMy = Stream.of("Lions2","tigers2","bears2");
        //Map<Integer,String> map = ohMy.collect(Collectors.toMap(String::length,k -> k));
        
        /*
        Stream<String> ohMy2 = Stream.of("Lions","tigers","bears");
        TreeMap<Integer,Set<String>> map2 = ohMy2.collect
        (Collectors.groupingBy(String::length,TreeMap::new, Collectors.toSet()));
        System.out.println("map2"+ " " + map2.toString());
         */
        
        /**
         * Partitioning es un caso especial de groupingBy
         * devuelve true o false
         * 
         */
        Stream<String> ohMy2 = Stream.of("Lions","tigers","bears");
        Map<Boolean,List<String>> map = ohMy2.collect(Collectors.partitioningBy(s -> s.length()<=5));
        System.out.println("map"+" "+map);
        
    }
    
}
