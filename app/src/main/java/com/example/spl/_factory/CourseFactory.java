package com.example.spl._factory;

import com.example.spl._core.Course;
import com.example.spl._core.CourseSchedule;
import com.example.spl._core.Student;
import com.example.spl.academic.AcademicCourse;
import com.example.spl.dance.DanceCourse;
import com.example.spl.fitness.FitnessCourse;

import java.util.ArrayList;

public class CourseFactory {
    public CourseFactory() {

    }

    public Course getCourse(String courseType, int teacherID, CourseSchedule schedule,
                            ArrayList<Student> student, boolean isOnline,
                            long lat, long lon){
        if(courseType == null){
            return null;
        }
        else if(courseType.equals("academic")){
            return new AcademicCourse(teacherID,  schedule, student,
                    isOnline, lat, lon);
        }
        else if(courseType.equals("dance")){
            return new DanceCourse(teacherID,  schedule, student,
                    isOnline, lat, lon);
        }
        else if(courseType.equals("fitness")){
            return new FitnessCourse(teacherID,  schedule, student,
                    isOnline, lat, lon);
        }

        return null;

    }
}
