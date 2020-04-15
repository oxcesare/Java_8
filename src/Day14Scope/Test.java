/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day14Scope;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Supaada-q214
 */
public class Test {

    public static void main(String[] args) throws Exception {
        strDateToXMLGregorianCalendarFormat(new Date(), "YYYY-MM-dd'T'HH:mm:ss.S");
    }

    public static XMLGregorianCalendar strDateToXMLGregorianCalendarFormat(Date ttDate, String tsFormat) throws Exception {
        SimpleDateFormat loFormatter = new SimpleDateFormat(tsFormat);
        loFormatter.setLenient(false);
        GregorianCalendar laCalendar = new GregorianCalendar();
        laCalendar.setTime(ttDate);
        XMLGregorianCalendar laXmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(laCalendar);
        
        System.out.println("laXmlGregorianCalendar\t"+laXmlGregorianCalendar);
        return laXmlGregorianCalendar;
    }

    //2020-01-28T17:13:47.037-06:00
    //2019-05-04T16:45:05.123
    
}
