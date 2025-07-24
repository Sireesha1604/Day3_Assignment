package EveAssignments;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int personAge = scanner.nextInt();

        System.out.print("Enter your height in cm: ");
        float personHeight = scanner.nextFloat();

        System.out.print("Enter your weight in kg: ");
        float personWeight = scanner.nextFloat();

        System.out.println("\n--- Person Details ---");
        System.out.println("Age: " + personAge + " years");
        System.out.println("Height: " + personHeight + " cm");
        System.out.println("Weight: " + personWeight + " kg");

        scanner.close();
    }
}
