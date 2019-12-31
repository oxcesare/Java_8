/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanYouAccess;

/**
 *
 * @author Supaada-q214
 * 
 * No se pueden crear funciones internas 
 * en invocaciones de clases abstractas
 */
public class Whizlab {
    
    public static void main(String[] args) {
        ExampleAbstract test = (String ... x)-> System.out.println(x[1]);
    }
}
