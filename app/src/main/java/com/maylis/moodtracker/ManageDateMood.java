package com.maylis.moodtracker;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/**
 * Created by Maylis Gaillard on 18/06/2019.
 */
public class ManageDateMood {

    private Date mDate;
    private Date Convert;

    public ManageDateMood() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 24);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.YEAR, 2019);
        mDate = calendar.getTime();
    }

    public static String Convert() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String date = sdf.format(new Date());
        System.out.println(date); //24/06/2019
        return date;
    }

    public Date getDate() {
        return mDate;
    }
 }
