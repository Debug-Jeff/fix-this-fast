import java.util.Scanner;

public class BrokenCalculator {
    public static double add(double x y) {
        return x + y;
    }

    public static double subtract(double x, double y) 
        return x - y;
    }

    public static double multiply(double x, double y) {
    return x * y;
    }

    public static double divide(double x, double y) {
        if (y = 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        } else
            return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        System.out.println("Welcome to the calculator!");
        
        System.out.print("Enter first number: ");
        String num1 = scanner.nextLine();
        
        System.out.print("Enter second number: ");
        String num2 = scanner.nextLine();

        System.out.println("Choose operation: +, -, *, /");
        System.out.print("Enter operation: ");
        String choice = scanner.nextLine();

        if (choice.equals("+")) {
            System.out.println("Result is: " + add(num1, num2));
        } else if (choice.equals("-")) {
            System.out.println("Result is: " + subtract(num1, num2));
        } else if (choice.equals("*")) {
            System.out.println("Result is: " + multiply(num1, num2));
        } else if (choice.equals("/")) {
            System.out.println("Result is: " + divide(num1, num2));
        } else
            System.out.println("Invalid operation")
    }