package com.company;

public class Student extends Person
{
    private double GPA;
    private String gradeLevel;
    private String numberClasses;

    public Student(double GPA, String gradeLevel, String numberClasses)
    {
        super("");
        this.GPA = GPA;
        this.gradeLevel = gradeLevel;
        this. numberClasses = numberClasses
    }
    @Override
    public double getGPA()
    {
        return GPA;
    }
    @Override
    public String toString()
    {
        return;
    }

}
