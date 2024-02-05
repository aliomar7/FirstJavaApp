package com.example.firstjavaapp;

public class MainModel {
    String name,email,course,turl;

    MainModel() {

    }
    public MainModel(String name, String email, String course, String turl) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.turl = turl;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public String getTurl() {
        return turl;
    }
}

