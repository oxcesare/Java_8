/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day31December.com;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Supaada-q214
 */
public class ExampleLocalDate {
    
    
    public static void main(String[] args) {
        LocalDate Id = LocalDate.of(2010, 10, 10);
        int days = Id.lengthOfMonth();
        System.out.println(days);
    }
}
