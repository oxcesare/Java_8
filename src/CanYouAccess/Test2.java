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
class A {
    
}
public class Test2 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class OtherExample implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/* Regresa un objecto del tipo Callable de la clase A  */
class OtherExample2 implements Callable<A> {

    @Override
    public A call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
