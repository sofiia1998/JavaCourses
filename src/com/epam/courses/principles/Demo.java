package com.epam.courses.principles;


public class Demo {
    public static void main(String[] args) {

        Student student = new StudentFaculty(true, "Economic");
        StudentGroup studentGroup = new StudentGroup(false, "Economic", "EKT1");

        int a = student.findDifference(1998, 8, 26);
        student.setName("Stepan");
        student.printStudik();

        student.setAge(a);
        System.out.println("This student is " + student.getAge() + " years old.");

        StudentPrinter studentPrinter = new StudentPrinter();
        studentPrinter.print(new StudentFaculty(true, "Economic"));
        studentPrinter.print(new StudentGroup(false, "Economic", "EKT1"));

        studentGroup.totalInformation(student.getName(), studentGroup.faculty, studentGroup.group);

<<<<<<< HEAD
        Student student1 = new Student(true) {
            @Override
            public void ifStudentHasABigFamily() {
                System.out.println("\nIs the student from a big family? " + bigFamily);
            }

            @Override
            public void showAge() {
                System.out.println(findDifference(1998, 8, 26));

            }
        };

        student1.ifStudentHasABigFamily();

        student1.showAge();

=======
>>>>>>> origin/master
    }
}
