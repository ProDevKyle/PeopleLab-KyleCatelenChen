package com.company;

public class Student extends Person {
    private double GPA;
    private String gradeLevel;
    private String gender;
    private String firstName;
    private String familyName;
    public Student(double GPA, String gradeLevel, String numberClasses, String firstName, String familyName) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        String famName = this.getFamilyName();
        String firName = this.getFirstName();
        return (famName + "," + firName);
    }
}