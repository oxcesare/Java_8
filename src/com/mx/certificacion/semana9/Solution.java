/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.certificacion.semana9;

import java.util.Scanner;

/**
 *
 * @author Supaada-q214
 */
public class Solution {

   static boolean isAnagram(String cadenaUno, String cadenaDos) {
        String res = "";
        boolean valiAnagram=false;

        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0,
                i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0,
                t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;

        int aa = 0, bb = 0, cc = 0, dd = 0, ee = 0, ff = 0, gg = 0, hh = 0,
                ii = 0, jj = 0, kk = 0, ll = 0, mm = 0, nn = 0, oo = 0, pp = 0, qq = 0, rr = 0, ss = 0,
                tt = 0, uu = 0, vv = 0, ww = 0, xx = 0, yy = 0, zz = 0;

        for (int ca = 0; ca < cadenaUno.length(); ca++) {
            char v1 = cadenaUno.charAt(ca);
            String d1 = String.valueOf(v1).toLowerCase();
            
            if (d1.equals("a")) {
                a++;
            } else if (d1.equals("b")) {
                b++;
            } else if (d1.equals("c")) {
                c++;
            } else if (d1.equals("d")) {
                d++;
            } else if (d1.equals("e")) {
                e++;
            } else if (d1.equals("f")) {
                f++;
            } else if (d1.equals("g")) {
                g++;
            } else if (d1.equals("h")) {               
                h++;
            } else if (d1.equals("i")) {
                i++;
            } else if (d1.equals("j")) {
                j++;
            } else if (d1.equals("k")) {
                k++;
            } else if (d1.equals("l")) {
                l++;
            } else if (d1.equals("m")) {
                m++;
            } else if (d1.equals("n")) {
                n++;
            } else if (d1.equals("o")) {
                o++;
            } else if (d1.equals("p")) {
                p++;
            } else if (d1.equals("q")) {
                q++;
            } else if (d1.equals("r")) {
                r++;
            } else if (d1.equals("s")) {
                s++;
            } else if (d1.equals("t")) {
                t++;
            } else if (d1.equals("u")) {
                u++;
            } else if (d1.equals("v")) {
                v++;
            } else if (d1.equals("w")) {
                w++;
            } else if (d1.equals("x")) {
                x++;
            } else if (d1.equals("y")) {
                y++;
            } else if (d1.equals("z")) {
                z++;
            }

        } //Primer For
        
        /* Segundo For */
         for (int ca = 0; ca < cadenaDos.length(); ca++) {
            char v1 = cadenaDos.charAt(ca);
            String d1 = String.valueOf(v1);
            
            if (d1.equals("a")) {
                aa++;
            } else if (d1.equals("b")) {
                bb++;
            } else if (d1.equals("c")) {
                cc++;
            } else if (d1.equals("d")) {
                dd++;
            } else if (d1.equals("e")) {
                ee++;
            } else if (d1.equals("f")) {
                ff++;
            } else if (d1.equals("g")) {
                gg++;
            } else if (d1.equals("h")) {
                hh++;
            } else if (d1.equals("i")) {
                i++;
            } else if (d1.equals("j")) {
                jj++;
            } else if (d1.equals("k")) {
                kk++;
            } else if (d1.equals("l")) {
                ll++;
            } else if (d1.equals("m")) {
                mm++;
            } else if (d1.equals("n")) {
                nn++;
            } else if (d1.equals("o")) {
                oo++;
            } else if (d1.equals("p")) {
                pp++;
            } else if (d1.equals("q")) {
                qq++;
            } else if (d1.equals("r")) {
                rr++;
            } else if (d1.equals("s")) {
                ss++;
            } else if (d1.equals("t")) {
                tt++;
            } else if (d1.equals("u")) {
                uu++;
            } else if (d1.equals("v")) {
                vv++;
            } else if (d1.equals("w")) {
                ww++;
            } else if (d1.equals("x")) {
                xx++;
            } else if (d1.equals("y")) {
                yy++;
            } else if (d1.equals("z")) {
                zz++;
            }

        } //Primer For
         
         if(a==aa&b==bb&&c==cc&&d==dd&&e==ee&&f==ff&&g==gg&&h==hh&&i==ii
                 &&j==jj&&k==kk&&l==ll&&m==mm&&n==nn&&o==oo&&p==pp
                 &&q==qq&&r==rr&&s==ss&&t==tt&&u==uu&&v==vv&&w==ww
                 &&x==xx&&y==yy&&z==zz){
             valiAnagram=true;
         }
  
        return valiAnagram;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "Hello"; //scan.next();
        String b = "hello"; //scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");


    }

    public static String[] createArray() {
        char[] s;
        String[] arr = new String[26];
        s = new char[26];
        for (int i = 0; i < 26; i++) {
            s[i] = (char) ('A' + i);
            arr[i] = String.valueOf(s[i]).toLowerCase();
        }
        return arr;
    }

    public static String cuentaLetras(String cadenaUno, String cadenaDos) {
        String res = "";
        int longCadenaUno = cadenaUno.length();
        boolean valiAnagram=false;

        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0,
                i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0,
                t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;

        int aa = 0, bb = 0, cc = 0, dd = 0, ee = 0, ff = 0, gg = 0, hh = 0,
                ii = 0, jj = 0, kk = 0, ll = 0, mm = 0, nn = 0, oo = 0, pp = 0, qq = 0, rr = 0, ss = 0,
                tt = 0, uu = 0, vv = 0, ww = 0, xx = 0, yy = 0, zz = 0;

        for (int ca = 0; ca < cadenaUno.length(); ca++) {
            char v1 = cadenaUno.charAt(ca);
            String d1 = String.valueOf(v1).toLowerCase();
            System.out.println("d1"+d1);
            if (d1.equals("a")) {
                System.out.println("d1"+d1);
                a++;
            } else if (d1.equals("b")) {
                b++;
            } else if (d1.equals("c")) {
                c++;
            } else if (d1.equals("d")) {
                d++;
            } else if (d1.equals("e")) {
                e++;
            } else if (d1.equals("f")) {
                f++;
            } else if (d1.equals("g")) {
                g++;
            } else if (d1.toLowerCase().equals("h")) {
                System.out.println(""+d1.toLowerCase());
                h++;
            } else if (d1.equals("i")) {
                i++;
            } else if (d1.equals("j")) {
                j++;
            } else if (d1.equals("k")) {
                k++;
            } else if (d1.equals("l")) {
                l++;
            } else if (d1.equals("m")) {
                m++;
            } else if (d1.equals("n")) {
                n++;
            } else if (d1.equals("o")) {
                o++;
            } else if (d1.equals("p")) {
                p++;
            } else if (d1.equals("q")) {
                q++;
            } else if (d1.equals("r")) {
                r++;
            } else if (d1.equals("s")) {
                s++;
            } else if (d1.equals("t")) {
                t++;
            } else if (d1.equals("u")) {
                u++;
            } else if (d1.equals("v")) {
                v++;
            } else if (d1.equals("w")) {
                w++;
            } else if (d1.equals("x")) {
                x++;
            } else if (d1.equals("y")) {
                y++;
            } else if (d1.equals("z")) {
                z++;
            }

        } //Primer For
        
        /* Segundo For */
         for (int ca = 0; ca < cadenaDos.length(); ca++) {
            char v1 = cadenaDos.charAt(ca);
            String d1 = String.valueOf(v1);
            
            if (d1.equals("a")) {
                aa++;
            } else if (d1.equals("b")) {
                bb++;
            } else if (d1.equals("c")) {
                cc++;
            } else if (d1.equals("d")) {
                dd++;
            } else if (d1.equals("e")) {
                ee++;
            } else if (d1.equals("f")) {
                ff++;
            } else if (d1.equals("g")) {
                gg++;
            } else if (d1.equals("h")) {
                hh++;
            } else if (d1.equals("i")) {
                i++;
            } else if (d1.equals("j")) {
                jj++;
            } else if (d1.equals("k")) {
                kk++;
            } else if (d1.equals("l")) {
                ll++;
            } else if (d1.equals("m")) {
                mm++;
            } else if (d1.equals("n")) {
                nn++;
            } else if (d1.equals("o")) {
                oo++;
            } else if (d1.equals("p")) {
                pp++;
            } else if (d1.equals("q")) {
                qq++;
            } else if (d1.equals("r")) {
                rr++;
            } else if (d1.equals("s")) {
                ss++;
            } else if (d1.equals("t")) {
                tt++;
            } else if (d1.equals("u")) {
                uu++;
            } else if (d1.equals("v")) {
                vv++;
            } else if (d1.equals("w")) {
                ww++;
            } else if (d1.equals("x")) {
                xx++;
            } else if (d1.equals("y")) {
                yy++;
            } else if (d1.equals("z")) {
                zz++;
            }

        } //Segundo For
         
         if(a==aa&b==bb&&c==cc&&d==dd&&e==ee&&f==ff&&g==gg&&h==hh&&i==ii
                 &&j==jj&&k==kk&&l==ll&&m==mm&&n==nn&&o==oo&&p==pp
                 &&q==qq&&r==rr&&s==ss&&t==tt&&u==uu&&v==vv&&w==ww
                 &&x==xx&&y==yy&&z==zz){
             valiAnagram=true;
         }
  
        return res;
    }
}
