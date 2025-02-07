package StarjanProject.Tourist_Guide_Console_App.homePages;

import StarjanProject.Tourist_Guide_Console_App.activities.Activity;
import StarjanProject.Tourist_Guide_Console_App.bookActivities.BookActivity;
import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.Tourist_Guide_Console_App.usersDataManagement.UserData;
import StarjanProject.users.Client;
import StarjanProject.users.User;

public class CustomerHomePage {
    
    // Filter Activitiees
    public void filterActivities(User customer) {
        String location = ExceptionHandling.string("Location: ");
        String interest = ExceptionHandling.string("Interest: ");
        double amount = ExceptionHandling.Double("Amount: ");        
        while (true) {
            for (User user : UserData.getClients()) {
                for (Activity activity : ((Client)user).getItineraries()) {
                    if (activity.getLocation().equals(location) && activity.activityType().equals(interest) && activity.getPrice() <= amount) {
                        System.out.println("\nItinerery Details: ");
                        activity.itinerary();
                        System.out.println();
                        if (activity.isAvailable()) {
                            int enter = ExceptionHandling.Int("For Booking Press-1: ");
                            if (enter == 1) {
                                BookActivity book = new BookActivity();
                                book.book(customer, activity);
                                System.out.println();
                                return;
                            }
                            else{
                                return;
                            }
                        }
                        else {
                            System.out.println("Currently this activity is not available");
                            int enter = ExceptionHandling.Int("Press 1 to back: ");
                            if (enter == 1) {
                                return;
                            }
                        }
                    }
                }                 
            }
            int enter = ExceptionHandling.Int("Oops! No matching itinerary found. Press 1 to search again or 0 to go back: ");
            System.out.println();
            if (enter != 1) {
                return;
            }
            location = ExceptionHandling.string("Location: ");
            interest = ExceptionHandling.string("Interest: ");
            amount = ExceptionHandling.Double("Amount: ");  
        }              
    }

    // List all activities
    public void listAllActivities() {
        System.out.println("List of all Itineraries: ");
        for (User user  : UserData.getClients()) {
            for (Activity activity : ((Client)user).getItineraries()) {
                activity.activityDetails();
            }
        }
        System.out.println();
    }

    // Available activities
    public void availableActivities() {
        System.out.println("Available Iteneraries: ");
        for (User user  : UserData.getClients()) {
            for (Activity activity : ((Client)user).getItineraries()) {
                if (activity.isAvailable()) {
                    activity.activityDetails();
                }
            }
        }
        System.out.println();
    }

    
}
