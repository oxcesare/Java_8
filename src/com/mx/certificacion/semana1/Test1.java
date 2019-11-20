/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana1;

/**
 *
 * @author Supaada-q214
 * 
 * Clase test1 que invoca dos veces el metodo 
 * "method" cuando se tiene un throw new Exception(), se ejecuta una nueva 
 * instancia relacionada con la exception. 
 */
public class Test1 {

    static String j = "";

    public static void method(int i) {
        try {
            if (i == 2) {
                throw new Exception(); //Si se manda esta exception entonces se ejecuta inmediatamente el codigo catch
            }
            j += "1";
        } catch (Exception e) {
            j += "2";
            return;
        } finally {
            j += "3";
        }
        j += "4";  //Este fragmento de codigo no entra del codigo de finally 
    }

    public static void main(String args[]) {
        method(2);      
        System.out.println(j);
    }
}
