/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day31December.com;

import java.util.*;

/**
 *
 * @author Supaada-q214
 */
public class Df {

    public static void main(String[] args) {
        Locale loc = new Locale.Builder().build();
        System.out.println(loc.getDisplayLanguage(new Locale("ENGLISH", "US")));
        System.out.println(loc.getDisplayCountry(new Locale("ENGLISH", "US")));
    }

}
