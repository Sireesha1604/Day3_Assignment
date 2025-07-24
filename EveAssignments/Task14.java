package EveAssignments;
import java.util.Scanner;

class Student {
    String studentName;
    int studentMarks;

    public Student(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + studentMarks);
    }
}

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String inputName = scanner.nextLine();

        System.out.print("Enter Marks: ");
        int inputMarks = scanner.nextInt();

        Student student = new Student(inputName, inputMarks);
        student.displayInfo();

        scanner.close();
    }
}
