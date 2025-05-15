package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month : ");
        String month = scanner.nextLine();
        int numberOfDays;

        switch (month) {
            case "jan":
                numberOfDays = 31;
                break;
            case "feb":
                numberOfDays = 28;
                break;
            case "mar":
                numberOfDays = 31;
                break;
            case "apr":
                numberOfDays = 30;
                break;
            case "may":
                numberOfDays = 31;
                break;
            case "jun":
                numberOfDays = 30;
                break;
            case "jul":
                numberOfDays = 31;
                break;
            case "aug":
                numberOfDays = 31;
                break;
            case "sep":
                numberOfDays = 30;
                break;
            case "oct":
                numberOfDays = 31;
                break;
            case "nov":
                numberOfDays = 30;
                break;
                
            case "dec":
                numberOfDays = 31;
                break;
            default:
                numberOfDays = 0;
        }

        System.out.println(numberOfDays+" days.");
    }
}