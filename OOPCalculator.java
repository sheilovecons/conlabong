import java.util.Scanner;

public class OOPCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5."
                    + " Modulo\nOther Number to Exit\nEnter a number: ");
            int cal = sc.nextInt();
            if (cal < 1 || cal > 5) {
                System.exit(0);
            }
            System.out.println("Enter 1st Number: ");
            double a = sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            double b = sc.nextInt();
            OOPCalculator oop = new OOPCalculator();
            if (cal == 1) {
                System.out.printf("Result: %.2f\n\n\n\n", oop.add(a, b));
            } else if (cal == 2) {
                System.out.printf("Result: %.2f\n\n\n\n", oop.subtract(a, b));
            } else if (cal == 3) {
                System.out.printf("Result: %.2f\n\n\n\n", oop.divide(a, b));
            } else if (cal == 4) {
                System.out.printf("Result: %.2f\n\n\n\n", oop.multiply(a, b));
            } else if (cal == 5) {
                System.out.printf("Result: %.2f\n\n\n\n", oop.modulo(a, b));
            }
        } while (true);
    }

    double add(double a, double b) {
        double c = a + b;
        return c;
    }

    double subtract(double a, double b) {
        double c = a - b;
        return c;
    }

    double divide(double a, double b) {
        double c = a / b;
        return c;
    }

    double multiply(double a, double b) {
        double c = a * b;
        return c;
    }

    double modulo(double a, double b) {
        double c = a % b;
        return c;
    }

}