/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaArraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        /*Arreglo de listas*/
        ArrayList<Integer>[] listas = new ArrayList[n];

        /* Construyo mis listas */
        for (int i = 0; i < n; i++) {
            listas[i] = new ArrayList<Integer>();
            int elementos = scanner.nextInt();
            for (int j = 0; j < elementos; j++) {
                int x = scanner.nextInt();
                listas[i].add(x);
            }
        }

        /* Número de busquedas */
        int a = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < a; i++) {
            int lis = scanner.nextInt() - 1;
            int ele = scanner.nextInt() - 1;
            if (listas[lis].size() > 0 && ele < listas[lis].size()) {
                if (listas[lis].get(ele) != null) {
                    System.out.println(listas[lis].get(ele));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }

        }

    }
}
