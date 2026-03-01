import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter The Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose The Operation: +,-,*,/ ");
        char op = scanner.next().charAt(0);

        double result = 0;

        if (op == '+') {
            result = num1 + num2;
        }
        else if (op == '-') {
            result = num1 - num2;
        }
        else if (op == '*') {
            result = num1 * num2;
        }
        else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                scanner.close();
                return;
            }
        }
        else {
            System.out.println("Invalid operation!");
            scanner.close();
            return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}