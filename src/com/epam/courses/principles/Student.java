package com.epam.courses.principles;


public abstract class Student implements AgeOfTheStudent{
    private String name;
    boolean bigFamily;

    final String country = "Ukraine";
    private int age;

    public void studik() {
        System.out.println("This is a new student:");
    }

    public void printStudik() {
        studik();
        System.out.println(getName());
    }

    public int getAge() {return age;}

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
    public void setName(String name) {
            this.name = name;
    }
    public Student() {System.out.println("Student(w/o parameters)");}

    public Student(boolean bigFamily) {
        //System.out.println("Student(with parameters)");
        this.bigFamily = bigFamily;
    }

    public abstract void ifStudentHasABigFamily();


}
