package model;

import constants.AppConstants;
import enums.AcademicPerformance;

import java.time.LocalDate;

public class Student extends Person{
    private static int idCount =1 ;
    private String studentId;
    private String uni;
    private int year;
    private double gpa;
    private AcademicPerformance perfor;
    public Student(String name, LocalDate dayOfBirth, String address,
                   Double height, Double weight, String uni, int year, Double gpa) {
        super(name, dayOfBirth, address, height, weight);
        this.studentId = generateStudentId();
        setUni(uni);
        setYear(year);
        setGpa(gpa);
    }

    private String generateStudentId() {
        return String.format("SID%07d", idCount++);

    }
    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getUni()
    {
        return uni;
    }

    public void setUni(String uni) {
        if(uni == null || uni.trim().isEmpty() || uni.length() > AppConstants.UNI_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("Invalid uni");
        }
        this.uni = uni;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < AppConstants.MIN_START_YEAR) {
            throw new IllegalArgumentException("Invalid year");
        }
        this.year = year;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        if(gpa < AppConstants.MIN_GPA || gpa > AppConstants.MAX_GPA) {
            throw new IllegalArgumentException("Invalid gpa");
        }
        this.gpa = gpa;
        this.perfor = AcademicPerformance.fromGPA(gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", uni='" + uni + '\'' +
                ", year=" + year +
                ", gpa=" + gpa +
                ", perfor=" + perfor +
                '}';
    }
}
