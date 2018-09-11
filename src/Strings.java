public class Strings {
    public static void main(String[] args) {
        // write your code here
        // byte
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00a9 2018";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // converts myInt to string and appends to end.
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber; // similarly converts to string
        System.out.println(lastString);
    }
}
