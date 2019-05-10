package com.example.spl.fitness;

import com.example.spl._core.CourseSchedule;
import com.example.spl._core.Course;
import com.example.spl._core.Student;
import com.example.spl._common.Team;

import java.util.ArrayList;

public class FitnessCourse extends Course {

    ArrayList<Team> gymBoddy;

    public FitnessCourse(int teacherID, CourseSchedule schedule,
                         ArrayList<Student> student, boolean isOnline,
                         long lat, long lon){
        super(teacherID, schedule, student, isOnline, lat, lon);
        gymBoddy = new ArrayList<>();
    }

    public ArrayList<Team> getGymBoddy() {
        return gymBoddy;
    }

    public void setGymBoddy(ArrayList<Team> gymBoddy) {
        this.gymBoddy = gymBoddy;
    }
}
