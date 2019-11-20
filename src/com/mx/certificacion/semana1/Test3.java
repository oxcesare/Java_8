/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana1;

/**
 *
 * @author Supaada-q214
 */
public class Test3 {
    
    static {
        System.out.println("Bloque Estatico");
    }
    
    public Test3(){
        System.out.println("Constructor");
    }
    
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        
    }
}
