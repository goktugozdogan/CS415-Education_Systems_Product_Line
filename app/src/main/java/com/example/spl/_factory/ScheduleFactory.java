package com.example.spl._factory;

import com.example.spl._core.CourseSchedule;
import com.example.spl._core.Schedule;
import com.example.spl._core.TimeSlot;
import com.example.spl._core.UserSchedule;

import java.util.ArrayList;

public class ScheduleFactory {
    public ScheduleFactory(){

    }

    public Schedule getSchedule(String scheduleType, int id, String info, ArrayList<TimeSlot> date) {
        if(scheduleType == null){
            return null;
        }
        else if(scheduleType == "userSchedule"){
            return new UserSchedule(id,  info, date);
        }
        else if(scheduleType == "courseSchedule"){
            return new CourseSchedule(id,  info, date);
        }

        return null;
    }

}
