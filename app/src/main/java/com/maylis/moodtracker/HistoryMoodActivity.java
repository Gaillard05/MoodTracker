package com.maylis.moodtracker;







import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class HistoryMoodActivity extends AppCompatActivity {


    private TextView mWeek;
    private TextView mSixDays;
    private TextView mFiveDays;
    private TextView mFourDays;
    private TextView mThreeDays;
    private TextView mBeforeYesterdays;
    private TextView mYesterdays;


    private Button mButtonDialogWeek;
    private Button mButtonDialogSixDays;
    private Button mButtonDialogFiveDays;
    private Button mButtonDialogFourDays;
    private Button mButtonDialogThreeDays;
    private Button mButtonDialogBeforeYesterday;
    private Button mButtonDialogYesterday;
    private Mood r;


    private int[] colorDrawableResID = {
            R.color.faded_red,
            R.color.warm_grey,
            R.color.cornflower_blue_65,
            R.color.light_sage,
            R.color.banana_yellow,
            };

    private static String day(Mood r) {
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

        return day;
    }


    private static void recoveryDate(Context context, Mood mood, Mood r) {
        SharedPreferences mPreferences = context.getSharedPreferences(r.getDate(), MODE_PRIVATE);
        mPreferences.edit().putString("date:", r.getDate()).apply();

    }

    private void calendar() {
        Calendar calTmp = Calendar.getInstance();
        Calendar calToday = new GregorianCalendar();
        calToday.set(Calendar.YEAR, calTmp.get(Calendar.YEAR));
        calToday.set(Calendar.MONTH, calTmp.get(Calendar.MONTH));
        calToday.set(Calendar.DAY_OF_MONTH, calTmp.get(Calendar.DAY_OF_MONTH));
    }

    private int calculationDate;
    private long CONST_DURATION_OF_DAY;


    // private int calculationDate() {

    //     long CONST_DURATION_OF_DAY = 1000 * 60 * 60 * 24;
// Difference
    //    long diff = Math.abs(.getTime() - .getTime());
    //    long numberOfDay = (long) diff / CONST_DURATION_OF_DAY;
    //    System.err.println("Le nombre de jour est : " + numberOfDay);
    // }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_mood);

        r = Storage.load(this, "mood");
        Log.d("HistoryMood", "Mood value:" + r.getMoodIndex());
        Log.d("HistoryMood", "Comment value:" + r.getComment());
        Log.d("HistoryMood", "date:" + r.getDate());


        mWeek = (TextView) findViewById(R.id.activity_history_mood_week_txt);
        mButtonDialogWeek = (Button) findViewById(R.id.activity_history_mood_week_dialog_btn);
        mButtonDialogWeek.setVisibility(View.INVISIBLE);

        mSixDays = (TextView) findViewById(R.id.activity_history_mood_6days_txt);
        mButtonDialogSixDays = (Button) findViewById(R.id.activity_history_mood_6days_dialog_btn);
        mButtonDialogSixDays.setVisibility(View.INVISIBLE);

        mFiveDays = (TextView) findViewById(R.id.activity_history_mood_5days_txt);
        mButtonDialogFiveDays = (Button) findViewById(R.id.activity_history_mood_5days_dialog_btn);
        mButtonDialogFiveDays.setVisibility(View.INVISIBLE);

        mFourDays = (TextView) findViewById(R.id.activity_history_mood_4days_txt);
        mButtonDialogFourDays = (Button) findViewById(R.id.activity_history_mood_4days_dialog_btn);
        mButtonDialogFourDays.setVisibility(View.INVISIBLE);

        mThreeDays = (TextView) findViewById(R.id.activity_history_mood_3days_txt);
        mButtonDialogThreeDays = (Button) findViewById(R.id.activity_history_mood_3days_dialog_btn);
        mButtonDialogThreeDays.setVisibility(View.INVISIBLE);

        mBeforeYesterdays = (TextView) findViewById(R.id.activity_history_mood_before_yesterday_txt);
        mButtonDialogBeforeYesterday = (Button) findViewById(R.id.activity_history_mood_before_yesterday_dialog_btn);
        mButtonDialogBeforeYesterday.setVisibility(View.INVISIBLE);


        mYesterdays = (TextView) findViewById(R.id.activity_history_mood_yesterday_txt);
        mButtonDialogYesterday = (Button) findViewById(R.id.activity_history_mood_yesterday_dialog_btn);
        mYesterdays.setBackgroundResource(colorDrawableResID[r.getMoodIndex()]);
        if (r.getComment().isEmpty()) {
            mButtonDialogYesterday.setVisibility(View.INVISIBLE);
        } else {
            mButtonDialogYesterday.setVisibility(View.VISIBLE);


            mButtonDialogYesterday.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String comment = "";
                    System.out.println("" + r.getComment());

                    Toast.makeText(HistoryMoodActivity.this, comment + r.getComment(), Toast.LENGTH_SHORT).show();


                }
            });

            mButtonDialogBeforeYesterday.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });

            mButtonDialogThreeDays.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            mButtonDialogFourDays.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            mButtonDialogFiveDays.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });

            mButtonDialogSixDays.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });

            mButtonDialogWeek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });
        }

    }
}