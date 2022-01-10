package com.codegym;

public class Student {
    private String name;
    private String classes;

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }
}
