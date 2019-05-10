package com.example.spl.academic;

import com.example.spl._common.Certificate;
import com.example.spl._core.Student;
import com.example.spl._core.UserSchedule;

import java.util.ArrayList;

public class AcademicStudent extends Student {

    String name;
    String surname;
    String password;
    int id;
    String address;
    String phone;
    String email;
    UserSchedule schedule;
    String paymentInfo;
    String educationalInfo;
    String parentInfo;

    ArrayList<Certificate> certificates;
    ArrayList<Task> tasks;


    public AcademicStudent(String name,  String surname, String password,
                    String address, String phone, String email, UserSchedule schedule,
                    String paymentInfo, String educationInfo, String parentInfo){
        super(name, surname, password, address, phone, email, schedule, paymentInfo);
        certificates = new ArrayList<Certificate>();
        tasks = new ArrayList<Task>();
        this.educationalInfo = educationInfo;
        this.parentInfo = parentInfo;
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

    public String getEducationalInfo() {
        return educationalInfo;
    }

    public void setEducationalInfo(String educationalInfo) {
        this.educationalInfo = educationalInfo;
    }

    public String getParentInfo() {
        return parentInfo;
    }

    public void setParentInfo(String parentInfo) {
        this.parentInfo = parentInfo;
    }

    public ArrayList<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<Certificate> certificates) {
        this.certificates = certificates;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
