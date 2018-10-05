package com.company;

public class Student extends Person {
    private double GPA;
    private String gradeLevel;
    private String gender;

    public Student(double GPA, String gradeLevel, String numberClasses) {
        super("A", "B");
        this.GPA = GPA;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        String famName = getFamilyName();
        String firName = getFirstName();
        return (famName + "," + firName);
    }
}
