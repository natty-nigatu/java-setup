package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int studentId;
    private String name;
    private Date dateOfAdmission;

    public Student() {
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Student(int studentId, String name, Date dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }


    public Student(int studentId, String name, int year, int month, int date) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = new Date(year - 1900, month + 1, date);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfAdmission=" + new SimpleDateFormat("MM/dd/yyyy").format(dateOfAdmission) +
                '}';
    }
}
