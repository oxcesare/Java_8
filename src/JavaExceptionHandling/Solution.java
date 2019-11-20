/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExceptionHandling;

import java.util.Scanner;

class MyCalculator {

    /*
    * Create the method long power(int, int) here.
     */

    public int power(int a, int b) throws Exception {
        int calculo = 0;
        
        if(a<0||b<0){
            //System.out.println("n or p should not be negative");
            throw new Exception("n or p should not be negative");
        }        
        else if(a==0&b==0){
            //System.out.println("n and p should not be zero");
            throw new Exception("n and p should not be zero");
        }else {
            calculo = (int) Math.pow(a, b);
            System.out.println(calculo);
        }
        
        return calculo;

    }

}

public class Solution {

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
