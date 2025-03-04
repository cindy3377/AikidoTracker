import java.util.Scanner;

public class AikidoPracticeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AikidoTracker tracker = new AikidoTracker();

        while (true) {
            System.out.println("===== Aikido Practice Tracker =====");
            System.out.println("1. Add Practice Session");
            System.out.println("2. View Total Practice Time");
            System.out.println("3. Check Graduation Eligibility");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter session date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter duration in minutes: ");
                    int duration = scanner.nextInt();
                    tracker.addSession(date, duration);
                    System.out.println("Session added!\n");
                    break;
                case 2:
                    System.out.println("Total practice time: " + tracker.getTotalPracticeTime() + " minutes\n");
                    break;
                case 3:
                    if (tracker.isEligibleForGraduation()) {
                        System.out.println("Congratulations! You are eligible for Kyu graduation.\n");
                    } else {
                        System.out.println("Not yet eligible for Kyu graduation. Keep training!\n");
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.\n");
            }
        }
    }
}

