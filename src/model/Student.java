package model;

import java.time.LocalDate;

public class Student extends Person{
    private int studentId;
    private String uni;
    private int year;
    private double gpa;

    public Student(int id, String name, LocalDate dayOfBirth, String address,
                   double height, double weight, int studentId,
                   String uni, int year, double gpa) {
        super(id, name, dayOfBirth, address, height, weight);
        this.studentId = studentId;
        this.uni = uni;
        this.year = year;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", uni='" + uni + '\'' +
                ", year=" + year +
                ", gpa=" + gpa +
                '}';
    }
}
