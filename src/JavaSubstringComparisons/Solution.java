/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSubstringComparisons;

import java.util.Scanner;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String cadSub = "";
        String arr[] = new String[s.length() - k + 1];
        int jj = k;

        /* Recorrer la cadena, y meter */
        for (int ii = 0; ii < s.length() - k + 1; ii++) {
            cadSub = s.substring(ii, jj++);
            arr[ii] = cadSub;
        }
        int n = arr.length; //Longitud del arreglo creado

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int longFinal = arr.length;
        smallest = arr[0];
        largest = arr[longFinal - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = 3;
        scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
