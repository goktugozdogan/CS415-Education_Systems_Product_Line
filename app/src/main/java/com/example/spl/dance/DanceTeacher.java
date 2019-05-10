package com.example.spl.dance;

import com.example.spl._common.Nutrition;
import com.example.spl._common.Team;
import com.example.spl._common.Training;
import com.example.spl._core.Database;
import com.example.spl._core.UserSchedule;
import com.example.spl._core.Student;
import com.example.spl._core.Teacher;

import java.util.ArrayList;

public class DanceTeacher extends Teacher {


    ArrayList<String> dances;
    ArrayList<Team> teams;
    Database database = new Database();
    public DanceTeacher(String name, String surname, String password, String address, String phone, String email, UserSchedule schedule, String paymentInfo) {
        super(name, surname, password, address, phone, email, schedule, paymentInfo);

        this.dances = new ArrayList<>();
        this.teams = new ArrayList<>();
    }


    public void createNutritionPlan(ArrayList<Nutrition> nutritions, DanceStudent student){
        student.getNutritionProgram().addAll(nutritions);
    }
    public void createTrainingProgram(ArrayList<Training> training, DanceStudent student){
        student.getExercise().addAll(training);
    }
    public void createTeam(String name, DanceCourse course){
        new Team(name, getId(),course.getCourseId());
    }
    void createTeam( String name, int courseId) {
        Team team = new Team(name, getId(), courseId);
        database.createTeam(team);
    }
}
