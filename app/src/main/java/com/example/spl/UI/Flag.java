package com.example.spl.UI;

import android.app.Application;

public class Flag extends Application {

    private String appType = "";
    private boolean academy_flag = false;
    private boolean dance_flag = false;
    private boolean fitness_flag = false;

    public boolean getAcademyFlag() {
            return academy_flag;
    }
    public boolean getDanceFlag() {
        return dance_flag;
    }
    public boolean getFitnessFlag() {
        return fitness_flag;
    }

    public void setAcademyFlag(boolean flag) {
        this.academy_flag = flag;
    }
    public void setDanceFlag(boolean flag) {
        this.dance_flag = flag;
    }
    public void setFitnessFlag(boolean flag) {
        this.fitness_flag = flag;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppType() {
        return appType;
    }
}
