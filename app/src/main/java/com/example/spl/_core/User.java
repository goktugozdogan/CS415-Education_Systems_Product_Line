package com.example.spl._core;

public abstract class User {

    String name;
    String surname;
    String password;
    int id;
    String address;
    String phone;
    String email;
    UserSchedule schedule;
    String paymentInfo;

    public User(String name,
            String surname,
            String password,
            String address,
            String phone,
            String email,
            UserSchedule schedule,
            String paymentInfo){
        this.name = name;
        this.surname = surname;
        this.id = (int) Math.random() * 5000 + 1000;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.schedule = schedule;
        this.paymentInfo = paymentInfo;
    }

    UserSchedule viewSchedule(){
        return this.schedule;
    }
    void viewCurrentCourses(){

    }
    void viewAppoinments(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(UserSchedule schedule) {
        this.schedule = schedule;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
}
