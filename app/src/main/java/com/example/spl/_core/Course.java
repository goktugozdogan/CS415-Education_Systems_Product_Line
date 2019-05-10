package com.example.spl._core;

import java.util.ArrayList;

public abstract class Course {
    int teacher;
    int courseId;
    CourseSchedule schedule;
    ArrayList<Student> students;
    boolean isOnline;
    long latitude;
    long longitude;
    Database database = new Database();
    public Course(int teacherId,
            CourseSchedule schedule,
            ArrayList<Student> students,
            boolean isOnline,
            long latitude,
            long longitude) {
        this.teacher = teacher;
        this.courseId = (int) Math.random() * 5000 + 7000;
        this.schedule = schedule;
        this.students = students;
        this.isOnline = isOnline;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    void viewComments(){
        database.getReviews(getCourseId());
    }

    void viewCourseInfo(){

    }


    CourseSchedule viewSchedule(){
        return getSchedule();
    }

    boolean viewVideo(){
        if(isOnline){
            return true;
        }else{
            return false;
        }
    }


    void downloadCourseFiles(){
        database.getCourseFiles(getCourseId());
    }


    Long[] viewCoursePlaces(){
        Long[] coordinates= {latitude, longitude};
        return coordinates;
    }

    void courseCertificates(){
        database.showCertificates(getCourseId());
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public CourseSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(CourseSchedule schedule) {
        this.schedule = schedule;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
