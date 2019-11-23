/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaList;

import java.io.*;
import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            String operacion = sc.next();
            if (operacion.equals("Insert")) {
                int posicion = sc.nextInt();
                int valor = sc.nextInt();
                mylist.add(posicion, valor);
            } else if (operacion.equals("Delete")) {
                int posicion = sc.nextInt();
                mylist.remove(posicion);
            }
        }

        for (Object object : mylist) {
            System.out.println(object);
        }

    }
}
