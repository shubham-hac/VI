import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class UnderWriter {
    private int underwriterId;
    private String name;
    private Date dob;
    private Date joiningDate;
    private String userId;
    private String password;
    private String defaultPassword;
    private List<Vehicle> vehicles = new ArrayList<>();
    private static List<UnderWriter> underWriters = new ArrayList<>();
    private static int underwriterCounter = 1001; // Starting point for ID generation
    public static Scanner scanner = new Scanner(System.in);

    public UnderWriter(String name, Date dob, Date joiningDate, String userId, String password, String defaultPassword) {
        this.underwriterId = underwriterCounter++; // Auto-generate ID
        this.name = name;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.userId = userId;
        this.password = password;
        this.defaultPassword = defaultPassword;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getUnderwriterId() {
        return underwriterId;
    }
    public static List<UnderWriter> getUnderWriters() {
        return underWriters;
    }

    public static void addUnderwriter(String name, Date dob, Date joiningDate, String userId, String password) {
        String defaultPassword = generateDefaultPassword(); // Optional if needed
        underWriters.add(new UnderWriter(name, dob, joiningDate, userId, password, defaultPassword));
    }

    public static void displayUnderwriters() {
        if (underWriters.isEmpty()) {
            System.out.println("No Underwriters registered.");
        } else {
            for (UnderWriter uw : underWriters) {
                uw.displayDetails(); // Show details
            }
        }
    }

    // Display Underwriter Details
    public void displayDetails() {
        System.out.println("\n--- Underwriter Details ---");
        System.out.println("ID: " + underwriterId);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("UserID: " + userId);
        System.out.println("Default Password: " + defaultPassword);
    }

    // Get Underwriter by ID
    public static UnderWriter getUnderwriterById(int id) {
        for (UnderWriter uw : underWriters) {
            if (uw.getUnderwriterId() == id) {
                return uw;
            }
        }
        return null; // If not found
    }
    public static boolean updateUnderwriterPasswordById(int id, String newPassword) {
        for (UnderWriter uw : underWriters) {
            if (uw.getUnderwriterId() == id) { // Check if ID matches
                uw.password = newPassword;
                return true; // Password updated successfully
            }
        }
        return false; // ID not found
    }

    public static String generateDefaultPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String specialCharacters = "!@#$%^&*";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Add 6 alphanumeric characters
        for (int i = 0; i < 6; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Add 1 special character
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        return password.toString();
    }


    public static boolean updateUnderwriterPassword(String userId, String newPassword) {
        for (UnderWriter uw : underWriters) {
            if (uw.getUserId().equals(userId)) {
                uw.password = newPassword;
                return true;
            }
        }
        return false;
    }

    public static boolean deleteUnderwriterById(String userId) {
        Iterator<UnderWriter> iterator = underWriters.iterator();
        while (iterator.hasNext()) {
            UnderWriter uw = iterator.next();
            if (uw.getUserId().equals(userId)) {
                iterator.remove(); // Remove underwriter
                return true; // Deletion successful
            }
        }
        return false; // ID not found
    }

    //  Search Underwriter by UserID
    public static UnderWriter searchUnderwriterByUserId(String userId) {
        for (UnderWriter uw : underWriters) {
            if (uw.getUserId().equals(userId)) {
                return uw; // Return the found Underwriter
            }
        }
        return null; // If not found
    }

    // Get Underwriter by User ID
    public static UnderWriter getUnderwriterByUserId(String userId) {
        for (UnderWriter uw : underWriters) {
            if (uw.getUserId().equals(userId)) {
                return uw; // Found
            }
        }
        return null; // Not Found
    }

    public static void viewVehiclesByUnderwriterId(String userId) {
        UnderWriter uw = getUnderwriterByUserId(userId);
        if (uw != null) {
            List<Vehicle> vehicles = uw.getVehicles();
            if (vehicles.isEmpty()) {
                System.out.println("No vehicles registered under this Underwriter.");
            } else {
                for (Vehicle v : vehicles) {
                    System.out.println(v);
                }
            }
        } else {
            System.out.println("Underwriter ID not found.");
        }
    }

    // Authenticate Underwriter Login
    // Check if UserID and Password are correct
    public static UnderWriter authenticateUnderwriter(String userId, String password) {
        for (UnderWriter uw : underWriters) {
            if (uw.getUserId().equals(userId) && uw.getPassword().equals(password)) {
                return uw; // Return valid underwriter
            }
        }
        return null; // Return null if no match found
    }



    // Create New Vehicle Insurance
    public void createVehicleInsurance() {
        try {
            System.out.println("Enter Vehicle No (Alphanumeric with space): ");
            String vehicleNo = scanner.nextLine();

            System.out.println("Enter Vehicle Type (2-wheeler/4-wheeler): ");
            String vehicleType = scanner.nextLine();

            System.out.println("Enter Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.println("Enter Engine No (Integer): ");
            int engineNo = scanner.nextInt();

            System.out.println("Enter Chassis No (Integer): ");
            int chassisNo = scanner.nextInt();

            System.out.println("Enter Phone No (10 digits): ");
            long phoneNo = scanner.nextLong();

            System.out.println("Enter Insurance Type (Full Insurance/Third Party): ");
            scanner.nextLine(); // Consume newline
            String insuranceType = scanner.nextLine();

            double premiumAmount;
            if (insuranceType.equalsIgnoreCase("Full Insurance")) {
                premiumAmount = 5000.0;
            } else if (insuranceType.equalsIgnoreCase("Third Party")) {
                premiumAmount = 3000.0;
            } else {
                System.out.println("Invalid Insurance Type! Defaulting to Third Party.");
                premiumAmount = 3000.0;
            }

            Date fromDate = new Date(); // Current Date
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fromDate);
            calendar.add(Calendar.DAY_OF_YEAR, 365);
            Date toDate = calendar.getTime();

            // Auto-increment Policy No
            int policyNo = vehicles.size() + 1;

            // Create Vehicle Object
            Vehicle newVehicle = new Vehicle(policyNo, vehicleNo, vehicleType, customerName,
                    engineNo, chassisNo, phoneNo, insuranceType, premiumAmount, fromDate, toDate, underwriterId);

            vehicles.add(newVehicle);
            System.out.println("✅ Vehicle Insurance Created Successfully!");
        } catch (Exception e) {
            System.out.println("❌ Error while creating Vehicle Insurance. Please try again.");
            scanner.nextLine(); // Clear invalid input
        }
    }


    // Renew Vehicle Insurance Policy
    public void renewPolicy() {
        System.out.print("Enter Vehicle No to Renew Policy: ");
        String vehicleNo = scanner.nextLine();
        Vehicle v = getVehicleByNo(vehicleNo);

        if (v != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, 1); // Extend validity by 1 year
            v.setToDate(calendar.getTime());
            System.out.println("✅ Policy Renewed Successfully!");
        } else {
            System.out.println("❌ Vehicle not found. Please check Vehicle No.");
        }
    }

    // Change Policy Type
    public void changePolicyType() {
        System.out.print("Enter Policy ID: ");
        int policyId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Search for Vehicle by Policy ID
        Vehicle v = getVehicleByPolicyId(policyId);

        if (v == null) {
            System.out.println("❌ Policy not found.");
            return;
        }

        // Check Current Insurance Type
        if (v.getInsuranceType().equalsIgnoreCase("Third Party")) {
            System.out.println("There's no provision to update the policy type from Third Party to Full Insurance.");
        } else if (v.getInsuranceType().equalsIgnoreCase("Full Insurance")) {
            System.out.println("Press U to update the insurance type from Full Insurance to Third Party.");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("U")) {
                v.setInsuranceType("Third Party");
                System.out.println("✅ Insurance type updated successfully to Third Party!");
            } else {
                System.out.println("❌ Invalid choice. Insurance type not updated.");
            }
        } else {
            System.out.println("⚠️ Unknown Insurance Type!");
        }
    }


    // View All Vehicle Policies
    public void viewPolicyMenu() {
        while (true) {
            System.out.println("\n--- View Vehicle Insurance Policy ---");
            System.out.println("1. View All Insurance");
            System.out.println("2. View Insurance by Vehicle ID");
            System.out.println("3. View Insurance by Policy ID");
            System.out.println("4. Go Back");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewAllPolicies(); // View all insurance policies
                    break;
                case 2:
                    viewInsuranceByVehicleId(); // View by Vehicle ID
                    break;
                case 3:
                    viewInsuranceByPolicyId(); // View by Policy ID
                    break;
                case 4:
                    return; // Go back to the previous menu
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    public void viewAllPolicies() {
        if (vehicles.isEmpty()) {
            System.out.println("No Vehicle Insurance Policies available.");
        } else {
            for (Vehicle v : vehicles) {
                System.out.println(v);
            }
        }
    }

    public void viewInsuranceByVehicleId() {
        System.out.print("Enter Vehicle ID: ");
        String vehicleNo = scanner.nextLine();

        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.getVehicleNo().equalsIgnoreCase(vehicleNo)) {
                System.out.println(v);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid Vehicle ID. No insurance record found.");
        }
    }

    public void viewInsuranceByPolicyId() {
        System.out.print("Enter Policy ID: ");
        int policyId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.getPolicyNo() == policyId) {
                System.out.println(v);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid Policy ID. No insurance record found.");
        }
    }




    // Get Vehicle by Vehicle No
    public Vehicle getVehicleByNo(String vehicleNo) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleNo().equals(vehicleNo)) {
                return v;
            }
        }
        return null;
    }



    public double calculatePremium(String insuranceType) {
        if (insuranceType.equalsIgnoreCase("Full Insurance")) {
            return 5000.0;
        } else if (insuranceType.equalsIgnoreCase("Third Party")) {
            return 3000.0;
        } else {
            System.out.println("Invalid Insurance Type. Defaulting to Third Party Premium.");
            return 3000.0;
        }
    }

    private Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.parse(dateString);
    }

    public Vehicle getVehicleByPolicyId(int policyId) {
        for (Vehicle v : vehicles) {
            if (v.getPolicyNo() == policyId) {
                return v;
            }
        }
        return null;
    }








}
