package com.jfs;

import java.time.LocalDate;

public class Student {
    private String name;
    private String email;
    private LocalDate dob;
    private double gpa;



    public Student(String name, String email, LocalDate dob, double gpa) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
