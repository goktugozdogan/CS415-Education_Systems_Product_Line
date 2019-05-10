package com.example.spl.dance;

import com.example.spl._common.Certificate;
import com.example.spl._common.Nutrition;
import com.example.spl.academic.Task;
import com.example.spl._common.Team;
import com.example.spl._common.Training;
import com.example.spl._core.UserSchedule;
import com.example.spl._core.Student;

import java.util.ArrayList;

public class DanceStudent extends Student {



    ArrayList<Team> teams;
    ArrayList<String> dancingExp;
    ArrayList<String> injuries;
    Costume costume;
    ArrayList<Training> exercise;
    ArrayList<Nutrition> nutritionProgram;
    ArrayList<Certificate> certificates;

    public DanceStudent(String name,  String surname, String password,
                    String address, String phone, String email, UserSchedule schedule,
                    String paymentInfo){
        super(name, surname, password, address, phone, email, schedule, paymentInfo);
        teams = new ArrayList<Team>();
        dancingExp = new ArrayList<String>();
        injuries = new ArrayList<String>();
        costume = null;
        exercise = new ArrayList<Training>();
        nutritionProgram = null;
        certificates = new ArrayList<Certificate>();
    }

    public void viewTask(int taskID){

    }
    public void viewTaskReminder(int taskID){

    }
    public void addCourse(int courseID){

    }
    public void applyAcademicalCertificate(int certificateID){

    }
    public void viewAcademicalCertificate(int certificateID){

    }
    public void dropAcademicalCertificate(int certificateID){

    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<String> getDancingExp() {
        return dancingExp;
    }

    public void setDancingExp(ArrayList<String> dancingExp) {
        this.dancingExp = dancingExp;
    }

    public ArrayList<String> getInjuries() {
        return injuries;
    }

    public void setInjuries(ArrayList<String> injuries) {
        this.injuries = injuries;
    }

    public Costume getCostume() {
        return costume;
    }

    public void setCostume(Costume costume) {
        this.costume = costume;
    }

    public ArrayList<Training> getExercise() {
        return exercise;
    }

    public void setExercise(ArrayList<Training> exercise) {
        this.exercise = exercise;
    }

    public ArrayList<Nutrition> getNutritionProgram() {
        return nutritionProgram;
    }

    public void setNutritionProgram(ArrayList<Nutrition> nutritionProgram) {
        this.nutritionProgram = nutritionProgram;
    }

    public ArrayList<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<Certificate> certificates) {
        this.certificates = certificates;
    }

}
