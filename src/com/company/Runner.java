package com.company;

public class Runner {
    public static String[] firstNames = {"A", "B", "C", "D"};
    public static String[] familyNames = {"Q", "W", "E", "R"};

    public static void main(String[] args) {
        Student[] students = new Student[34];
        for (int i = 0; i < 34; i++) {
            students[i] = randomStudent();
        }

        Teacher teach = new Teacher("Math", "Ms.", "A", "B");
        Classroom classRoom = new Classroom(students,teach);

        classRoom.printClass();
    }
    public static Student randomStudent(){
        return new Student((double)(Math.random()*(4.0)+1), )
    }
}
