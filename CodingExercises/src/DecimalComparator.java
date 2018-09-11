public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        boolean result = false;

        double dTrunc1 = truncThree(d1);
        double dTrunc2 = truncThree(d2);

        if (dTrunc1 == dTrunc2) {
            result = true;
        }

        return result;
    }

    public static double truncThree(double d) {
        return (long) (d * 1e3) / 1e3;
    }
}
