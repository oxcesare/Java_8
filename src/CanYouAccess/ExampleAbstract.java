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
public abstract class ExampleAbstract {
    
    /* Forma correcta de crear un objeto de una clase abstracta */
    public static void main(String[] args) {
        new ExampleAbstract() {
            @Override
            public void print(String... x) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };        
    }
    
    public abstract void print(String ...x);
    
    public void print (String s){
        System.out.println("Valido");
    }
    
}
