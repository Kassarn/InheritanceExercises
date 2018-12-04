package com.MordorCrueltyPlan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Food {
    private final int CRAM = 2;
    private final int LEMBAS = 3;
    private final int APPLE = 1;
    private final int MELON = 1;
    private final int HONEYCAKE = 5;
    private final int MUSHROOMS = -10;
    private final int ELSE = -1;
    private int points;
    private String mood;
    List<String> foods;

    public Food(List<String> foods) {
        this.foods = foods;

    }

    public void setFoods(List<String> foods) {

        this.foods = foods;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s",this.points,this.mood);
    }

    public void calculateMood() {
        for (String food : this.foods) {
            switch (food.toLowerCase()) {
                case "cram":
                    this.points += CRAM;
                    break;
                case "lembas":
                    this.points += LEMBAS;
                    break;
                case "apple":
                    this.points += APPLE;
                    break;
                case "melon":
                    this.points += MELON;
                    break;
                case "honeycake":
                    this.points += HONEYCAKE;
                    break;
                case "mushrooms":
                    this.points += MUSHROOMS;
                    break;
                default:
                    this.points += ELSE;
                    break;

            }
        }
    }


    public void setMood() {
        if (this.points < -5) {
            this.mood = "Angry";
        } else if (this.points >= -5 && this.points < 0) {
            this.mood = "Sad";
        } else if(this.points >=0 && this.points <=15){
            this.mood ="Happy";
        } else if(this.points >15){
            this.mood = "JavaScript";
        }

    }

}
