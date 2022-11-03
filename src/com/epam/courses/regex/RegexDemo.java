package com.epam.courses.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(validateEmail(scanner.next()));

        System.out.println(validateDate(scanner.next()));

        System.out.println(validatePhone(scanner.next()));

        System.out.println(validateISBN(scanner.next()));

    }



    public static boolean validateEmail(String emailStr) {
        Pattern regexEmail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = regexEmail.matcher(emailStr);
        return matcher.find();
    }

    public static boolean validatePhone(String phoneStr) {
        Pattern regexAllCountriesPhone = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
        Matcher matcher = regexAllCountriesPhone.matcher(phoneStr);
        return matcher.find();
    }

    public static boolean validateISBN(String isbnStr) {
        Pattern regexISBN = Pattern.compile("^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$");
        Matcher matcher = regexISBN.matcher(isbnStr);
        return matcher.find();
    }

    public static boolean validateDate(String dateStr) {
        Pattern regexDate = Pattern.compile("\\d{4}\\-(Aug?|Oct?|Nov?|Dec?|Jan?|Feb?|Mar?|Apr?|May?|Jun?|Jul?|Sep?)\\-(0?[1-9]|[12][0-9]|3[01])*");
        Matcher matcher = regexDate.matcher(dateStr);
        return matcher.find();
    }
 }
