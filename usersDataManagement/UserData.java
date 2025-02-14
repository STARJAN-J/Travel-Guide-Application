package StarjanProject.Tourist_Guide_Console_App.usersDataManagement;

import java.util.ArrayList;
import java.util.List;

import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.Tourist_Guide_Console_App.users.User;

public class UserData {
    private static List<User> customers = new ArrayList<>();
    private static List<User> clients = new ArrayList<>();

    // Add Customers
    public static void addCustomers(User user) {
        String confirmPassword = ExceptionHandling.getPassword("Confirm Password: ");
        while (true) {
            if (user.authenticate(confirmPassword)) {
                    UserData.customers.add(user);
                    System.out.println("\nCustomer SignUp Successfully...");
                    return;
            }
            confirmPassword = ExceptionHandling.getPassword("Re-Confirm Password");
        }
    }

    // Add Clients
    public static void addClients(User user) {
        String confirmPassword = ExceptionHandling.getPassword("Confirm Password: ");
        while (true) {
            if (user.authenticate(confirmPassword)) {
                    UserData.clients.add(user);
                    return;
            }
            confirmPassword = ExceptionHandling.getPassword("Re-Confirm Password: ");
        }
    }

    // Add Clients Manual
    public static void addClientsManual(User user) {
        UserData.clients.add(user);
        
    }

    // Getters
    public static List<User> getCustomers() {
        return customers;
    }

    public static List<User> getClients() {
        return clients;
    }

    // View Customers
    public static void viewcustomers() {
        if (customers.size() == 0) {
            System.out.println("\nNo customers have signed up yet.");
            return;
        }
        System.out.println("Existing Customers: ");
        for (User user : customers) {
            user.viewUserDetails();
        }
        System.out.println();
    }

    // View Clients
    public static void viewClients() {
        if (clients.size() == 0) {
            System.out.println("\nNo clients have signed up yet.");
            return;
        }
        System.out.println("Existing Clients: ");
        for (User user : clients) {
            user.viewUserDetails();
        }
        System.out.println();
    }
    

    
    
    
}
