package StarjanProject.Tourist_Guide_Console_App.activities;

import java.util.ArrayList;
import java.util.List;

import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;

public class Itineraries {
    private static List<Activity> itineraries = new ArrayList<>();

    public void addActivity(Activity activity) {
        itineraries.add(activity);
    }

    public static List<Activity> getItineraries() {
        return itineraries;
    }

    public static void showActivities() {
        for (Activity activity : itineraries) {
            activity.activityDetails();
        }
    }

    // Interest
    public static String interest(String interest) {
         
        while (true) {
            for (Activity activity : itineraries) {
                if (activity.activityType().equals(interest)) {
                    return interest;
                }
            }
            System.out.println("Your interest is not in our suggestions, please reenter");
            interest = ExceptionHandling.string("Interest: ");
        }
    }
    
    // Amount
    public static double amount(double amount) {
         
        while (true) {
            for (Activity activity : itineraries) {
                if (activity.getPrice() == amount) {
                    return amount;
                }
            }
            System.out.println("You entered amount is not in our suggestions, please reenter");
            amount = ExceptionHandling.Double("Amount: ");
        }
    }
    
    // location
    public static String location(String location) {
         
        while (true) {
            for (Activity activity : itineraries) {
                if (activity.getLocation().equals(location)) {
                    return location;
                }
            }
            System.out.println("Your location is not in our suggestions, please reenter");
            location = ExceptionHandling.string("Location: ");
        }
    }
    
}
