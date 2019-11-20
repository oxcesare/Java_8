/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana1;

/**
 *
 * @author Supaada-q214
 */
public class Test4 {

    public static void main(String[] args) {

        int i = 20;
            String cadena = "SOSSOSSOS";
        String s = ""; //Cuenta la s 
        int lCadena = cadena.length();
        int contador = 0;

        /* Validar cadena */
        if (lCadena % 3 == 0) {
            System.out.println("Cadena Valida");
            char c = 'C';
            for (int j = 0; j < lCadena; j++) {
                c = cadena.charAt(j);
                //System.out.println(c);
                s = Character.toString(c);
                System.out.println(s);
                if (s.equals("S") || s.equals("O")) {

                } else {
                    contador++;
                }
            }
        }

        System.out.println("Cambios" + " " + contador);

        for (int j = 0; j < 19; j++) {
            if (j % 3 == 0) {
                //  System.out.println("Multiplo de 3" + " " + j);
            } else {
                // System.out.println("No Multiplo de 3" + " " + j);
            }
        }
    }

    public int cuentaS(String cadena, int longitud) {
        int s = 0;

        for (s = 0; s < longitud; s++) {

        }
        return s;
    }
}
