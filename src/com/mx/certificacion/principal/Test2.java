/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.principal;

/**
 *
 * @author Supaada-q214
 */
public class Test2 {
    
    public static void main(String[] args) {
        int x=5,j=0;
        OUTER: for(int i=0; i<3;)
            INNER: do{
            i++; x++;
                System.out.println(x);
            if(x>10) break INNER;
            x +=4;
                System.out.println("x"+x);
            j++;
        } 
            while(j<=2);
        System.out.println(x);        
    }
    
}
