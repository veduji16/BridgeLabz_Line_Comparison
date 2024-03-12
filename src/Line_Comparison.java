import java.util.*;

public class Line_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("...Welcome to Line Computation Program...");
        System.out.println();
        System.out.println();

        System.out.print("Enter the coordinates of x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter the coordinates of y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter the coordinates of x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter the coordinates of y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Enter the coordinates of x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter the coordinates of y3: ");
        double y3 = sc.nextDouble();
        System.out.print("Enter the coordinates of x4: ");
        double x4 = sc.nextDouble();
        System.out.print("Enter the coordinates of y4: ");
        double y4 = sc.nextDouble();

        double length_1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of the line: " + length_1);

        double length_2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
        System.out.println("Length of the line: " + length_2);

        if (String.valueOf(length_1).compareTo(String.valueOf(length_2)) == 0) {
            System.out.println("Lines are equal");
        } else if (String.valueOf(length_1).compareTo(String.valueOf(length_2)) > 0) {
            System.out.println("Length of Line 1 is greater than length of Line 2");
        } else {
            System.out.println("Length of Line 1 is smaller than length of Line 2");
        }
        sc.close();
    }
}
