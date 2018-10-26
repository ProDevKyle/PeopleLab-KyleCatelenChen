package com.company;

public class Classroom {
    private Student[] studentList;
    private Teacher teacher;
    Student [][] seatingChart = new Student[6][6];
    private int num1 = -1;
    private int num2 = 1;

    public Classroom(Student[] students, Teacher teacher){
        this.studentList = students;
        this.teacher = teacher;
        fillSeats();
    }
    public String getSubject(){
        return teacher.getSubject();
    }
    public double classAverage(){
        double totalAvg = 0;
        for(Student s : studentList){
            totalAvg += s.getGPA();
        }
        return totalAvg / 34;
    }
    public String printClass(){
        String output = "";
        output += "Teacher: " + teacher.toString() + ", Subject: " + teacher.getSubject() + ", Students:";
        for(Student s : studentList){
            output += " " + s.toString() + fillSeats() + ",";
        }
        return output;
    }
    public String fillSeats()
    {
        if (num1 < 6)
        {
            num1++;
        }
        else
        {
            num2++;
            num1 = 1;
        }
        return " row " + num2 + " column " + num1;
    }
}
