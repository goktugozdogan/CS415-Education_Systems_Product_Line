package com.example.spl._factory;

import com.example.spl._core.User;
import com.example.spl._core.UserSchedule;

public class UserFactory {

    public UserFactory(){

    }

    public User getUser(String userType, String name, String surname, String password,
                        String address, String phone, String email, UserSchedule schedule,
                        String paymentInfo ){
        if(userType == null){
            return null;
        }
        else if(userType == "danceTeacher" || userType == "academicTeacher" || userType == "fitnessTeacher"){
            new TeacherFactory().getTeacher(userType, name, surname, password,
                    address, phone, email, schedule, paymentInfo);
        }
        else{
            new StudentFactory().getStudent(userType, name, surname, password,
                    address, phone, email, schedule,
                    paymentInfo);
        }

        return null;
    }
}
