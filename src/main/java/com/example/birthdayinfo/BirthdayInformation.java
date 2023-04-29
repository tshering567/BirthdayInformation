package com.example.birthdayinfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//import java.time.DayOfWeek;
public class BirthdayInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Please enter your Birthday Information as : MM/dd/yyyy ");
        String userInput = scanner.nextLine();

        LocalDate birthDay = LocalDate.parse(userInput, formatter);
        String dayOfWeek = birthDay.getDayOfWeek().toString();

        System.out.println("You were born on " + dayOfWeek);




    }

}
