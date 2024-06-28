import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display menu
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        // Get user input for operation
        System.out.print("Enter choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        
        // Get user input for numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        switch (choice) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                else
                    System.out.println("Error! Division by zero.");
                break;
            default:
                System.out.println("Invalid input! Please enter choice between 1-4.");
                break;
        }
        
        scanner.close();
    }

    // Method to perform addition
    public static double add(double x, double y) {
        return x + y;
    }

    // Method to perform subtraction
    public static double subtract(double x, double y) {
        return x - y;
    }

    // Method to perform multiplication
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Method to perform division
    public static double divide(double x, double y) {
        return x / y;
    }
}
