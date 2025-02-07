package StarjanProject.Tourist_Guide_Console_App;

import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.Tourist_Guide_Console_App.homePages.ClientHomePage;
import StarjanProject.Tourist_Guide_Console_App.homePages.CustomerHomePage;
import StarjanProject.Tourist_Guide_Console_App.usersDataManagement.Login;
import StarjanProject.Tourist_Guide_Console_App.usersDataManagement.UserData;
import StarjanProject.users.Client;
import StarjanProject.users.Customer;
import StarjanProject.users.User;

public class Staging {
    
    public void run() {
        DataLoader.addData();        
        signUp();
    }

    public void signUp() {
        User user;
        
        boolean flag = true;
        while (flag) {
            int enter = ExceptionHandling.Int("1. Customer \n2. Client \n3. Admin \n4. Exit \nEnter Number: ");
            System.out.println();
            switch (enter) {
                case 1:
                    customer();
                    break;
                case 2: 
                    client();
                    break;
                case 3:
                    admin();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void customer() {
        User user;
        
        boolean flag = true;
        while (flag) {
            int enter = ExceptionHandling.Int("1. SignUp \n2. Login \n3. Exit \nEnter Number: ");
            System.out.println();
            switch (enter) {
                case 1:
                    user = new Customer();
                    // user.viewUserDetails();
                    System.out.println("Your UserID: " + user.getId() + "\n");
                    break;
                case 2: 
                    Login login = new Login();
                    customerHomePage(login.customerLogin());
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void client() {
        User user;
        
        boolean flag = true;
        while (flag) {
            int enter = ExceptionHandling.Int("1. SignUp \n2. Login \n3. Exit \nEnter Number: ");
            System.out.println();
            switch (enter) {
                case 1:
                    user = new Client();
                    break;
                case 2: 
                    Login login = new Login();
                    clientHomePage(login.clientLogin());
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void admin() {
        
        boolean flag = true;
        while (flag) {
            int enter = ExceptionHandling.Int("\n1. View Customers \n2. View Clients \n3. Client Activities \n4. Exit \nEnter Number: ");
            System.out.println();
            switch (enter) {
                case 1:
                    UserData.viewcustomers();
                    break;
                case 2: 
                    UserData.viewClients();
                    break;
                case 3:
                    for (User client : UserData.getClients()) {
                        ((Client)client).listActivity(client.getName());
                    }
                    break;
                case 4: 
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void customerHomePage(User customer) {
        CustomerHomePage page = new CustomerHomePage();
        System.out.println("Hello! " + customer.getName() + ", Welcome to Tourist Guide Console Application.");
        System.out.println();
        boolean flag = true;
        while (flag) {
            int enter = ExceptionHandling.Int("1. Filter Itineraries \n2. List Itineraries \n3. Available Itineraries \n4. Exit \nEnter Number: ");
            System.out.println();
            switch (enter) {
                case 1:
                    page.filterActivities(customer);
                    break;
                case 2: 
                    page.listAllActivities();
                    break;
                case 3:
                    page.availableActivities();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void clientHomePage(User client) {
        ClientHomePage page = new ClientHomePage();
        System.out.println("Hello! " + client.getName() + ", Welcome to Tourist Guide Console Application.");
        System.out.println();
        boolean flag = true;
        while (flag) {
            int enter = ExceptionHandling.Int("1. List Itineraries \n2. Add Itineraries \n3. Update Itineraries \n4. Show booking \n5. Exit \nEnter Number: ");
            System.out.println();
            switch (enter) {
                case 1:
                    page.listItineraries(client);
                    break;
                case 2: 
                    page.addItineraries(client);
                    break;
                case 3:
                    page.updateItineraries(client);
                    break;
                case 4:
                    page.showBookings(client);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }













}
