package EveAssignments;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char targetChar = scanner.next().charAt(0);

        int occurrenceCount = 0;

        for (int index = 0; index < inputString.length(); index++) {
            if (inputString.charAt(index) == targetChar) {
                occurrenceCount++;
            }
        }

        System.out.println("Character '" + targetChar + "' appears " + occurrenceCount + " times.");

        scanner.close();
    }
}
