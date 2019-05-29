package com.maylis.moodtracker.json;

import com.google.gson.Gson;



/**
 * Created by Maylis Gaillard on 29/05/2019.
 */
public class MoodGson {

    public static void main(String[] args){

        Gson gson = new Gson();
        String json = gson.toJson("@drawable/smiley_happy");
        System.out.println(json);
        gson.toJson("@drawable/smiley_super_happy");
        System.out.println(json);
        gson.toJson("@drawable/smiley_normal");
        System.out.println(json);
        gson.toJson("@drawable/smiley_disappointed");
        System.out.println(json);
        gson.toJson("@drawable/smiley_sad");
        System.out.println(json);

    }

}
