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
        String time;

        // Expected Valid
        System.out.println("Expected Valid:");
        time = getDurationString(30, 30);
        System.out.println(time);
        time = getDurationString(61, 30);
        System.out.println(time);
        time = getDurationString(60, 30);
        System.out.println(time);
        time = getDurationString(45, 30);
        System.out.println(time);

        time = getDurationString(0);
        System.out.println(time);
        time = getDurationString(45);
        System.out.println(time);
        time = getDurationString(60);
        System.out.println(time);
        time = getDurationString(61);
        System.out.println(time);
        time = getDurationString(120);
        System.out.println(time);
        time = getDurationString(121);
        System.out.println(time);
        time = getDurationString(3600);
        System.out.println(time);
        time = getDurationString(3661);
        System.out.println(time);

        // Expected Invalid
        System.out.println("Expected Invalid:");
        time = getDurationString(-1, 30);
        System.out.println(time);
        time = getDurationString(30, -1);
        System.out.println(time);
        time = getDurationString(30, 61);
        System.out.println(time);
        time = getDurationString(-1);
        System.out.println(time);
    }

    public static String getDurationString(int minutes, int seconds) {
        String result;

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = (minutes >= 60) ? minutes / 60 : 0;
            result = hours + "h " + minutes % 60 + "m " + seconds + "s";
        } else {
            result = "Invalid Value";
        }

        return result;
    }

    public static String getDurationString(int seconds) {
        String result;

        if (seconds >= 0) {
            int minutes = (seconds >= 60) ? seconds / 60 : 0;
            result = getDurationString(minutes, seconds % 60);
        } else {
            result = "Invalid Value";
        }

        return result;
    }

}
