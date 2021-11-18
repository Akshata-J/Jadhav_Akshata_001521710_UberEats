/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 *
 * @author akshatajadhav
 */
public class Utils {

    public static Date dateFromString(String dateAsString){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false);
        Date date = null;
        try{
            date = sdf.parse(dateAsString);
            if(date.after(new Date())){
                date = null;
            }
        }catch(Exception e){
            
        }
        return date;
    }
    
    public static Long phoneNoFromString(String phoneNumber){
        Long ph = null;
        try{
            ph=Long.parseLong(phoneNumber);
        }catch(Exception e){
            
        }
        return ph;
    }
    
    public static Double doubleFromString(String no){
        Double number = null;
        try{
            number=Double.parseDouble(no);
        }catch(Exception e){
            
        }
        return number;
    }
    public static int ageCalculator(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate birthday = zone.toLocalDate();
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return period.getYears();
    }
    
    public static void copyToClipboard(Object s){
        StringSelection selection = new StringSelection(String.valueOf(s));
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
    
}
