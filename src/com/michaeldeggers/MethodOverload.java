package com.michaeldeggers;

public class MethodOverload {
    public static void main(String[] args) {
//	    int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//	    calculateScore(200);
//	    calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(1, 6));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 6));
        System.out.println(calcFeetAndInchesToCentimeters(1, 13));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 13));

        System.out.println(calcFeetAndInchesToCentimeters(14));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + " scored " + score + " points.");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double result;

        if (feet >= 0 && ((inches >= 0) && (inches <= 12))) {
            inches += feet * 12;
            result = inches * 2.54;
        } else {
            result = -1;
            System.out.println("Error: Invalid parameters.");
        }

        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double result;

        if (inches >= 0) {
            result = inches * 2.54;
        } else {
            result = -1;
            System.out.println("Error: Invalid parameters.");
        }

        return result;
    }
}
