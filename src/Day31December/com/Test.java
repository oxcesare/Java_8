/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day31December.com;

/**
 *
 * @author Supaada-q214
 */
public class Test implements Changer<String>{
    
    
    public static void main(String[] args) {
        
    }

    @Override
    public String changer(String t) {
       Changer<String> fun = String::length;
       fun.changer("Cadena");
    }
}
