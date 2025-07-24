package EveAssignments;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // consume leftover newline

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student Marks: ");
        double studentMarks = scanner.nextDouble();

        System.out.print("Enter Student Grade: ");
        char studentGrade = scanner.next().charAt(0);

        System.out.println("\n--- Student Information ---");
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + studentName);
        System.out.println("Marks: " + studentMarks);
        System.out.println("Grade: " + studentGrade);

        scanner.close();
    }
}
