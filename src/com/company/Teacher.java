package com.company;

public class Teacher extends Person{
    private String subject;
    private String title;
    private String firstName;
    private String familyName;
    this.getSubject();

    public Teacher(String subject, String title, String firstName, String familyName) {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
        public String {
            return subject;
        }
    }
    @Override
    public String toString() {
        String famName = getFamilyName();
        return title + "." + famName;
    }
}
