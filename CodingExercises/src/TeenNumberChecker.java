public class TeenNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int var1, int var2, int var3) {
        boolean isTeen = false;

        if ((var1 >= 13 && var1 <= 19) || (var2 >= 13 && var2 <= 19) || (var3 >= 13 && var3 <= 19)) {
            isTeen = true;
        }

        return isTeen;
    }
}
