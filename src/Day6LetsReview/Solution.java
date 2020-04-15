/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6LetsReview;

/**
 *
 * @author Supaada-q214
 */
import java.util.*;

public class Solution {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        String c = "";

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            for (int j = 0; j < a.length(); j++) {
                if (j % 2 == 0) {
                    c = a.substring(j, j + 1);
                    System.out.print(c);
                }
            }
            System.out.print(" ");
            for (int k = 0; k < a.length(); k++) {
                if (k % 2 != 0) {
                    c = a.substring(k, k + 1);
                    System.out.print(c);
                }

            }
            System.out.println("");

        }

        sc.close();

    }
}
