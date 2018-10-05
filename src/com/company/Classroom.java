/*package com.company;

public class Classroom {
    public Classroom(Student[] students, Teacher teacher){
        super("classroom");
    }

    @Override
    public String getSubject(){
        return teacher.getSubject();
    }
    @Override
    public double classAverage(){
        int totalAvg;
        for(Student s : students){
            totalAvg += s.getGPA();
        }
        return totalAvg / students.length();
    }
    @Override
    public String printClass(){
        String output = "";
        output += teacher.toString() + teacher.getSubject();
        for(Student s : students){

        }

    }
}
