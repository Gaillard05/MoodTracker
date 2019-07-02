package com.maylis.moodtracker;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Created by Maylis Gaillard on 18/06/2019.
 */
public class ManageDateMood {

    private Date mDate;
    private Date Convert;

    public ManageDateMood() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 18);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.YEAR, 2019);
        mDate = calendar.getTime();
    }

    public static String Convert() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String date = sdf.format(new Date());
        System.out.println(date); //18/06/2019
        return date;
    }

    public Date getDate() {
        return mDate;
    }

    public static Date day(Mood r) {
        String day = "01-07-2019";
        System.out.println(day + r.getDate());
        String strDate = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();

        }

        return date;
    }

    public static Calendar calendar() {
        Calendar calTmp = Calendar.getInstance();
        Calendar calToday = new GregorianCalendar();
        calToday.set(Calendar.YEAR, calTmp.get(Calendar.YEAR));
        calToday.set(Calendar.MONTH, calTmp.get(Calendar.MONTH));
        calToday.set(Calendar.DAY_OF_MONTH, calTmp.get(Calendar.DAY_OF_MONTH));

        return calToday;
    }
}