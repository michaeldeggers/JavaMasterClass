package com.michaeldeggers;

public class Switch {
    public static void main(String[] args) {
        int intValue = 3;

        switch (intValue) {
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was 3, 4, or 5");
                break;

            default:
                System.out.println("neither");
                break;
        }

        // Challenge:
        // char switch statement, A, B, C, D, E
        // Display message if found, else
        // Display not found message

        char charValue = 'C';

        switch (charValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Char value " + charValue + " found.");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "october":
                System.out.println("Oct");
                break;

            default:
                System.out.println("Not found.");
                break;
        }
    }
}
