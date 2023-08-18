package org.interswitch.apptest;




import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        SimpleCalculator calculator = new SimpleCalculator(num1, num2);

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = calculator.add();
                break;
            case 2:
                result = calculator.subtract();
                break;
            case 3:
                result = calculator.multiply();
                break;
            case 4:
                try {
                    result = calculator.divide();
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
