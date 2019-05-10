package com.example.spl._common;

import com.example.spl.dance.DanceStudent;

import java.util.ArrayList;

public class Team extends PhysicalEducationFeatures {
    int id;
    String name;
    int teacherId;
    int courseId;
    ArrayList<DanceStudent> members;

    public Team() {
    }

    public Team(String name, int teacherId, int courseId) {
        this.id = (int) Math.random() *5000 +4000;
        this.name = name;
        this.teacherId = teacherId;
        this.courseId = courseId;
        this.members = new ArrayList<DanceStudent>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<DanceStudent> getMembers() {
        return this.members;
    }

    public void setMembers(ArrayList<DanceStudent> members) {
        this.members = members;
    }

    public Team id(int id) {
        this.id = id;
        return this;
    }

    public Team name(String name) {
        this.name = name;
        return this;
    }

    public Team teacherId(int teacherId) {
        this.teacherId = teacherId;
        return this;
    }

    public Team members(ArrayList<DanceStudent> members) {
        this.members = members;
        return this;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherId=" + teacherId +
                ", courseId=" + courseId +
                ", members=" + members +
                '}';
    }
}
