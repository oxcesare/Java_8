/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaReflectionAttributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Supaada-q214
 */
class Student {

    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anothermethod() {
    }

}


public class Solution {

    public static void main(String[] args) {
        Student student = new Student();
        Method[] methods = student.getClass().getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();

        for (Method method : methods) {
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }

}
