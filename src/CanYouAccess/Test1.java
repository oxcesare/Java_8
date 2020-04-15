/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CanYouAccess;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Supaada-q214
 */
public class Test1 {

    public static final String FECHA_TIMESTAMP = "yyyyMMddHHmmssSSS";

    public static void main(String[] args) {
        System.out.println("cratePaymentChannel"+ " " + cratePaymentChannel() );
    }

    public static String cratePaymentChannel() {
        return new SimpleDateFormat(FECHA_TIMESTAMP).format(new Date()).concat(String.format("%03d", new Random().nextInt(999)));
    }

}
