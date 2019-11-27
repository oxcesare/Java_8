/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day19Interfaces;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic {

    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

    public int divisorSum(int n) {
        int m = 0, sum = n;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {                
                m += i;
            }
        }
        
        sum = sum + m;
        
        return sum;
    }
}

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }

}
