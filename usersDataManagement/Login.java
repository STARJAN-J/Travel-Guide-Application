package StarjanProject.Tourist_Guide_Console_App.usersDataManagement;

import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.users.User;

public class Login {
    
    // Customer Login
    public User newCustomerLogin(int id, String password) {
        for (User user : UserData.getCustomers()) {
            if (user.getId()== id && user.authenticate(password)) {
                return user;            
            }
        }
        return null;
    }

    public User customerLogin() {
        int id = ExceptionHandling.Int("Enter the provided Id: ");
        String password = ExceptionHandling.getPassword("Enter Password: ");

        User user;
        while (true) {
            user = newCustomerLogin(id, password);
            if (user == null) {
                System.out.println("Entered Phone Number or Password is wrong");
                id = ExceptionHandling.Int("Re-Enter the provided Id: ");
                password = ExceptionHandling.getPassword("Re-Enter Password");
            }
            else {
                System.out.println("\nCustomer Login Successfull...");
                
                return user;
            }
        }       
    }


    // Client Login
    public User newClientLogin(String phoneNum, String password) {
        
        for (User user : UserData.getClients()) {
            if (user.getPhoneNumber().equals(phoneNum) && user.authenticate(password)) {
                return user;            
            }
        }
        
        return null;
    }

    public User clientLogin() {
        String phoneNum = ExceptionHandling.getPhoneNumber("Enter phone number: ");
        String password = ExceptionHandling.getPassword("Enter Password: ");

        User user;
        while (true) {
            user = newClientLogin(phoneNum, password);
            if (user == null) {
                System.out.println("Entered Phone Number or Password is wrong");
                phoneNum = ExceptionHandling.getPhoneNumber("Re-Enter the phone number: ");
                password = ExceptionHandling.getPassword("Re-Enter Password: ");
            }
            else {
                System.out.println("\nClient Login Successfull...");
                return user;
            }
        }

        
    }






}
