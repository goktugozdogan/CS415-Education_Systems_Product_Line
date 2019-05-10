package com.example.spl._common;

import java.util.Date;
import java.util.Map;

public class Training extends PhysicalEducationFeatures {
  Date date;
  Map<String, String> trainingProgram;

  public Training() {
  }

  public Training(Date date, Map<String, String> trainingProgram) {
    this.date = date;
    this.trainingProgram = trainingProgram;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Map<String, String> getTrainingProgram() {
    return this.trainingProgram;
  }

  public void setTrainingProgram(Map<String, String> trainingProgram) {
    this.trainingProgram = trainingProgram;
  }

  public Training date(Date date) {
    this.date = date;
    return this;
  }

  public Training trainingProgram(Map<String, String> trainingProgram) {
    this.trainingProgram = trainingProgram;
    return this;
  }

  @Override
  public String toString() {
    return "{" + " date='" + getDate() + "'" + ", trainingProgram='" + getTrainingProgram() + "'" + "}";
  }

}
