package com.epam.courses.principles;


public class StudentFaculty extends Student {

    String faculty;

    StudentFaculty(boolean bigFamily, String faculty) {
        super(bigFamily);
        this.faculty = faculty;
        //System.out.println("Student(with parameters)");
    }

    StudentFaculty() {System.out.println("Student(w/o parameters)");}

    @Override
    public void ifStudentHasABigFamily() {}

    @Override
    public void showAge() {}
}
