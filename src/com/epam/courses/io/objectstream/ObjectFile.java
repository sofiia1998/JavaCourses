package com.epam.courses.io.objectstream;

import com.epam.courses.principles.Student;
import com.epam.courses.principles.StudentFaculty;
import com.epam.courses.principles.StudentGroup;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ObjectFile {

    public void writeObjectToFile() throws IOException {

        Student student = new StudentFaculty(true, "Economic");
        StudentGroup studentGroup = new StudentGroup(false, "Economic", "EKT1");
        Path path = Path.of(".\\src\\com\\epam\\courses\\io\\object.txt");

        Files.write(path, student.toString().getBytes(), StandardOpenOption.APPEND);
        Files.write(path, studentGroup.toString().getBytes(), StandardOpenOption.APPEND);
    }

    public void readObjectFromFile() {
        Path path = Path.of(".\\src\\com\\epam\\courses\\io\\object.txt");
        try {
            Files.readAllLines(path).forEach(l -> System.out.println(l));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


//        Student student = new StudentFaculty(true, "Economic");
//        System.out.println(student);
//        System.out.println(student);
    }
//                ObjectStreamFileDemo objc = new ObjectStreamFileDemo();
//
//                objc.filesExistence();
//
//                File fily = new File(".\\src\\com\\epam\\courses\\io\\object.txt");
//
//                try (FileOutputStream fos = new FileOutputStream(fily);
//                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//                    Dog dog = new Dog(2, "Inu");
//                    Dog dog1 = new Dog(2, "You");
//                    oos.writeObject(dog);
//                    oos.writeObject(dog1);
//
//                } catch (FileNotFoundException e) {
//                    throw new RuntimeException(e);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//
//                try (FileInputStream fis = new FileInputStream(fily);
//                     ObjectInputStream ois = new ObjectInputStream(fis)) {
//                    Dog dog = (Dog) ois.readObject();
//                    System.out.println(dog);
//                } catch (FileNotFoundException e) {
//                    throw new RuntimeException(e);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                } catch (ClassNotFoundException e) {
//                    throw new RuntimeException(e);
//                }
