package com.amila.qamp.oopzadaca2.Task1;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<Student> students; //list of students

    // constructor
    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean isPresent(String name) {

        for (Student student : students) {
            if (student.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printClassroom() {
        System.out.println("Classroom: ");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

}


