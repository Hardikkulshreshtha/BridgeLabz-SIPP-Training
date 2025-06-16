import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Simple Calculator");
        System.out.println("----------------");

        // Input first number
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // Perform calculation using switch case
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }

        scanner.close();
    }
} 