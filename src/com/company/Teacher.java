package com.company;

public class Teacher extends Person{
    private String subject;
    private String title;
    private String firstName;
    private String familyName;

    public Teacher(String subject, String title, String firstName, String familyName) {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
        this.familyName = familyName;
        this.firstName = firstName;
    }
    @Override
    public String toString() {
        return title + "." + familyName;
    }
}
