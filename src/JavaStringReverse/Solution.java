/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStringReverse;

import java.util.Scanner;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = "sdfsdfsdff";//sc.next();
        String arr1[] = new String[A.length()];
        String arr2[] = new String[A.length()];
        boolean vCadena = false;

        for (int i = A.length() - 1, j = 0; j < A.length(); i--, j++) {
            char cReves = A.charAt(i);
            String sReves = String.valueOf(cReves);

            
            char cDerecho = A.charAt(j);
            String sDerecho = String.valueOf(cDerecho);
            
            

            if (sReves.equals(sDerecho)) {
                vCadena = true;
            }else{
                vCadena =false;
                break;
            }

        }
        
        if(vCadena){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
