/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana7;

/**
 *
 * @author Supaada-q214
 */
public class TestAlumno {

    public static void main(String[] args) {

        Alumno c = new Alumno();
        c.setNombre("Lleva Valor");
        validaNull(c);

    }

    public static void validaNull(Alumno alumno) {
        if (alumno != null) {
            System.out.println("Alumno not null");
              if(alumno.getNombre()!=null){
                System.out.println("Diferente de Null");
            }
        }
    }

}
