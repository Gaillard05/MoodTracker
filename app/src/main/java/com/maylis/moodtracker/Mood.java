package com.maylis.moodtracker;



public class Mood {
    private int moodIndex;
    private String dialogCommentView;
    private String Date;



    public int getMoodIndex() {
        return moodIndex;
    }


    public void setMoodIndex(int index) {
        this.moodIndex = index;
    }

    public String getComment() {
        return dialogCommentView;
    }

    public void setComment(String comment) { this.dialogCommentView = comment; }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}






