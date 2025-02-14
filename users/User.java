package StarjanProject.Tourist_Guide_Console_App.users;


import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.Tourist_Guide_Console_App.usersDataManagement.UserData;

public abstract class User{
    private String name;
    private String phoneNumber;
    private String password;

    public User() {
        this.name = ExceptionHandling.string("Enter your name: ");
        this.phoneNumber = ExceptionHandling.getPhoneNumber("Enter Phone Number: ");
        this.password = ExceptionHandling.getPassword("Enter password: ");
        UserData.addCustomers(this);
    }

    public User(boolean isClient) {
        this.name = ExceptionHandling.string("Enter your name: ");
        this.phoneNumber = ExceptionHandling.getPhoneNumber("Enter Phone Number: ");
        this.password = ExceptionHandling.getPassword("Enter password: ");
        UserData.addClients(this);
    }

    // Manual
    public User(String name, String phoneNumber, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        UserData.addClientsManual(this);
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    // Methods
    public int getId() {
        return 0;
    }

    public abstract void viewUserDetails();
    

}
