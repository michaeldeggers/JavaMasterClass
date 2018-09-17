public class EqualityPrinter {
    // printEqual, 3 params, int, void
    // one param < 0 = print Invalid Value
    // all equal, print All numbers are equal
    // all different, print "All number are different
    // else Neither all are equal or different
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int x, int y, int z) {
        String result = "Invalid Value";

        if (x >= 0 && y >= 0 && z >= 0) {
            if (x == y && x == z) {
                result = "All numbers are equal";
            } else if (x != y && x != z && y != z) {
                result = "All numbers are different";
            } else {
                result = "Neither all are equal or different";
            }
        }

        System.out.println(result);
    }
}
