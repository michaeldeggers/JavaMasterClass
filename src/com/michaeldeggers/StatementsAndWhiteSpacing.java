package com.michaeldeggers;

public class StatementsAndWhiteSpacing {
    public static void main(String[] args) {
        int myVariable = 50; // entire line is a statement
        myVariable++;
        myVariable--;
        System.out.println("This entire line is a statement."); // semicolons generally needed to end a statement

        System.out.println("This is" +
                " another" +
                " statement");

        int anotherVariable = 50;
        myVariable--; // multiple statements can be written same line, not recommended

        // whitespace is the space between code
        // java will ignore -- this is just ot make things human readable
    }
}
