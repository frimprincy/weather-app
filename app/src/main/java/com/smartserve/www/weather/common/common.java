package com.smartserve.www.weather.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by PRINCE on 9/8/2018.
 */

public class common {
    public static String API_KEY ="4f32e73d2cd6445a04158a23b004d963";
    public static String API_LINK ="https://openweathermap.org/data/2.5/weather";


    public static String apiRequest( String lat, String lng){
      StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lng=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    public static String unixTimeStampToDateTime(double unixTimeStamp){
        DateFormat df = new SimpleDateFormat("HH:mm");
        Date Da = new Date();
        Da.setTime((long) unixTimeStamp*1000);
        return df.format(Da);


    }

    public static String getImage( String icon){
       return String.format("http://openweathermap.org/img/w/%s.png",icon);
    }

    public static String getDateNow(){
        DateFormat dateFormat =new SimpleDateFormat("dd MMM yyyy HH mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
