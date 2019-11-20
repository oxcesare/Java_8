/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana2;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Supaada-q214
 * 
 * Cuando se extiende de una clase se tienen que sobreescribir
 * los métodos correspondientes. 
 * 
 * RecursiveTask<V> elemento 
 * 
 * y a su ves esta clase extiende extends ForkJoinTask<V>
 * 
 * Recibe un tipo primitivo como parametro 
 * y puede recibir un objeto 
 * 
 * y del tipo de dato que se le mande como parametro se crea el metodo compute
 * 
 * Basicamente esta clase funciona ejecutar un metodo de computo.
 * 
 * Si se necesita crear un ForkJoinTask que retorne un resultado.
 * 
 * 
 * 
 * 
 */

public class Test3 extends RecursiveTask<Test>{
    
    public static void main(String[] args) {
        
    }

    @Override
    protected Test compute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
