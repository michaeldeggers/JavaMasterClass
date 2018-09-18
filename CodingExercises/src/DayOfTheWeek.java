public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printDayOfTheWeek(-1);

        printDayOfTheWeekRev(1);
        printDayOfTheWeekRev(-1);
    }

    private static void printDayOfTheWeek(int day) {
        String result;

        switch(day) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            default:
                result = "Invalid Value";
        }

        System.out.println(result);
    }

    private static void printDayOfTheWeekRev(int day) {
        String result;

        if (day == 0) {
            result = "Sunday";
        } else if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else {
            result = "Invalid Value";
        }

        System.out.println(result);
    }
}
