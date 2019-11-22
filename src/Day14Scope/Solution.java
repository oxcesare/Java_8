/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day14Scope;

import java.util.Scanner;

/**
 *
 * @author Supaada-q214
 *
 * 5
 * 8 19 3 2 7
 */
class Difference {

    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elementos) {
        this.elements = elementos;
    }

    void computeDifference() {

        /* Aqui va la logica  */
        int loElements = this.elements.length;
        int[] a = this.elements;
        int[] negativos = new int[100];

        int dif = 0;
        int pNegativos=0;
        for (int i = 0; i < loElements; i++) {
            int x = a[i];            
            for (int j = 1; j < loElements; j++,pNegativos++) {                
                dif = x - a[j];                
                /* Solo meto los negativos */                
                if (dif < 0) {
                    negativos[pNegativos] = Math.abs(dif);
                }else{
                    negativos[pNegativos] = Math.abs(dif);
                }
            }
        }

        /* Recorro los elementos del arreglo de negativos */
        int max = java.util.Arrays.stream(negativos)
                .max()
                .getAsInt();

        this.maximumDifference = max;

    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
