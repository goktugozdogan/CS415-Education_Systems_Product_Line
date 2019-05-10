package com.example.spl._common;

import com.example.spl._core.Course;
import com.example.spl._core.Database;

import java.util.ArrayList;

public class Certificate {
  int id;
  int courseId;
  int studentId;
  String info;
  ArrayList<Course> prerequisites;
  Database database = new Database();
  public Certificate() {
  }

  public Certificate(int id, int courseId, int studentId, String info, ArrayList<Course> prerequisites) {
    this.id = id;
    this.courseId = courseId;
    this.studentId = studentId;
    this.info = info;
    this.prerequisites = prerequisites;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCourseId() {
    return this.courseId;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }

  public int getStudentId() {
    return this.studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getInfo() {
    return this.info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public ArrayList<Course> getPrerequisites() {
    return this.prerequisites;
  }

  public void setPrerequisites(ArrayList<Course> prerequisites) {
    this.prerequisites = prerequisites;
  }

  public Certificate id(int id) {
    this.id = id;
    return this;
  }

  public Certificate courseId(int courseId) {
    this.courseId = courseId;
    return this;
  }

  public Certificate studentId(int studentId) {
    this.studentId = studentId;
    return this;
  }

  public Certificate info(String info) {
    this.info = info;
    return this;
  }

  public Certificate prerequisites(ArrayList<Course> prerequisites) {
    this.prerequisites = prerequisites;
    return this;
  }

  void signCertificate() {

  }

  void requestCertificate() {

  }

  void viewGoal() {

  }

  void viewAssignments(int studentId) {
    if(database.isTaskComplete(getStudentId(), getCourseId()));
  }

  void checkWorkDone() {

  }


  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", courseId='" + getCourseId() + "'" + ", studentId='" + getStudentId() + "'"
        + ", info='" + getInfo() + "'" + ", prerequisites='" + getPrerequisites() + "'" + "}";
  }
}
