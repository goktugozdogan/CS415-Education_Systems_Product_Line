package com.example.spl._core;

import com.example.spl._common.Team;
import com.example.spl._factory.CourseFactory;
import com.example.spl._factory.ScheduleFactory;

import java.util.ArrayList;
import java.util.Date;

public abstract class Teacher extends User {

    ArrayList<Review> reviews = null;
    ArrayList<Course> offeredCourses = null;
    ArrayList<Team> ownedTeams = null;
    Database database = new Database();

    public Teacher(String name, String surname, String password, String address, String phone, String email, UserSchedule schedule, String paymentInfo) {
        super(name, surname, password, address, phone, email, schedule, paymentInfo);
    }

    void createClass(int teacherID, CourseSchedule schedule,
                     ArrayList<Student> student, boolean isOnline,
                     long lat, long lon){
        CourseFactory courseFactory = new CourseFactory();
        Course course = courseFactory.getCourse("academicCourse",teacherID, schedule, student, isOnline, lat, lon);
        database.createCourse(course);
    }
    void createSchedule( ArrayList<TimeSlot> timeslots){
        ScheduleFactory scheduleFactory = new ScheduleFactory();
        String scheduleType = "userSchedule";
        UserSchedule schedule = (UserSchedule) scheduleFactory.getSchedule(scheduleType,1, "bestSchedule", timeslots);
    }
    ArrayList<Review> viewReviews(){
        return database.getReviews(getId());
    }
    boolean acceptAppointment(){
        if(true){
            return true;
        }
        return false;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<Course> getOfferedCourses() {
        return offeredCourses;
    }

    public void setOfferedCourses(ArrayList<Course> offeredCourses) {
        this.offeredCourses = offeredCourses;
    }

    public ArrayList<Team> getOwnedTeams() {
        return ownedTeams;
    }

    public void setOwnedTeams(ArrayList<Team> ownedTeams) {
        this.ownedTeams = ownedTeams;
    }
}
