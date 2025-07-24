package EveAssignments;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int studentMarks = scanner.nextInt();

        String studentGrade;

        if (studentMarks >= 90) {
            studentGrade = "A+";
        } else if (studentMarks >= 80) {
            studentGrade = "A";
        } else if (studentMarks >= 70) {
            studentGrade = "B";
        } else if (studentMarks >= 60) {
            studentGrade = "C";
        } else if (studentMarks >= 50) {
            studentGrade = "D";
        } else {
            studentGrade = "F";
        }

        System.out.println("Grade: " + studentGrade);

        scanner.close();
    }
}
