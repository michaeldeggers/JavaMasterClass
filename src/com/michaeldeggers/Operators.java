package com.michaeldeggers;

public class Operators {
    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);


        boolean isAlien = true;
        if (!isAlien)
            System.out.println("It is not an alien.");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100!");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true.");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is not supposed to happen.");

        // ternary
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("True");
        }


        // 1. Create a double var with the value 20
        // 2. Create a double var with the value 80
        // 3. Add both numbers and multiply by 25
        // 4. Find the remainder #3 / 40
        // 5. If value exceeds limit of 20, print "Total was over limit"

        double val1 = 20;
        double val2 = 80;
        double val3 = (val1 + val2) * 25;
        double val4 = val3 % 40;
        if (val4 <= 20)
            System.out.println("Over the limit");

    }
}
