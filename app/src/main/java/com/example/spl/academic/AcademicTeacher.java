package com.example.spl.academic;

import com.example.spl._core.Student;
import com.example.spl._core.Teacher;
import com.example.spl._core.UserSchedule;

public class AcademicTeacher extends Teacher {


    String expertises;

    public AcademicTeacher(String name, String surname, String password, String address, String phone, String email, UserSchedule schedule, String paymentInfo) {
        super(name, surname, password, address, phone, email, schedule, paymentInfo);
        this.expertises = "";
    }

    void infromParents(Student s, String info) {

    }

    void assignTask(int courseID, Task task) {

    }

    void gradeTask(int courseID, Task task, String score) {

    }

    void unAssignTask(int courseID, int taskID) {

    }
    
}
