package com.epam.courses.principles;


public class StudentFaculty extends Student {

    String faculty;

    public StudentFaculty(boolean bigFamily, String faculty) {
        super(bigFamily);
        this.faculty = faculty;
        //System.out.println("Student(with parameters)");
    }

    StudentFaculty() {System.out.println("Student(w/o parameters)");}

    @Override
    public void ifStudentHasABigFamily() {}

    @Override
    public void showAge() {}

    @Override
    public String toString() {
        return "StudentFaculty{" +
                "faculty='" + faculty + '\'' +
                ", bigFamily=" + bigFamily +
                ", country='" + country + '\'' +
                "}\n";
    }
}
