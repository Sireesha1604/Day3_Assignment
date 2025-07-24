package EveAssignments;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumbers = new int[5];
        int totalSum = 0;

        System.out.println("Enter 5 numbers:");
        for (int index = 0; index < 5; index++) {
            inputNumbers[index] = scanner.nextInt();
            totalSum += inputNumbers[index];
        }

        double averageValue = (double) totalSum / 5;
        System.out.println("Average: " + averageValue);

        scanner.close();
    }
}
