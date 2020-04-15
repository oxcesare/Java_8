/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanYouAccess;

/**
 *
 * @author Supaada-q214
 */
class Course {

    String courseName;

    Course() {

        /**
         * Esto ya lo hace
         */
        Course c = new Course();
        c.courseName = "Oracle";
    }
}

class EJavaGuruPrivate {

    public static void main(String args[]) {
        Course c = new Course();
        c.courseName = "Java";
        System.out.println(c.courseName);
    }
}
