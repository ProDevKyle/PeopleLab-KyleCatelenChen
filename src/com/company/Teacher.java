package com.company;

public class Teacher extends Person{
    private String subject;
    private String title;

    public Teacher(String subject, String title) {
        super("A","Q");
        this.subject = subject;
        this.title = title;

        @Override
        public String getSubject() {
            return subject;
        }
        @Override
        public String toString() {
            String famname = getFamilyName();
            return title + "." + famname;
        }
    }
}
