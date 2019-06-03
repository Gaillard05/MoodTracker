package com.maylis.moodtracker;





import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {
    GestureDetector gestureDetector;

    private ConstraintLayout mColors;
    private ImageView mMoodHappy;
    private Button mCommentMood;
    private Button mHistoryMood;
    private MainActivity activity;



    private final Gson gson = new Gson();


    private int currentMoodIndex;
    private int currentColorIndex;

    private int[] moodDrawableResId = {
            R.drawable.smiley_sad,
            R.drawable.smiley_disappointed,
            R.drawable.smiley_normal,
            R.drawable.smiley_happy,
            R.drawable.smiley_super_happy,

            };
    private int[] backgroundColorsResId = {
            R.color.faded_red,
            R.color.warm_grey,
            R.color.cornflower_blue_65,
            R.color.light_sage,
            R.color.banana_yellow,

            };

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.activity = this;

        currentMoodIndex = 3;
        currentColorIndex = 3;


        gestureDetector = new GestureDetector(MainActivity.this, MainActivity.this);
        mColors = (ConstraintLayout) findViewById(R.id.activity_main_layout_colors);
        mMoodHappy = (ImageView) findViewById(R.id.activity_main_mood_happy_img);
        mCommentMood = (Button) findViewById(R.id.activity_main_comment_mood_btn);
        mHistoryMood = (Button) findViewById(R.id.activity_main_history_mood_btn);




        mCommentMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final MoodDialogActivity moodDialogActivity = new MoodDialogActivity(activity);
                moodDialogActivity.setComment();
                moodDialogActivity.setDialogComment();
                moodDialogActivity.getCancelButton().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "pas d'avis", Toast.LENGTH_LONG).show();
                        moodDialogActivity.dismiss();
                    }
                });
                moodDialogActivity.getValidateButton().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Mood mood = new Mood();
                        mood.setMoodIndex(currentMoodIndex);
                        mood.setComment(moodDialogActivity.getCurrentTextComment());
                        Gson gson = new Gson();
                        String moodJson = gson.toJson(mood);
                        moodDialogActivity.dismiss();

                    }
                });
                moodDialogActivity.build();


            }


        });

        mHistoryMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent HistoryMoodActivity = new Intent(MainActivity.this, HistoryMoodActivity.class);
                startActivity(HistoryMoodActivity);

            }
        });

        displayMood();
        displayColor();
    }


    @Override
    public boolean onDown(MotionEvent e) {
        // TODO Auto-generated method stub

        return false;

    }

    @Override
    public void onShowPress(MotionEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        // TODO Auto-generated method stub

        return false;

    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        // TODO Auto-generated method stub
        return gestureDetector.onTouchEvent(motionEvent);

    }


    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        // TODO Auto-generated method stub

        return false;

    }

    @Override
    public void onLongPress(MotionEvent e) {
        // TODO Auto-generated method stub


    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        if (e1.getY() - e2.getY() > 50) {
            currentMoodIndex = Math.min(currentMoodIndex + 1, moodDrawableResId.length - 1);
            displayMood();
            currentColorIndex = Math.min(currentColorIndex + 1, backgroundColorsResId.length - 1);
            displayColor();
            return true;
        } else if (e2.getY() - e1.getY() > 50) {
            currentMoodIndex = Math.max(currentMoodIndex - 1, 0);
            displayMood();
            currentColorIndex = Math.max(currentColorIndex - 1, 0);
            displayColor();
            return true;

        } else {

            return true;

        }


    }

    private void displayColor() { mColors.setBackgroundResource(backgroundColorsResId[currentColorIndex]); }

    private void displayMood() { mMoodHappy.setImageResource(moodDrawableResId[currentMoodIndex]); }

}








