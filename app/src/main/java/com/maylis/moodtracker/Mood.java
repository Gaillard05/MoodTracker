package com.maylis.moodtracker;

import com.google.gson.Gson;

public class Mood {
    private int moodIndex;
    private String comment;

    public int getMoodIndex() {
        return moodIndex;
    }

    public void setMoodIndex(int index) {
        this.moodIndex = index;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    Gson gson = new Gson();

    String moodIndexJson = gson.toJson(getMoodIndex());
}


