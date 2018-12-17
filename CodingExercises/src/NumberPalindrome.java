public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(num + " is a palindrome: " + isPalindrome(num));

        num = -121;
        System.out.println(num + " is a palindrome: " + isPalindrome(num));

        num = 323;
        System.out.println(num + " is a palindrome: " + isPalindrome(num));

        num = 122;
        System.out.println(num + " is a palindrome: " + isPalindrome(num));

        num = 123321;
        System.out.println(num + " is a palindrome: " + isPalindrome(num));

        num = -222;
        System.out.println(num + " is a palindrome: " + isPalindrome(num));

        num = 222;
        System.out.println(num + " is a palindrome: " + isPalindrome(num));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = java.lang.Math.abs(number);

        while (num > 0) {
            int digit = num % 10;

            reverse *= 10;
            reverse += digit;

            num /= 10;
        }

        if (reverse == java.lang.Math.abs(number)) return true;

        return false;
    }
}
