package com.maylis.moodtracker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Maylis Gaillard on 18/06/2019.
 */
public class ManageDateMood {

    private String date;

    public void convertDateToString() {

        // create Calendar date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

        Calendar calendar = new GregorianCalendar(2019, 6, 18);
        System.out.println("#6. " + sdf.format(calendar.getTime()));

        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 18);

        // Convert Date in String
        String date = sdf.format(new Date());
        System.out.println(date); //18/06/2019
    }
}
