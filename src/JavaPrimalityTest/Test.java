/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPrimalityTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.*;

/**
 *
 * @author Supaada-q214
 */
public class Test {
    
    public static void main(String[] args) {
        Stream<String> s = Stream.of("mA", "MB", "C", "D");
        s.filter(x -> x.startsWith("M".toLowerCase())).forEach(System.out::println);
        
        System.out.println("*******************************************");
        
        exampleCollections();
    }
    
    public static void exampleCollections() {
        Stream<String> s = Stream.of("mA", "mB", "mC", "mD", "mC", "mD");
        /* Para guardarlo en un TreeMap */
        TreeSet<String> result = s.collect(Collectors.toCollection(TreeSet::new));
        result.stream().forEach(System.out::println);
        
        /* Para guardarlo en un TreeMap */
        List<String> result2 =  s.collect(Collectors.toCollection(ArrayList::new));
        
        //Map<String, String> = s.collect(Collectors.toConcurrentMap("", ""));
        
    }
}
