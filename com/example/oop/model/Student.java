package com.example.oop.model;


public class Student {
    private int id;
    private String fname;
    private String course;
    private int fee;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Method will retrieve value of Student Object.
     * @return first name of Student Object
     */
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    
    
}
