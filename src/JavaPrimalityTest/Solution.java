/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPrimalityTest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Supaada-q214 4901971054862853523
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String input = scanner.nextLine();
        BigInteger val = new BigInteger(input);
        BigInteger bigIntegerStr = new BigInteger(input);
        int certainty = bigIntegerStr.intValue();
        
        
        boolean result = val.isProbablePrime(100);
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}
