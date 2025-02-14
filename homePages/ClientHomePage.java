package StarjanProject.Tourist_Guide_Console_App.homePages;

import StarjanProject.Tourist_Guide_Console_App.activities.Activity;
import StarjanProject.Tourist_Guide_Console_App.clientServices.Program;
import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.Tourist_Guide_Console_App.users.Client;
import StarjanProject.Tourist_Guide_Console_App.users.User;

public class ClientHomePage {

    // List of Itineraries
    public void listItineraries(User user) {
        int i = 1;
        if (((Client)user).getItineraries().size() == 0) {
            System.out.println("\nYour Itineraries: Itinerary list is blank, Please create one to proceed!");
        }
        else{
            System.out.println("\nYour Itineraries: ");
        }
        for (Activity activity : ((Client)user).getItineraries()) {
            System.out.print(i++ + ". ");
            activity.activityDetails();         
        }
        System.out.println();
    }

    // Add Itineraries
    public void addItineraries(User user) {
        ((Client)user).addItinerary();
        System.out.println("New itinerary successfully added.\n");
    }

    // Update Itineraries
    public void updateItineraries(User user) {
        listItineraries(user);
        int enter = ExceptionHandling.Int("Enter number to update itinerary: ");
        listItinerariesDetails(enter, user);
    }


    // Show bookings
    public void showBookings(User user) {
        if (((Client)user).getBookings().size() == 0) {
            System.out.println("\nNo bookings have been made yet. \n");
        }
        else{
            System.out.println("\nGuest Itinerary & Booking Confirmation Details: ");
        }
        for (Program program : ((Client)user).getBookings()) {
            program.viewProgram();
        }
    }

    private void listItinerariesDetails(int index, User user) {
        Activity activity = ((Client)user).getItineraries().get(index-1);
        String itinerary = ("\"" + activity.activityType() + ": " + activity.getOverview().split("\\s+")[0] + ", " + activity.getLocation() + "\"");
        System.out.println(itinerary);
        boolean flag = true;
        while (flag) {
            int enter = ExceptionHandling.Int("Update items individually using the list below. \n1. Location \n2. Duration \n3. Overview \n4. Availability \n5. Difficulty \n6. Price \n7. From Date \n8. To Date \n9. Exit \nEnter Number: ");
            System.out.println();
            switch (enter) {
                case 1:
                    System.out.println("\nExisting Location: " + activity.getLocation());
                    activity.setLocation(ExceptionHandling.string("Update Location: "));
                    System.out.println("Confirmation: " + itinerary + " Location is Successfully updated.\n");
                    break;
                case 2:
                    System.out.println("\nExisting Duration: " + activity.getDuration());
                    activity.setDuration(ExceptionHandling.string("Update Duration: "));
                    System.out.println("Confirmation: " + itinerary + " Duration is Successfully updated\n");
                    break;
                case 3:
                    System.out.println("\nExisting Overview: " + activity.getOverview());
                    activity.setOverview(ExceptionHandling.string("Update Overview: "));
                    System.out.println("Confirmation: " + itinerary + " Overview is Successfully updated\n");
                    break;
                case 4:
                    System.out.println("\nExisting Availability: " + activity.isAvailable());
                    activity.setAvailable(ExceptionHandling.Boolean("Update Availability: "));
                    System.out.println("Confirmation: " + itinerary + " Availability is Successfully updated\n");
                    break;
                case 5:
                    System.out.println("\nExisting Difficulty: " + activity.getDifiiculty());
                    activity.setDifiiculty(ExceptionHandling.string("Update Difficulty: "));
                    System.out.println("Confirmation: " + itinerary + " Difficulty is Successfully updated\n");
                    break;
                case 6:
                    System.out.println("\nExisting Price: " + activity.getPrice());
                    activity.setPrice(ExceptionHandling.Double("Update Price: "));
                    System.out.println("Confirmation: " + itinerary + " Price is Successfully updated\n");
                    break;
                case 7:
                    System.out.println("\nExisting From Date: " + activity.getFromDate());
                    activity.setFromDate(ExceptionHandling.getDate("Update From Date: "));
                    System.out.println("Confirmation: " + itinerary + " From Date is Successfully updated\n");
                    break;
                case 8:
                    System.out.println("\nExisting To Date: " + activity.getToDate());
                    activity.setToDate(ExceptionHandling.getDate("Update To Date: "));
                    System.out.println("Confirmation: " + itinerary + " To Date is Successfully updated\n");
                    break;                    
                case 9:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
    
}
