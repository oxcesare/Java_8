/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day20Sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        optimizedBubbleSort(a);
    }

    public static int ordenaBurbuja(int[] arr) {
        int n = arr.length;
        int i = 0;
        int sWaps = 0;
        int[] b = new int[n];
        for (int j = 1, g = 0; j < n - i; j++, g++) {
            System.out.println("j" + "" + j);
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                System.out.println("valor ejecutandose intercambio " + " " + arr[j - 1]);
                sWaps++;
            } else {
                System.out.println("valor ejecutandose no intercambio " + " " + arr[j - 1]);
            }
        }

        for (int j = 0; j < b.length; j++) {
            //System.out.println("Nuevo arreglo"+" " + b[j]);
        }

        //System.out.println("Numero de permutas"+" " + sWaps);
        return sWaps;
    }

    public static void optimizedBubbleSort(int[] arr) {
        int i = 0, n = arr.length;
        boolean swapNeeded = true;
        int sWaps = 0;
        while (i < n - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    sWaps++;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }

        int m = arr.length;
        System.out.println("Array is sorted in" + " " + sWaps + " swaps.");
        System.out.println("First Element:" + " " + arr[0]);
        System.out.println("Last Element:" + " " + arr[m - 1]);
    }

}
