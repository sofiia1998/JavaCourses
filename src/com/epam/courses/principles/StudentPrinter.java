package com.epam.courses.principles;


public class StudentPrinter {

    void print(StudentFaculty studentFaculty) {
        System.out.format("This is the student from %s faculty. %n", studentFaculty.faculty);
    }

    void print(StudentGroup studentGroup) {
        System.out.format("This is the student from %s group. %n", studentGroup.group);
    }
}
