package com.michaeldeggers;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore;
        int highScorePosition;

        String playerOneName = "Bob";
        String playerTwoName = "Frank";
        String playerThreeName = "Jack";
        String playerFourName = "Janet";

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score is " + highScore);

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition(playerOneName, highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition(playerTwoName, highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition(playerThreeName, highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition(playerFourName, highScorePosition);


    }

    // cannot put a method within another method
    // don't want to put it outside the public Class either
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int result = -1;

        if (gameOver) {
            result = score + (levelCompleted * bonus);
            result += 1000;
            System.out.println("Your final score is " + result);
        }

        return result;
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100); {
            position = 3;
        }

        return position;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " is in position " + position + " on the high score table.");
    }
}
