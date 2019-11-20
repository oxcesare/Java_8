/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana6;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Supaada-q214
 */
public class Valuator {
    public AtomicInteger status = new AtomicInteger();
    
    
    public void valuate(){
        int oldstatus = status.get();
        
        status.compareAndSet(oldstatus, oldstatus);
    }
    
    
}
