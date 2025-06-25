import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = sc.nextDouble();
        System.out.print("Enter number b: ");
        double b = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String operation = sc.nextLine().toLowerCase();

        double result;
        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "divide":
                if (b != 0) result = a / b;
                else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
