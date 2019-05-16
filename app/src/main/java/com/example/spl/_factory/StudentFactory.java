package com.example.spl._factory;

import com.example.spl._core.Student;
import com.example.spl._core.UserSchedule;
import com.example.spl.academic.AcademicStudent;
import com.example.spl.dance.DanceStudent;
import com.example.spl.fitness.FitnessStudent;

public class StudentFactory {
    public StudentFactory(){

    }

    public Student getStudent(String userType, String name, String surname, String password,
                              String address, String phone, String email, UserSchedule schedule,
                              String paymentInfo){
        if(userType == null){
            return null;
        }
        else if(userType.equals("academic")){
            return new AcademicStudent(name,  surname, password,
                    address, phone, email, schedule,
                    paymentInfo,"", "");
        }
        else if(userType.equals("dance")){
            return new DanceStudent(name,  surname, password,
                    address, phone, email, schedule,
                    paymentInfo);
        }
        else if(userType.equals("fitness")){
            return new FitnessStudent(name,  surname, password,
                    address, phone, email, schedule,
                    paymentInfo);
        }

        return null;
    }
}
