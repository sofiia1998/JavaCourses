package com.epam.courses.generics.collections;

import com.epam.courses.io.object_in_file_menu.ObjectToFileHometask;
import com.epam.courses.io.objectstream.ObjectFile;
import com.epam.courses.principles.Student;
import com.epam.courses.principles.StudentFaculty;
import com.epam.courses.principles.StudentGroup;

import java.io.IOException;
import java.util.*;

public class CollectionsDemo {
//        Map<Integer, StudentFaculty> studentFacultyMap = new HashMap<>();
//
//        studentFacultyMap.put(1, student1);
//
//        studentFacultyMap.get(1);
//        studentFacultyMap.replace(1, student1.setAge(20));
//
//        for (Map.Entry<Integer, StudentFaculty> item : studentFacultyMap.entrySet()) {
//            System.out.printf("%d '%s'\n", item.getKey(), item.getValue());
//        }
//
//        for (StudentFaculty item: studentlist) {
//            System.out.println(item.getAge());
//        }
//    }
public void menuExtended() throws InputMismatchException {

    Scanner scanner = new Scanner(System.in);

    System.out.println("""
            Type 1 to write objects to file
            Type 2 to read content from file
            Type 3 to add new object to the list.
            Type 4 to remove an object from the list.
            Type 5 to read all the objects from the list.
            Type 6 to update the object from the list.
            Type 7 to exit.
            """);
    ObjectFile objc = new ObjectFile();

    List<StudentFaculty> studentlist = new ArrayList<>();
    List<StudentGroup> studentlist1 = new ArrayList<>();

    StudentFaculty studentFaculty = new StudentFaculty("Stepan", true, 18, "Economic");
    StudentGroup studentGroup = new StudentGroup(true, "Economic", "EKT11");

    studentlist.add(studentFaculty);
    studentlist1.add(studentGroup);

    while (scanner.hasNext()) {
        switch (scanner.nextInt()) {
            case 1:
                try {
                    objc.writeObjectToFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Objects were written to the file");
                break;
            case 2:
                System.out.println("Reading objects...");
                objc.readObjectFromFile();
                break;
            case 3:
                System.out.println("Adding object to the lists.");
                studentlist.add(studentFaculty);
                studentlist1.add(studentGroup);
                break;
            case 4:
                System.out.println("Removing objects from the lists.");
                studentlist.remove(0);
                studentlist1.remove(0);
                break;
            case 5:
                System.out.println("Reading objects from the lists...");
                for (StudentFaculty item: studentlist) {
                    System.out.println(item);
                }
                for (StudentFaculty item1: studentlist1) {
                    System.out.println(item1);
                }
                break;
            case 6:
                System.out.println("Updating the objects...");
                studentFaculty.setAge(19);
                studentlist1.set(0, new StudentGroup(true, "Economic", "EKT12"));
                break;
            case 7:
                System.out.println("Exit.");
                scanner.close();
                return;
            default:
                System.out.println("Try 1-7");
        }
    }
}

    public static void main(String[] args) {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        try {
            collectionsDemo.menuExtended();} catch (InputMismatchException e)
        {
            System.out.println(e + " It means, that you can input only from 1 to 7");
        }


    }
}
