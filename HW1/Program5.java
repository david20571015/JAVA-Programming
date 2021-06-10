import java.util.Scanner;
import java.lang.Math.*;

public class Program5 {
    public static void main(String args[]) {
        System.out.println("radius = ");

        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        System.out.println("Diameter = " + (radius * 2));
        System.out.println("Circumference = " + (2 * Math.PI * radius));
        System.out.println("Area = " + (Math.PI * radius * radius));

        System.exit(0);
    }
}