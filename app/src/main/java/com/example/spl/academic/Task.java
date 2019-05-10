package com.example.spl.academic;

import java.io.File;
import java.util.Date;

public class Task {
    int id;
    int classId;
    int studentId;
    String info;
    Date assignDate;
    Date dueDate;
    File file;
    int score;

    public Task() {
    }

    public Task(int id, int classId, int studentId, String info, Date assignDate, Date dueDate, File file, int score) {
        this.id = id;
        this.classId = classId;
        this.studentId = studentId;
        this.info = info;
        this.assignDate = assignDate;
        this.dueDate = dueDate;
        this.file = file;
        this.score = score;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassId() {
        return this.classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
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

    public Date getAssignDate() {
        return this.assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Task id(int id) {
        this.id = id;
        return this;
    }

    public Task classId(int classId) {
        this.classId = classId;
        return this;
    }

    public Task studentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public Task info(String info) {
        this.info = info;
        return this;
    }

    public Task assignDate(Date assignDate) {
        this.assignDate = assignDate;
        return this;
    }

    public Task dueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Task file(File file) {
        this.file = file;
        return this;
    }

    public Task score(int score) {
        this.score = score;
        return this;
    }

    void reminder2Student() {
    }

    void resetTask() {
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", classId='" + getClassId() + "'" + ", studentId='" + getStudentId()
                + "'" + ", info='" + getInfo() + "'" + ", assignDate='" + getAssignDate() + "'" + ", dueDate='"
                + getDueDate() + "'" + ", file='" + getFile() + "'" + ", score='" + getScore() + "'" + "}";
    }
}
