package com.company;

public abstract class Person {
    private String first;
    private String last;
    private int type;

    public Person(String first, String last, String type){
        this.first = first;
        this.last = last;
        this.type = type;
    }
    if(type == 0){
        public abstract String getFirstName();
        public abstract String getFamilyName();
        public abstract boolean equals(Person p);
    }else if(type == 1){
        public abstract int getGPA();
        public abstract String toString();
    }else if(type == 2){
        public abstract String getSubject();
        public abstract String toString();
    }else{
        public abstract String getSubject();
        public abstract int classAverage();
        public abstract String printClass();
    }
}
