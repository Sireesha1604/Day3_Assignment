package EveAssignments;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter Operation (+, -, *, /): ");
        char mathOperator = scanner.next().charAt(0);

        double calculationResult;

        switch (mathOperator) {
            case '+':
                calculationResult = firstNumber + secondNumber;
                System.out.println("Result: " + calculationResult);
                break;
            case '-':
                calculationResult = firstNumber - secondNumber;
                System.out.println("Result: " + calculationResult);
                break;
            case '*':
                calculationResult = firstNumber * secondNumber;
                System.out.println("Result: " + calculationResult);
                break;
            case '/':
                if (secondNumber != 0) {
                    calculationResult = firstNumber / secondNumber;
                    System.out.println("Result: " + calculationResult);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
