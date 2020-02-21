import java.util.Scanner;

public class FunctionalCalculator {

    static FunctionalCalculator function = new FunctionalCalculator();

    public static void main(String[] args) {
        function.func();
    }

    void func() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Addition\n2. Subtraction\n3. Division\n4. "
                    + "Multiplication\n5. Modulo\nOther Number to Exit\nEnter a number: ");
            int cal = sc.nextInt();
            if (cal < 1 || cal > 5) {
                System.exit(0);
            }
            System.out.println("Enter 1st Number: ");
            double a = sc.nextInt();
            System.out.println("Enter 2nd Number: ");
            double b = sc.nextInt();
            choice(cal, a, b);

        } while (true);
    }

    void choice(int cal, double a, double b) {
        double c = 0;
        Scanner sc = new Scanner(System.in);
        if (cal == 1) {
            c = add(a, b);

        } else if (cal == 2) {

            c = subtract(a, b);
        } else if (cal == 3) {

            c = divide(a, b);
        } else if (cal == 4) {

            c = multiply(a, b);
        } else if (cal == 5) {

            c = modulo(a, b);
        }
        System.out.printf("Result: %.2f\n\n\n\n", c);
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