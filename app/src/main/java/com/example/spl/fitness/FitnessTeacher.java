package com.example.spl.fitness;

import android.provider.ContactsContract;

import com.example.spl._common.Nutrition;
import com.example.spl._common.Team;
import com.example.spl._common.Training;
import com.example.spl._core.Database;
import com.example.spl._core.UserSchedule;
import com.example.spl.fitness.FitnessStudent;
import com.example.spl._core.Teacher;

import java.util.ArrayList;

public class FitnessTeacher extends Teacher {

    Database database = new Database();

    public FitnessTeacher(String name, String surname, String password, String address, String phone, String email, UserSchedule schedule, String paymentInfo) {
        super(name, surname, password, address, phone, email, schedule, paymentInfo);
    }

    public void createNutritionPlan(ArrayList<Nutrition> nutritions, FitnessStudent student){
        student.getNutritionProgram().addAll(nutritions);
    }
    public void createTrainingProgram(ArrayList<Training> training, FitnessStudent student){
        student.getExercise().addAll(training);
    }
    public String viewStudentWeightLiftProgress(FitnessStudent student){
        return student.getWeightLiftProgress();
    }
    public String viewStudentWeightLossProgress(FitnessStudent student){
        return student.getWeightLossProgress();
    }
    public double StudentTotalCalories(FitnessStudent student){
        return student.getTotalCalories();
    }
    void createTeam( String name, int courseId) {
        Team team = new Team(name, getId(), courseId);
        database.createTeam(team);
    }
}
