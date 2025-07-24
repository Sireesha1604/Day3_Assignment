package EveAssignments;
import java.util.Scanner;

class Employee {
    String employeeName;
    double employeeSalary;

    public Employee(String employeeName, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}

class Manager extends Employee {
    String managerDepartment;

    public Manager(String employeeName, double employeeSalary, String managerDepartment) {
        super(employeeName, employeeSalary);
        this.managerDepartment = managerDepartment;
    }

    public void displayInfo() {
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Department: " + managerDepartment);
    }
}

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String inputName = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double inputSalary = scanner.nextDouble();
        scanner.nextLine();  // consume leftover newline

        System.out.print("Enter Department: ");
        String inputDepartment = scanner.nextLine();

        Manager manager = new Manager(inputName, inputSalary, inputDepartment);
        manager.displayInfo();

        scanner.close();
    }
}
