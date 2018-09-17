public class AreaCalculator {
    // method area with param double radius - return double area
    // if radius is neg, return -1

    // method area with params x and y (doubles) representing sides of rectangle
    // if either is neg, return -1
    // else return area of rectangle

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1, 4.0));
    }

    public static double area(double radius) {
        double area;

        if (radius >= 0) {
            area = radius * radius * 3.14159;
        } else {
            area = -1;
        }

        return area;
    }

    public static double area(double x, double y) {
        double area;

        if (x >= 0 && y >= 0) {
            area = x * y;
        } else {
            area = -1;
        }

        return area;
    }
}
