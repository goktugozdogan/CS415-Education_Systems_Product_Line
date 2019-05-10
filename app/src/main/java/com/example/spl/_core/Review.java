package com.example.spl._core;

import java.util.ArrayList;

public class Review {
  int id;
  int teacherId;
  int courseId;
  int studentId;
  int rate;
  String comment;
  ArrayList<Student> members;

  public Review() {
  }

  public Review(int id, int teacherId, int courseId, int studentId, int rate, String comment,
      ArrayList<Student> members) {
    this.id = id;
    this.teacherId = teacherId;
    this.courseId = courseId;
    this.studentId = studentId;
    this.rate = rate;
    this.comment = comment;
    this.members = members;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getTeacherId() {
    return this.teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
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

  public int getRate() {
    return this.rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public String getComment() {
    return this.comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ArrayList<Student> getMembers() {
    return this.members;
  }

  public void setMembers(ArrayList<Student> members) {
    this.members = members;
  }

  public Review id(int id) {
    this.id = id;
    return this;
  }

  public Review teacherId(int teacherId) {
    this.teacherId = teacherId;
    return this;
  }

  public Review courseId(int courseId) {
    this.courseId = courseId;
    return this;
  }

  public Review studentId(int studentId) {
    this.studentId = studentId;
    return this;
  }

  public Review rate(int rate) {
    this.rate = rate;
    return this;
  }

  public Review comment(String comment) {
    this.comment = comment;
    return this;
  }

  public Review members(ArrayList<Student> members) {
    this.members = members;
    return this;
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", teacherId='" + getTeacherId() + "'" + ", courseId='" + getCourseId() + "'"
        + ", studentId='" + getStudentId() + "'" + ", rate='" + getRate() + "'" + ", comment='" + getComment() + "'"
        + ", members='" + getMembers() + "'" + "}";
  }

}
