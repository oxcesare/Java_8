/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examples.persistence;

/**
 *
 * @author Supaada-q214
 *
 * Clase que funcionara como Entity
 */
public class Order {

    private String id;
    private String order;
    private String customer;
    private int    sells;

  

    public Order() {
    }

    public Order(String id, String order, String customer) {
        this.id = id;
        this.order = order;
        this.customer = customer;
    }
    
    public int getSells() {
        return sells;
    }

    public void setSells(int sells) {
        this.sells = sells;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

}
