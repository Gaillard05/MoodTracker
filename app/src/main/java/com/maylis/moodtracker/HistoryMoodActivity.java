package com.maylis.moodtracker;







import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


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
    private boolean isComment;
    private Mood r;

   private int colorIndex;

    private int[] colorDrawableResID  = {
            R.color.faded_red,
            R.color.warm_grey,
            R.color.cornflower_blue_65,
            R.color.light_sage,
            R.color.banana_yellow,
            };

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_mood);

        colorIndex = 4;


        isComment = false;

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
        mYesterdays.setBackgroundResource(colorDrawableResID[colorIndex]);


        isComment = true;

        final Mood r = Storage.load(this, "mood");
        Log.d("HistoryMood", "Mood value:" + r.getMoodIndex());
        Log.d("HistoryMood", "Comment value:" + r.getComment());
        Log.d("HistoryMood", "date" + r.getDate());



        mButtonDialogYesterday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(isComment) {

                    String comment = "";
                    System.out.println( "" + r.getComment());

                    Toast.makeText(HistoryMoodActivity.this,comment + r.getComment(), Toast.LENGTH_SHORT).show();
                    isComment = true;

                    mButtonDialogYesterday.setVisibility(View.VISIBLE);


                } else {

                    Toast.makeText(HistoryMoodActivity.this,"" , Toast.LENGTH_SHORT).show();
                    isComment = false;

                    mButtonDialogBeforeYesterday.setVisibility(View.INVISIBLE);

                }
            }
        });

        mButtonDialogBeforeYesterday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(isComment){

                    Toast.makeText(HistoryMoodActivity.this, "" , Toast.LENGTH_SHORT).show();
                    isComment = false;

                    mButtonDialogBeforeYesterday.setVisibility(View.INVISIBLE);
                } else {

                    Toast.makeText(HistoryMoodActivity.this, "" + r.getComment() , Toast.LENGTH_SHORT).show();
                    isComment = true;

                    mButtonDialogBeforeYesterday.setVisibility(View.VISIBLE);
                }

            }
        });

        mButtonDialogThreeDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isComment){
                    Toast.makeText(HistoryMoodActivity.this, "" + r.getComment(), Toast.LENGTH_SHORT).show();
                    isComment = true;

                    mButtonDialogThreeDays.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(HistoryMoodActivity.this, "" , Toast.LENGTH_SHORT).show();
                    isComment = false;

                    mButtonDialogThreeDays.setVisibility(View.INVISIBLE);

                }
            }
        });

        mButtonDialogFourDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isComment){
                    Toast.makeText(HistoryMoodActivity.this, "" + r.getComment(), Toast.LENGTH_SHORT).show();
                    isComment = true;

                    mButtonDialogFourDays.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(HistoryMoodActivity.this, "" , Toast.LENGTH_SHORT).show();
                    isComment = false;

                    mButtonDialogFourDays.setVisibility(View.INVISIBLE);
                }
            }
        });

        mButtonDialogFiveDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isComment){
                    Toast.makeText(HistoryMoodActivity.this, "" + r.getComment(), Toast.LENGTH_SHORT).show();
                    isComment = true;

                    mButtonDialogFiveDays.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(HistoryMoodActivity.this, "" , Toast.LENGTH_SHORT).show();
                    isComment = false;

                    mButtonDialogFiveDays.setVisibility(View.INVISIBLE);
                }

            }
        });

        mButtonDialogSixDays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isComment){
                    Toast.makeText(HistoryMoodActivity.this, "" + r.getComment(), Toast.LENGTH_SHORT).show();
                    isComment = true;

                    mButtonDialogSixDays.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(HistoryMoodActivity.this, "", Toast.LENGTH_SHORT).show();
                    isComment = false;
                    mButtonDialogSixDays.setVisibility(View.INVISIBLE);

                }

            }
        });

        mButtonDialogWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isComment){
                    Toast.makeText(HistoryMoodActivity.this, "" + r.getComment(), Toast.LENGTH_SHORT).show();
                    isComment = true;
                    mButtonDialogWeek.setVisibility(View.VISIBLE);

                } else {
                    Toast.makeText(HistoryMoodActivity.this, "", Toast.LENGTH_SHORT).show();
                    isComment = false;
                    mButtonDialogWeek.setVisibility(View.INVISIBLE);

                }
            }
        });


    }
}













