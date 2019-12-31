/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day31December.com;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Supaada-q214
 */
public class Test3 {
    
    public static void main(String[] args) {
        String [] s = new String [2];
        s[0]="DD";
        s[1]="B";
        
        ConcurrentHashMap cmap = new ConcurrentHashMap();
        cmap.put("A", new Integer(1));
        cmap.put(s[0], new Integer(2));
        cmap.put("C", 3);
        cmap.putIfAbsent("D", new Integer(4));
        System.out.println(cmap);
    }
    
}
