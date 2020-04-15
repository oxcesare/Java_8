/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5Loops;

import java.util.*;


public class Example {

    public static void main(String[] args) {

        Map<String, String> list = new LinkedHashMap<>();
        list.put("A", "valor A");
        list.put("B", "valor B");
        list.put("C", "valor C");
        list.put("D", "valor D");

        for (Map.Entry<String, String> entry : list.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();

            System.out.println("key" + " " + key + " " + "val" + " " + val);
        }

    }

}
