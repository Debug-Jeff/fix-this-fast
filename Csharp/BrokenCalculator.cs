using System;

class BrokenCalculator {
    static double Add(double x y) {
        return x + y;
    }

    static double Subtract(double x, double y) 
        return x - y;
    }

    static double Multiply(double x, double y) {
    return x * y;
    }

    static double Divide(double x, double y) {
        if (y = 0) {
            throw new DivideByZeroException("Cannot divide by zero!");
        } else
            return x / y;
    }

    static void Main(string[] args) {
        Console.WriteLine("Welcome to the calculator!")
        
        Console.Write("Enter first number: ");
        string num1 = Console.ReadLine();
        
        Console.Write("Enter second number: ");
        string num2 = Console.ReadLine();

        Console.WriteLine("Choose operation: +, -, *, /");
        Console.Write("Enter operation: ");
        string choice = Console.ReadLine();

        if (choice == "+") {
            Console.WriteLine("Result is: " + Add(num1, num2));
        } else if (choice == "-") {
            Console.WriteLine("Result is: " + Subtract(num1, num2));
        } else if (choice == "*") {
            Console.WriteLine("Result is: " + Multiply(num1, num2));
        } else if (choice == "/") {
            Console.WriteLine("Result is: " + Divide(num1, num2));
        } else
            Console.WriteLine("Invalid operation")