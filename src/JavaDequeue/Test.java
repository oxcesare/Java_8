/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDequeue;

import java.util.*;

/**
 *
 * @author Supaada-q214
 *
 * 6 3
 * 5 3 5 2 3 2
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>(); //No acepta duplicados
        int n = in.nextInt(); //Numero total de Integer
        int m = in.nextInt(); //Elementos del SubArray

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[i] = num; //Meto los numeros en el arreglo
        }

        /* Recorro el arreglo */
        int[] arrMax = new int[arr.length];
        int auxF = n - 1;
        for (int i = 0; i < arr.length; i++) {

            /* arreglo para ir tomando de 3 en 3  */
            for (int k = i; k < m & m < auxF; k++) {
                System.out.println("k " + k);
            }
            m++;
            auxF--;

        }

        //List b = Arrays.asList(arrMax);
        //System.out.println(Collections.max(b).toString());
    }
}
