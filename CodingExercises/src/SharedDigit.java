public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
//        System.out.println(hasSharedDigit(13, 48));
//        System.out.println(hasSharedDigit(58, 58));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        do {
            int digitA = a % 10;
            int tmpB = b;

            do {
                int digitB = tmpB % 10;

                if (digitA == digitB) return true;
                tmpB /= 10;

            } while(tmpB > 0);

            a /= 10;

        } while(a > 0);

        return false;
    }
}
