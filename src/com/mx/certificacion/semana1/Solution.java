/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana1;

import java.util.*;
import java.io.*;

/**
 *
 * @author Supaada-q214
 * 
 *  2
    0 2 10
    5 3 5
 */
public class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); //Querys         
        int valorExp = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            valorExp = 0;

            int[] arr = new int[n];

            //for que hace los calculos
            for (int j = 0; j < n; j++) {
                valorExp = valorExp + (int) Math.pow(2, j);
                arr[j] = a + valorExp * b;
            }
            //For que imprime los valores 
            for (int k = 0; k < arr.length; k++) {
                System.out.print(" " + arr[k]);
            }
            System.out.print("\n");
        }
        in.close();
    }
}
