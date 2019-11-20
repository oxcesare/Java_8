/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStringTokens;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "";// scan.nextLine();
        String arr[] = new String[s.length()];

        //[A-Za-z !,?._'@]+
        String str = "".trim();

        if (str.length() > 0) {
            String delims = "[!,?._'@]+";
            String[] tokens = str.split(delims);

            System.out.println(tokens.length);

            for (String token : tokens) {

                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }

        scan.close();
    }

}
