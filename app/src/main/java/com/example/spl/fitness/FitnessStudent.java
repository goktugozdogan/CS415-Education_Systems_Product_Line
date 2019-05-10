package com.example.spl.fitness;

import com.example.spl._common.Nutrition;
import com.example.spl._common.Team;
import com.example.spl._common.Training;
import com.example.spl._core.Student;
import com.example.spl._core.UserSchedule;

import java.util.ArrayList;

public class FitnessStudent extends Student {

    ArrayList<Team> teams;
    String weightLiftProgress;
    String weightLossProgress;
    int totalCalories;
    ArrayList<Nutrition> nutritionProgram;
    ArrayList<Training> exercise;


    public FitnessStudent(String name, String surname, String password, String address, String phone, String email, UserSchedule schedule, String paymentInfo) {
        super(name, surname, password, address, phone, email, schedule, paymentInfo);
        teams = new ArrayList<>();
        weightLiftProgress = "";
        weightLossProgress  = "";
        totalCalories = 0;
        nutritionProgram = new ArrayList<>();
        exercise = new ArrayList<>();
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public String getWeightLiftProgress() {
        return weightLiftProgress;
    }

    public void setWeightLiftProgress(String weightLiftProgress) {
        this.weightLiftProgress = weightLiftProgress;
    }

    public String getWeightLossProgress() {
        return weightLossProgress;
    }

    public void setWeightLossProgress(String weightLossProgress) {
        this.weightLossProgress = weightLossProgress;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public ArrayList<Nutrition> getNutritionProgram() {
        return nutritionProgram;
    }

    public void setNutritionProgram(ArrayList<Nutrition> nutritionProgram) {
        this.nutritionProgram = nutritionProgram;
    }

    public ArrayList<Training> getExercise() {
        return exercise;
    }

    public void setExercise(ArrayList<Training> exercise) {
        this.exercise = exercise;
    }
}
