package com.michaeldeggers;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 1 is " + sumDigits(1));
        System.out.println("The sum of digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of digits in number 1250 is " + sumDigits(1250));
    }

    private static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;

            do {
                int digit = number % 10;
                number /= 10;
                sum += digit;

            } while(number > 0);

            return sum;
        }

        return -1;
    }
}
