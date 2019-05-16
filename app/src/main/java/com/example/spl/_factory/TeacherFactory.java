package com.example.spl._factory;

import com.example.spl._core.Teacher;
import com.example.spl._core.UserSchedule;
import com.example.spl.academic.AcademicTeacher;
import com.example.spl.dance.DanceTeacher;
import com.example.spl.fitness.FitnessTeacher;

public class TeacherFactory {

    public TeacherFactory(){

    }

    public Teacher getTeacher(String userType, String name, String surname, String password,
                              String address, String phone, String email, UserSchedule schedule,
                              String paymentInfo){
        if(userType == null){
            return null;
        }
        else if(userType.equals("academic")){
            return new AcademicTeacher(name,  surname, password,
                    address, phone, email, schedule,
                    paymentInfo);
        }
        else if(userType.equals("dance")){
            return new DanceTeacher(name,  surname, password,
                    address, phone, email, schedule,
                    paymentInfo);
        }
        else if(userType.equals("fitness")){
            return new FitnessTeacher(name,  surname, password,
                    address, phone, email, schedule,
                    paymentInfo);
        }

        return null;
    }
}
