package com.amila.qamp.oopzadaca2.Task1;

public class MainClassroom {
    public static void main(String[] args) {

        Classroom classroom = new Classroom(); // create a classroom

        Student student1 = new Student("Amila"); // create students
        Student student2 = new Student("Merjem");
        Student student3 = new Student("Amina");
        System.out.println(student1);

        classroom.addStudent(student1); // add students to the classroom
        classroom.addStudent(student2);
        classroom.addStudent(student3);


        System.out.println("Is " + student1.getName() + " present in the classroom? " + classroom.isPresent(student1.getName())); //check students presence
        System.out.println("Is " + student2.getName() + " present in the classroom? " + classroom.isPresent(student2.getName()));
        System.out.println("Is " + student3.getName() + " present in the classroom? " + classroom.isPresent(student3.getName()));
        classroom.printClassroom();
    }
}

