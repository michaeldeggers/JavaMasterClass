package com.michaeldeggers;

public class IfKeywordsAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 999;
        int levelCompleted = 5;
        int bonus = 100;

//	    // if statements can be used without the code block {},
//		// but only the line after will be considered part of the block
//		// probably best practice to always use code blocks
//	    if (score < 5000 && score > 1000) {
//			System.out.println("Your score was less that 5000 and greater than 1000.");
//		} else if (score < 1000) {
//			System.out.println("your score was less than 1000");
//        } else {
//			System.out.println("Got Here");
//		}

        if (gameOver) {
            computeAndPrintFinalScore(score, levelCompleted, bonus);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            computeAndPrintFinalScore(score, levelCompleted, bonus);
        }
    }

    private static void computeAndPrintFinalScore(int score, int levelCompleted, int bonus) {
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }
}
