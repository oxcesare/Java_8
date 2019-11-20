/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;

        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = a / b;
            throw new ArithmeticException("/ by zero");
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
        scanner.close();

    }
}
