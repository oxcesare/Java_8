/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanYouAccess;

import java.util.concurrent.Callable;

/**
 *
 * @author Supaada-q214
 */
public class Test implements Callable<String> {
    public static void main(String[] args) {
        
    
    }
    
    /* Metodo para regresar un future y este future el del tipo que definimos que regrese
    en este caso un String */
    @Override
    public String call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
