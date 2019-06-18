package com.maylis.moodtracker;




public class Mood {
    private int moodIndex;
    private String dialogCommentView;
    private String dateInString;


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

    public String getDateInString() {
        return dateInString;
    }

    public void setDateInString(String dateInString) {
        this.dateInString = dateInString;
    }
}






