import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Admin {
    private static final String adminUserId = "admin";
    private static final String adminPassword = "Password@123";
    public static Scanner scanner = new Scanner(System.in);

    public static void adminLogin() {
        while (true) { // Loop until valid credentials are entered
            System.out.print("Enter Admin UserID: ");
            String userId = scanner.nextLine();
            System.out.print("Enter Admin Password: ");
            String password = scanner.nextLine();

            if (userId.equals(adminUserId) && password.equals(adminPassword)) {
                System.out.println("✅ Admin Login Successful!");
                adminMenu(); // Open Admin Menu
                break; // Exit loop after successful login
            } else {
                System.out.println("❌ Invalid Admin Credentials. Please try again.");
            }
        }
    }


    public static void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Register Underwriter");
            System.out.println("2. Search Underwriter");
            System.out.println("3. Update Underwriter Details");
            System.out.println("4. Delete Underwriter by ID");
            System.out.println("5. View All Underwriters");
            System.out.println("6. View Vehicles by Underwriter ID");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    registerUnderwriter();
                    break;
                case 2:
                    searchUnderwriterMenu();
                    break;
                case 3:
                    updateUnderwriterDetails();
                    break;
                case 4:
                    deleteUnderwriterById(); // Updated method linked
                    break;
                case 5:
                    viewUnderwriters();
                    break;
                case 6:
                    viewVehiclesByUnderwriterId();
                    break;
                case 7:
                    System.out.println("Exiting Admin Menu...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // 1. Register Underwriter
    private static void registerUnderwriter() {
        try {
            System.out.print("Enter Underwriter Name: ");
            String name = UnderWriter.scanner.nextLine();
            System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
            Date dob = parseDate(UnderWriter.scanner.nextLine());
            System.out.print("Enter Joining Date (dd-MM-yyyy): ");
            Date joiningDate = parseDate(UnderWriter.scanner.nextLine());
            System.out.print("Enter Underwriter UserID: ");
            String userId = UnderWriter.scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = UnderWriter.scanner.nextLine();

            // Add the Underwriter
            UnderWriter.addUnderwriter(name, dob, joiningDate, userId, password);
            System.out.println("Underwriter registered successfully!");

            // Display Registered Underwriters
            System.out.println("Registered Underwriters:");
            for (UnderWriter uw : UnderWriter.getUnderWriters()) {
                System.out.println("UserID: " + uw.getUserId() + ", Password: " + uw.getPassword());
            }
        } catch (Exception e) {
            System.out.println("Error registering Underwriter: " + e.getMessage());
        }
    }

    private static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.parse(dateString);
    }
    // 2. Search Underwriter by ID
    private static void searchUnderwriterById() {
        System.out.print("Enter Underwriter ID to Search: ");
        String userId = scanner.nextLine();
        UnderWriter uw = UnderWriter.getUnderwriterByUserId(userId);
        if (uw != null) {
            System.out.println("Underwriter Found: UserID = " + uw.getUserId());
        } else {
            System.out.println("Underwriter not found.");
        }
    }

    // 3. Update Underwriter Password
    private static void updateUnderwriterPassword() {
        System.out.print("Enter Underwriter ID to Update: ");
        String userId = scanner.nextLine();
        System.out.print("Enter New Password: ");
        String newPassword = scanner.nextLine();

        boolean updated = UnderWriter.updateUnderwriterPassword(userId, newPassword);
        if (updated) {
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Underwriter ID not found.");
        }
    }

    // 4. Delete Underwriter by ID
    private static void deleteUnderwriterById() {
        while (true) {
            System.out.print("Enter Underwriter ID to delete: ");
            String userId = scanner.nextLine();

            UnderWriter uw = UnderWriter.searchUnderwriterByUserId(userId);
            if (uw != null) {
                // Underwriter found - Ask for confirmation
                System.out.println("Are you sure you want to delete this underwriter?");
                System.out.println("1. Yes (Delete)");
                System.out.println("2. No (Go Back)");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (choice == 1) {
                    boolean isDeleted = UnderWriter.deleteUnderwriterById(userId);
                    if (isDeleted) {
                        System.out.println("✅ Underwriter deleted successfully.");
                    } else {
                        System.out.println("❌ Failed to delete underwriter.");
                    }
                    break; // Exit after confirmation
                } else if (choice == 2) {
                    System.out.println("Going back to the Admin Menu...");
                    break; // Return to Admin Menu
                } else {
                    System.out.println("❗ Invalid choice. Please enter 1 or 2.");
                }
            } else {
                // Invalid ID - Show options
                System.out.println("❌ Invalid Underwriter ID.");
                System.out.println("1. Re-Enter Underwriter ID");
                System.out.println("2. Go Back to Previous Menu");
                System.out.print("Enter your choice: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (option == 2) {
                    break; // Go back to the previous menu
                }
            }
        }
    }

    // 6. View Vehicles by Underwriter ID
    private static void viewVehiclesByUnderwriterId() {
        while (true) {
            System.out.print("Enter Underwriter ID to view vehicle details: ");
            int underwriterId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Search for underwriter by ID
            UnderWriter uw = UnderWriter.getUnderwriterById(underwriterId);

            if (uw != null) {
                // Valid ID - Display vehicle details
                List<Vehicle> vehicles = uw.getVehicles();
                if (vehicles.isEmpty()) {
                    System.out.println("No vehicles registered under this Underwriter.");
                } else {
                    System.out.println("\n--- Vehicle Details ---");
                    for (Vehicle v : vehicles) {
                        System.out.println(v); // Display each vehicle
                    }
                }
                break; // Exit after showing data
            } else {
                // ❌ Invalid ID - Show options
                System.out.println("❌ Invalid Underwriter ID.");
                System.out.println("1. Re-Enter Underwriter ID");
                System.out.println("2. Go Back to Previous Menu");
                System.out.print("Enter your choice: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (option == 2) {
                    break; // Return to Admin Menu
                }
            }
        }
    }


    // 5. View All Underwriters
    private static void viewUnderwriters() {
        System.out.println("List of Underwriters:");
        UnderWriter.displayUnderwriters();
    }



    private static void searchUnderwriterMenu() {
        while (true) {
            System.out.println("\n--- Search Underwriter Menu ---");
            System.out.println("1. View All Underwriters");
            System.out.println("2. View Underwriter by ID");
            System.out.println("3. Go Back to Admin Menu");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    UnderWriter.displayUnderwriters(); // View all underwriters
                    break;
                case 2:
                    viewUnderwriterById(); // Search by ID
                    break;
                case 3:
                    return; // Go back to Admin Menu
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        }
    }
    // Update Underwriter Details (Password)
    private static void updateUnderwriterDetails() {
        while (true) {
            System.out.print("Enter Underwriter ID: ");
            int id = scanner.nextInt(); // Get Underwriter ID
            scanner.nextLine(); // Consume newline

            UnderWriter uw = UnderWriter.getUnderwriterById(id);
            if (uw != null) {
                // Underwriter found - Update password
                System.out.print("Enter New Password: ");
                String newPassword = scanner.nextLine();

                // Update the password using method in UnderWriter
                boolean isUpdated = UnderWriter.updateUnderwriterPasswordById(id, newPassword);

                if (isUpdated) {
                    System.out.println("✅ Password updated successfully.");
                } else {
                    System.out.println("❌ Failed to update password. Please try again.");
                }
                break; // Exit after updating
            } else {
                // ❌ Invalid ID - Show options
                System.out.println("❌ Invalid Underwriter ID.");
                System.out.println("1. Re-Enter Underwriter ID");
                System.out.println("2. Go Back to Previous Menu");
                System.out.print("Enter your choice: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (option == 2) {
                    break; // Go back to the previous menu
                }
            }
        }
    }

    private static void viewUnderwriterById() {
        while (true) {
            System.out.print("Enter Underwriter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            UnderWriter underwriter = UnderWriter.getUnderwriterById(id);

            if (underwriter != null) {
                System.out.println("✅ Underwriter Found: ");
                underwriter.displayDetails(); // Show details
                break;
            } else {
                System.out.println("❌ Invalid Underwriter ID.");
                System.out.println("1. Re-Enter Underwriter ID");
                System.out.println("2. Go Back to Search Menu");
                System.out.print("Enter your choice: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (option == 2) {
                    break; // Go back to Search Menu
                }
            }
        }
    }


}
