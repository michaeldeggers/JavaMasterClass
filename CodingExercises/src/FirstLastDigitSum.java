public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(-123));
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int firstDigit = -1;
        int lastDigit;

        do {
            int digit = number % 10;
            number /= 10;
            if(firstDigit == -1) {
                firstDigit = digit;
            }
            lastDigit = digit;

        } while(number > 0);

        return firstDigit + lastDigit;
    }
}
