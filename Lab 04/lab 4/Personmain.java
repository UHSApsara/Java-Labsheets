

package com.mycompany.personmain;


public class Personmain {

    public static void main(String[] args) {
       
        // Create a Student object
        Student student1 = new Student("John Doe", 1001, "Computer Science");

        // Create a Lecturer object
        Lecture lecturer1 = new Lecture("Dr. Smith", 2001, "Software Engineering");

        // Display information for the Student and Lecturer
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getID());
        System.out.println("Student Course: " + student1.getCourse());

        System.out.println();

        System.out.println("Lecturer Name: " + lecturer1.getName());
        System.out.println("Lecturer ID: " + lecturer1.getID());
        System.out.println("Lecturer Programme: " + lecturer1.getProgramme());
    }
}

    

