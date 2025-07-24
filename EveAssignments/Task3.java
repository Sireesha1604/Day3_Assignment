package EveAssignments;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int totalSum = firstNumber + secondNumber;
        int maxNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        boolean areBothPositive = (firstNumber > 0 && secondNumber > 0);

        System.out.println("\nAddition: " + totalSum);
        System.out.println("Greater number: " + maxNumber);
        System.out.println("Are both positive? " + areBothPositive);

        scanner.close();
    }
}
