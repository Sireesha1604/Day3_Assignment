package EveAssignments;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String inputText = scanner.nextLine();

        StringBuilder reversedBuilder = new StringBuilder(inputText);
        String reversedText = reversedBuilder.reverse().toString();

        System.out.println("Original: " + inputText);
        System.out.println("Reversed: " + reversedText);

        scanner.close();
    }
}
