package com.michaeldeggers;

public class While {
    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            System.out.println("(while) Count value is " + count);
//            count++;
//        }
//
//        // will not run
//        count = 6;
//        while (count != 6) {
//            System.out.println("(while) Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("(while true) Count value is " + count);
//            count++;
//        }
//
//        for (count = 1; count != 6; count++) {
//            System.out.println("(for loop) Count value is " + count);
//        }
//
//        // well always execute at least once
//        count = 1;
//        do {
//            System.out.println("(do while) Count value was " + count);
//            count++;
//        } while(count !=6);

        int number = 4;
        int finishNumber = 22;

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) continue;

            System.out.println("Even Number " + number);
        }
    }

    public static boolean isEvenNumber(int num) {

        if (num % 2 == 0) return true;

        return false;
    }
}
