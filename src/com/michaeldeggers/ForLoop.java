package com.michaeldeggers;

public class ForLoop {

    public static void main(String[] args) {
//        testCalculateInterest(-1, 2);
//        testCalculateInterest(1, 1);
//        testCalculateInterest(1, 5);
        findNPrimes(1, 5, 3);
        findNPrimes(1, 1000, 3);
        findNPrimes(10, 50, 5);
        findNPrimes(438, 12000, 20);
    }

    public static void testCalculateInterest(int x, int y) {
        if ((x <= 0) || (y <= x)) return;

        for(int i = x; i < y + 1; i++) {
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for(int i = y; i >=x; i--) {
            System.out.println("10,000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void findNPrimes(int x, int y, int n) {
        int count = 0;

        if ((x <= 0) || (y <= x) || (n < 1)) return;

        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                count ++;
                System.out.println("Number " + i + " is a prime number.");
            }

            if (count == n) break;
        }
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
