/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.principal;

/**
 *
 * @author Supaada-q214
 */
public class Persona {
    
    private String name;
    private String dirreccion;
    private int    edad;

    public Persona(String name, String dirreccion, int edad) {
        this.name = name;
        this.dirreccion = dirreccion;
        this.edad = edad;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", dirreccion=" + dirreccion + ", edad=" + edad + '}';
    }
    
}
