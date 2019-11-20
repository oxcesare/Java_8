/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8DictionariesandMaps;

import java.util.*;
import java.io.*;
import java.util.Map.Entry;

/**
 *
 * @author Supaada-q214
 *
 * 3
 * sam 99912222 tom 11122222 harry 12299933 sam edward harry
 */
public class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> mapNumbers = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            mapNumbers.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();
            if (mapNumbers.containsKey(s)) {
                System.out.println(s + "=" + mapNumbers.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
