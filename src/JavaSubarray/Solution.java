/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSubarray;

import java.io.*;
import java.util.*;

/**
 *
 * 5
 * 1 -2 4 -5 1
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        int an = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            int sum = 0;
            for (int j = i; j >= 0; j--) {
                sum += a[j];
                if (sum < 0) {
                    an++;
                }
            }
        }
        System.out.println(an);

        scanner.close();

    }
}
