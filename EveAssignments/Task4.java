package EveAssignments;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String userFirstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String userLastName = scanner.nextLine();

        System.out.println("\nHello, " + userFirstName + " " + userLastName + "! Welcome to the system.");

        scanner.close();
    }
}
