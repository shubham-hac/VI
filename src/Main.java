import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to Star Protect Vehicle System");
            System.out.println("Select Role:");
            System.out.println("1. Admin Login");
            System.out.println("2. UnderWriter Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                Admin.adminLogin();
            } else if (choice == 2) {
                underWriterLogin();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void underWriterLogin() {
        while (true) { // Keep asking until correct credentials or exit
            System.out.print("Enter Underwriter UserID (or type 'exit' to quit): ");
            String userId = scanner.nextLine();

            // Check if user wants to exit
            if (userId.equalsIgnoreCase("exit")) {
                System.out.println("🔙 Returning to the main menu...");
                break; // Exit and go back to main menu
            }

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            UnderWriter uw = UnderWriter.authenticateUnderwriter(userId, password);

            if (uw != null) {
                System.out.println("✅ Underwriter Login Successful!");
                underWriterMenu(uw); // Open Underwriter Menu
                break; // Exit loop after successful login
            } else {
                System.out.println("❌ Invalid Underwriter Credentials. Please try again or type 'exit' to go back.");
            }
        }
    }



    private static void underWriterMenu(UnderWriter uw) {
        while (true) {
            System.out.println("\n--- Underwriter Menu ---");
            System.out.println("1. Create New Vehicle Insurance");
            System.out.println("2. Renew Vehicle Policy");
            System.out.println("3. Change Policy Type");
            System.out.println("4. View Vehicle Insurance Policies");
            System.out.println("5. Logout");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    uw.createVehicleInsurance(); //
                    break;
                case 2:
                    uw.renewPolicy(); // Renew policy
                    break;
                case 3:
                    uw.changePolicyType(); // Change policy type
                    break;
                case 4:
                    uw.viewPolicyMenu(); // View all policies
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return; // Exit to main menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
