package com.cachefinal.tc;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentC {

    private int Rollno ;
    private String Fname ;
    private int Marks ;

    @Override
    public String toString() {
        return "student{" +
                "Rollno=" + Rollno +
                ", Fname='" + Fname + '\'' +
                ", Marks=" + Marks +
                '}';
    }

    public StudentC() {
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }
}
