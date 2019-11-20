/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana3;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

/**
 *
 * @author Supaada-q214
 */
class Printer {

    public void printArray(Object arry[]) {

        List<? extends Object> element = Arrays.asList(arry);

        for (Object object : element) {
            System.out.println(object);

        }
    }
}

public class Test2 {

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray")) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("Method overloading is not allowed!");
        }
    }

}
