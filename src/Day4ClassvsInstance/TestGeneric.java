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
public class TestGeneric {
    
    public static void main(String[] args) {
        
        Integer valor=10;
        MyListGeneric<Integer> num = new MyListGeneric<>();        
        System.out.println(num.toString());                
    }
    
}
