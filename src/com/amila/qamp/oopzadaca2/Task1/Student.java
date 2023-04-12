package com.amila.qamp.oopzadaca2.Task1;


public class Student {

    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
        this.age = 15;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { // setter
        this.name = name;
    }

    public void setAge(int age) { // setter
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + ", " + age;
    }
}