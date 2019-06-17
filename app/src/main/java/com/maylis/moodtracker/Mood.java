package com.maylis.moodtracker;

//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;

public class Mood {
    private int moodIndex;
    private String dialogCommentView;
    private String dateInString;


    public int getMoodIndex() {
        return moodIndex;
    }

    public void setMoodIndex(int index) {
        this.moodIndex = index;

        //SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        //String dateInString = "17-06-2019 17:20:56";
        //Date date = sdf.parse(dateInString);

        //Calendar calendar = Calendar.getInstance();
        //calendar.setTime(date);
    }

    public String getComment() {
        return dialogCommentView;
    }


    public void setComment(String comment) { this.dialogCommentView = comment; }

}





