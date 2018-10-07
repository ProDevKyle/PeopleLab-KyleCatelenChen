package com.company;

public class Classroom {
    private Student[] studentList;
    private Teacher teacher;
    public Classroom(Student[] students, Teacher teacher){
        this.studentList = students;
        this.teacher = teacher;
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
        output += "Teacher: " + teacher.toString() + ", Subject: " + teacher.getSubject() + ",1 Students:";
        for(Student s : studentList){
            output += " " + s.toString() + ",";
        }
        return output;
    }
}