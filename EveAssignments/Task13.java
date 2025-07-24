package EveAssignments;
import java.util.Scanner;

public class Task13 {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (e.g., MONDAY): ");
        String userInputDay = scanner.nextLine().toUpperCase();

        try {
            Day selectedDay = Day.valueOf(userInputDay);

            switch (selectedDay) {
                case MONDAY:
                    System.out.println("Start of the work week!");
                    break;
                case FRIDAY:
                    System.out.println("Almost the weekend!");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It's the weekend!");
                    break;
                default:
                    System.out.println("Midweek grind!");
            }

        } catch (IllegalArgumentException invalidDay) {
            System.out.println("Invalid day entered.");
        }

        scanner.close();
    }
}
