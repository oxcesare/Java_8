/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day7Arrays;

import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            System.out.println("Elementos " + arrItem);
            arr[i] = arrItem;
        }

        //Recorro el otro arreglo en orden inverso
        for (int i = arr.length - 1, j = 0; j < arr.length; i--, j++) {
            System.out.println(arr[i]);

        }

        scanner.close();

    }

}
