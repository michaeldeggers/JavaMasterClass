public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        int lastA;
        int lastB;
        int lastC;

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        lastA = a % 10;
        lastB = b % 10;
        lastC = c % 10;

        if (lastA == lastB || lastA == lastC || lastB == lastC) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        }

        return true;
    }
}
