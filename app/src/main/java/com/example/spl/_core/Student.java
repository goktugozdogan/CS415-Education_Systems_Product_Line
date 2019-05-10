package com.example.spl._core;

public abstract class Student extends User {

    public Student(String name,
            String surname,
            String password,
            String address,
            String phone,
            String email,
            UserSchedule schedule,
            String paymentInfo){
        super(name, surname, password, address, phone, email, schedule, paymentInfo);
    }

    void registerCourse(int id){

    }
    void viewCurrentCourses(){

    }
    void comment2Teacher(int id){

    }
    void rate2Teacher(int id){

    }
    void comment2Course(int id){

    }
    void rate2Course(int id){

    }
    void requestAppoinment(int id){

    }

}
