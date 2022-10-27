package com.epam.courses.io.object_in_file_menu;

import com.epam.courses.io.objectstream.ObjectFile;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ObjectToFileHometask {

    public void menu() throws InputMismatchException{

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 1 to write objects to file\n" +
                "Type 2 to read content from file\n" +
                "Type 3 to exit.\n");

        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    ObjectFile objc = new ObjectFile();
                    try {
                        objc.writeObjectToFile();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Objects were written to the file");
                    break;
                case 2:
                    System.out.println("Reading objects...");
                    ObjectFile objc1 = new ObjectFile();
                    objc1.readObjectFromFile();
                    break;
                case 3:
                    System.out.println("Exit.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Try 1, 2 or 3");
            }
        }
    }

    public static void main(String[] args) {
        ObjectToFileHometask oblc = new ObjectToFileHometask();
        try {
            oblc.menu();} catch (InputMismatchException e)
        {
            System.out.println(e + " It means, that you can input only 1, 2 or 3");
        }


    }
}
