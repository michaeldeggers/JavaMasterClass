public class EqualSumChecker {
    public static void main(String[] args) {

    }

    public static boolean hasEqualSum(int var1,int var2,int var3) {
        boolean isEqual = false;

        int result = var1 + var2;

        if (result == var3) {
            isEqual = true;
        }

        return isEqual;
    }
}
