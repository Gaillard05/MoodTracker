package com.maylis.moodtracker;

import android.content.Context;
import android.content.SharedPreferences;


import com.google.gson.Gson;



import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Maylis Gaillard on 20/05/2019.
 */
public class Storage {


    public static void store(Context context, Mood mood, String comment) {
        SharedPreferences mPreferences = context.getSharedPreferences(comment, MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = mPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(mood);
        prefsEditor.putString(comment, json);
        prefsEditor.apply();


    }

    public static Mood load(Context context, String comment) {
        SharedPreferences mPreferences = context.getSharedPreferences(comment, MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mPreferences.getString(comment, "");
        Mood mood = gson.fromJson(json, Mood.class);
        return mood;


    }

 }
