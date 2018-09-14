package com.michaeldeggers;

// create method getDurationString(minutes, seconds)
// minutes >= 0, seconds >= 0, <= 59, else return "Invalid value"
// calculate hours, mins, secs in format "XXh YYm ZZs"

// create second method getDurationString(seconds)
// seconds >= 0, else "Invalid Value
// calculate mins, secs, then call original method

// notes: 61 min, output 01h 01m 00s

public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println("Expected Valid:");

        System.out.println(getDurationString(30, 30));

        System.out.println(getDurationString(61, 30));

        System.out.println(getDurationString(60, 30));

        System.out.println(getDurationString(45, 30));


        System.out.println(getDurationString(0));

        System.out.println(getDurationString(45));

        System.out.println(getDurationString(60));

        System.out.println(getDurationString(61));

        System.out.println(getDurationString(120));

        System.out.println(getDurationString(121));

        System.out.println(getDurationString(3600));

        System.out.println(getDurationString(3615));

        System.out.println(getDurationString(3661));

        // Expected Invalid
        System.out.println("Expected Invalid:");

        System.out.println(getDurationString(-1, 30));

        System.out.println(getDurationString(30, -1));

        System.out.println(getDurationString(30, 61));

        System.out.println(getDurationString(-1));
    }

    private static String getDurationString(int minutes, int seconds) {
        String result;

        // is it better practice to insert a return to end the method right away,
        // or return the result at the end of the method like below?

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = (minutes >= 60) ? minutes / 60 : 0;
            int remainingMinutes = minutes % 60;

            String hoursString = (hours < 10) ? "0" + hours + "h" : hours + "h";
            String minutesString = (remainingMinutes < 10) ? "0" + remainingMinutes + "m" : remainingMinutes + "m";
            String secondsString = (seconds < 10) ? "0" + seconds + "s" : seconds + "s";

            result = hoursString + " " + minutesString + " " + secondsString + ".";
        } else {
            result = "Invalid Value";
        }

        return result;
    }

    private static String getDurationString(int seconds) {
        String result;

        if (seconds >= 0) {
            int minutes = (seconds >= 60) ? seconds / 60 : 0;
            int remainingSeconds = seconds % 60;
            result = getDurationString(minutes, remainingSeconds);
        } else {
            result = "Invalid Value";
        }

        return result;
    }

}
