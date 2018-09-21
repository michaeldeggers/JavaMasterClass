public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static int getDaysInMonth(int month, int year) {
        int result;

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        boolean isLeapYear = isLeapYear(year);

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                result = (isLeapYear) ? 29 : 28;
                break;
            default:
                result = -1;
        }

        return result;
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;

        if (year >= 1 && year <= 9999) {
            result = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? true : false;
        }

        return result;
    }
}
