package EveAssignments;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate today = LocalDate.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateFormatted = today.format(dateFormat);

        System.out.print("Enter amount: ");
        double inputAmount = scanner.nextDouble();

        DecimalFormat rupeeFormat = new DecimalFormat("₹#,##0.00");
        String formattedCurrency = rupeeFormat.format(inputAmount);

        System.out.println("Current Date: " + currentDateFormatted);
        System.out.println("Formatted Amount: " + formattedCurrency);

        scanner.close();
    }
}
