package com.epam.courses.principles;


import java.util.Objects;

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

    public Student(String name, boolean bigFamily, int age) {
        this.name = name;
        this.bigFamily = bigFamily;
        this.age = age;
    }

    public int getAge() {return age;}

    public String getName() {
        return name;
    }

    public StudentFaculty setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
        return null;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bigFamily=" + bigFamily +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return bigFamily == student.bigFamily && age == student.age && name.equals(student.name) && country.equals(student.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bigFamily, country, age);
    }
}
