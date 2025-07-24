package EveAssignments;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int totalEvenNumbers = scanner.nextInt();

        System.out.println("First " + totalEvenNumbers + " even numbers:");

        for (int count = 0; count < totalEvenNumbers; count++) {
            System.out.print((count * 2) + " ");
        }

        scanner.close();
    }
}
