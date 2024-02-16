package calculatordemo;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu options
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get user choice
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Get user input for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations based on user choice
        double result = 0;
        Calculator calculator = new Calculator();

        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                break;
            case 4:
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}

