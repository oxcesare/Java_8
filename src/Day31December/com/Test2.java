/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day31December.com;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Supaada-q214
 */
public class Test2 {

    public static void main(String[] args) {
        
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.replaceAll(i -> i / 2);
        
        System.out.println(ints.stream().distinct().count());
    }
}
