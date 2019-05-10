package com.example.spl.academic;

import com.example.spl._core.Course;

import com.example.spl._core.Student;
import com.example.spl._core.CourseSchedule;

import java.util.ArrayList;

public class AcademicCourse extends Course {

    public AcademicCourse(int teacherID, CourseSchedule schedule,
                   ArrayList<Student> student, boolean isOnline,
                   long lat, long lon){
        super(teacherID, schedule, student, isOnline, lat, lon );

    }


}
