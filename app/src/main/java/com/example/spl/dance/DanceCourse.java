package com.example.spl.dance;

import com.example.spl._core.CourseSchedule;
import com.example.spl._common.Team;
import com.example.spl._core.Course;
import com.example.spl._core.Student;

import java.util.ArrayList;

public class DanceCourse extends Course {
    ArrayList<Team> teams;

    public DanceCourse(int teacherID, CourseSchedule schedule,
                       ArrayList<Student> student, boolean isOnline,
                       long lat, long lon){
        super(teacherID,  schedule, student, isOnline, lat, lon );
        teams = new ArrayList<Team>();
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
}
