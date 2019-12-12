/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4ClassvsInstance;

import java.io.*;
import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class Person {

    private int age; //Variable de clase 
                      //Variable de instancia cuando se crea el objeto a partir de una clase

    public Person(int initialAge) {
        if (initialAge > 0) {
            this.age = initialAge;
        } else {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }

    }

    public void amIOld() {
        if (age < 13) {
            System.out.println(" You are young.");
        } else if (age >= 13 & age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age = age + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
