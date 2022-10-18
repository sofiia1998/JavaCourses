package com.epam.courses.principles;


public class StudentGroup extends StudentFaculty {
    String group;

    StudentGroup(boolean bigFamily, String faculty, String group) {
        super(bigFamily, faculty);
        this.group = group;
    }

    StudentGroup() {System.out.println("Student(w/o parameters)");}

    public void totalInformation(String name, String faculty, String group) {
        System.out.format("To sum up, %s is from %s faculty and %s group.", name, faculty, group);
    }
}
