public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        int divisor = 1;

        while (divisor <= number) {
            if (number % divisor == 0) {
                System.out.println(divisor);
            }

            divisor++;
        }
    }
}
