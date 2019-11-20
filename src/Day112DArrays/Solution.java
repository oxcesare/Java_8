/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day112DArrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        /* Filas */
//        for (int i = 0; i < 3; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            /*Columnas*/
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
        int[][] arr = new int[6][6];

        arr[0][0] =1; arr[0][1] =1; arr[0][2] =1; arr[0][3] =0; arr[0][4] =0; arr[0][5] =0;
        arr[1][0] =0; arr[1][1] =1; arr[1][2] =0; arr[1][3] =0; arr[1][4] =0; arr[1][5] =0;
        arr[2][0] =1; arr[2][1] =1; arr[2][2] =1; arr[2][3] =0; arr[2][4] =0; arr[2][5] =0;
        arr[3][0] =0; arr[3][1] =0; arr[3][2] =2; arr[3][3] =4; arr[3][4] =4; arr[3][5] =0;
        arr[4][0] =0; arr[4][1] =0; arr[4][2] =0; arr[4][3] =2; arr[4][4] =0; arr[4][5] =0;
        arr[5][0] =0; arr[5][1] =0; arr[5][2] =1; arr[5][3] =2; arr[5][4] =4; arr[5][5] =0;

        /* Llamo al metodo que cuente los relojes de Area */
        //relojsArena(arr);
        otroReloj(arr);

        /* */
        scanner.close();
    }

    public static int otroReloj(int[][] arr) {
        int sum[] = new int[16];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[h] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];
                h++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);

        return sum[15];
    }

    public static int relojsArena(int[][] arr) {

        int sumTotal = 0;
        int[][] arrAre = new int[3][3];
        int t = 0;
        int x = 3;

        System.out.println("longutd" + arr.length);
        for (int d = 0; d < arr.length; t++, x++, d++) {
            for (int i = 0; i < 5; i++) {
                for (int j = t; j < x; j++) {
                    arrAre[i][j] = arr[i][j];
                }
            }
        }

        return sumTotal;
    }

}
