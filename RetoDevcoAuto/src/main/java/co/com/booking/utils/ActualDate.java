package co.com.booking.utils;

import java.text.SimpleDateFormat;

public class ActualDate {

    public ActualDate(){

    }

    public static String getActualDate(String format){
        SimpleDateFormat date = new SimpleDateFormat(format);
        return date.format(new java.util.Date());
    }
}
