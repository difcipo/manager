package com.cai.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getDate(String f){
        SimpleDateFormat dateFormat = new SimpleDateFormat(f);
        Date date = new Date();
        String format = dateFormat.format(date);
        return format;
    }
}
