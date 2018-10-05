package com.company;

public class Teacher extends Person{
    private String subject;
    private String title;

    public Teacher(String subject, String title) {
        super("A", "Q");
        this.subject = subject;
        this.title = title;
    }
        public String getSubject() {
            return subject;
        }

        public String toString() {
            String famname = getFamilyName();
            return title + "." + famname;
        }
}
