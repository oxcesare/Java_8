/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examples.persistence;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Supaada-q214
 * 
 * Regresar todas las ordenes de clientes mediante operaciones terminales
 * y no terminales de Java 8 
 * 
 * return all orders of customers througth operation terminals and no terminals
 * of java 8 
 */
public class TestOrder {
    
    
    public static void main(String[] args) {
        
    
    }
    
    
    /**
     * 
     * @return 
     * 
     * Devolver una lista de ordenes con clientes cuyas ventas sean mayores a 10000
     */
    public List<Order> getOrders(){
        
        Order order = new Order();
        order.setId("1001");
        order.setCustomer("César");
        order.setOrder("2001");
        
        
        List<Order> orders = new ArrayList<>();
        orders.add(order);
        
        //orders.stream().map(alguna condición para agregar el resultado al map)
        
        return orders;
        
        
    }
}
