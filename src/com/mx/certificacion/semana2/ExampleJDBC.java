/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana2;

import java.sql.Connection; //Interface
import java.sql.DriverManager; //Clase 
import java.sql.ResultSet; //Interface
import java.sql.Statement; //Interface 
import java.sql.SQLException; //Clase 

/**
 *
 * @author Supaada-q214
 * 
 * Explicacion de la siguiente clase:
 * 
 * Se crea la conexion utilizando getConnection
 * 
 * Se esta utilizando un bloque try con la nueva implementacion para que cierre los recursos 
 * automaticamente.
 * 
 * Aplicamos setMaxRows el metodo recibe un int 
 * 
 * ejecutamos el query utlizando stmt.executeQuery 
 * 
 * y despues aplicamos al resultado el metodo absolute 
 * 
 * y a partir de ahí se puede empezar a obtener los valores que haya regresado el query
 * 
 * 
 * 
 */
public class ExampleJDBC {

    public static void main(String[] args) throws SQLException {
        Connection c;
        c = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app"); 
        try (Statement stmt = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);) {
            stmt.setMaxRows(5);
            ResultSet rs = stmt.executeQuery("select customer_id from customer order by customer_id");
            rs.absolute(5);
            if (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
