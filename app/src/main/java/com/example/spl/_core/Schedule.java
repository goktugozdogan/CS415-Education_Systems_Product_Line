package com.example.spl._core;

import java.util.ArrayList;

public abstract class Schedule {
  int id;
  String info;
  ArrayList<TimeSlot> date;

  public Schedule(int id, String info, ArrayList<TimeSlot> date) {
    this.id = id;
    this.info = info;
    this.date = date;
  }

  void viewSchedule(){

  }

  void editSchedule(){
  }

  void checkTimeCollision(TimeSlot timeslot){

  }
}
