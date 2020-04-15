/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4ClassvsInstance;

/**
 *
 * @author Supaada-q214
 */
public class ExampleMethod {

    public static void main(String[] args) {

    }

    public static <X extends Number> X methodExampleTwo(X number) {
        X result = number;

        return result;
    }

    static <X extends Number> X doSomething(X number) {
        X result = number;
        //do something with result
        return result;
    }

}
