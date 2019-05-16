package com.example.spl._core;

import com.example.spl._common.Team;
import com.example.spl._factory.CourseFactory;
import com.example.spl._factory.ScheduleFactory;
import com.example.spl._factory.UserFactory;

import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class Database {

    final String  BASE_URL= "http://localhost:3000/";
    public Database(){

    }

    public User Login(String email, String password, String appType){
        //Send request to database and get User if it exist
        ArrayList<TimeSlot> timeslots = new ArrayList<>();
        timeslots = null;
        //timeslots.add(new TimeSlot("firstTimeSlot", new Date("12:30:00 10 10 2019"), new Date("14:30:00 10 10 2019")));
        ScheduleFactory scheduleFactory = new ScheduleFactory();
        String scheduleType = "userSchedule";

        UserSchedule schedule = (UserSchedule) scheduleFactory.getSchedule(scheduleType,1, "bestSchedule", timeslots);
        UserFactory userFactory = new UserFactory();
        User user;
        if ( isTeacher ) {
            appType += "T";
            user = userFactory.getUser(appType,"Goktug", "Ozdogan", "123456", "Bilkent", "15502548484", "goktug@gmail.com",schedule,"Done");
        }
        else
            user = userFactory.getUser(appType,"Goktug", "Ozdogan", "123456", "Bilkent", "15502548484", "goktug@gmail.com",schedule,"Done");

        HttpURLConnection connection = null;
        try {
            //Create connection
            URL url = new URL(BASE_URL + "auth");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");

            connection.setRequestProperty("email", email);
            connection.setRequestProperty("password", password);
            connection.setRequestProperty("appType", appType);

            //InputStream response = connection.getInputStream();


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        if(user != null){
            return user;
        }else {
            return null;
        }
    }

    public void logout(User user){
        //database logout for user
    }

    public void createCourse(Course course){
        //create a new course on database

    }

    public void createTeam( Team team) {
        //insert team to database
    }

    public ArrayList<Review> getReviews(int teacherId){
        // get all reviews about teacher with given id and fill reviews
        return new ArrayList<Review>();
    }

    public ArrayList<String> showCertificates(int courseId){
        //get all certificates and return them
        return new ArrayList<String>();
    }


    public ArrayList<File> getCourseFiles(int courseId){
        //get all files and return them
        return new ArrayList<File>();
    }

    public boolean isTaskComplete(int studentId, int courseId){
        //check if the student complete all task of given course and return it
        if(true){
            return true;
        }else {
            return false;
        }
    }

    private boolean isTeacher = false;
}