package StarjanProject.Tourist_Guide_Console_App.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import StarjanProject.Tourist_Guide_Console_App.activities.Activity;
import StarjanProject.Tourist_Guide_Console_App.activities.Adventure;
import StarjanProject.Tourist_Guide_Console_App.activities.FoodAndCulinary;
import StarjanProject.Tourist_Guide_Console_App.activities.Itineraries;
import StarjanProject.Tourist_Guide_Console_App.activities.Sightseeing;
import StarjanProject.Tourist_Guide_Console_App.activities.WaterActivity;
import StarjanProject.Tourist_Guide_Console_App.clientServices.Program;
import StarjanProject.Tourist_Guide_Console_App.clientServices.ClientFeature;
import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;

public class Client extends User implements ClientFeature{
    private String clientType;
    private List<Activity> itineraries = new ArrayList<>();
    private List<Program> bookings = new ArrayList<>();

    public Client() {
        super(true); 
        String clientType = ExceptionHandling.string("Enter Client Type: ");
        this.clientType = clientType;
        System.out.println("\nClient SignUp Successfully... \n"); 
    }

    // manual
    public Client(String name, String phoneNumber, String password, String clientType) {
        super(name, phoneNumber, password);
        this.clientType = clientType;
    }

    public String getClientType() {
        return clientType;
    }

    // Manual
    public void uploadActivity(Activity activity) {
        itineraries.add(activity);
    }

    // Get From Client
    @Override
    public void addItinerary() {
        String activityType = ExceptionHandling.string("Activity Type: ");
        String location = ExceptionHandling.string("Enter Location: ");
        String duration = ExceptionHandling.string("Enter Duration(eg. 5 days): ");
        String overview = ExceptionHandling.string("Type the activity overview: ");;
        boolean isAvailable = ExceptionHandling.Boolean("Is available(true\\false): ");
        String difiiculty = ExceptionHandling.string("Difficulty Level(Easy\\Medium\\Hard): ");
        double price =  ExceptionHandling.Double("Enter Activity Price: ");
        LocalDate fromDate = ExceptionHandling.getDate("Start Date: ");
        LocalDate toDate = ExceptionHandling.getDate("End Date: ");
        Itineraries itinery = new Itineraries();
        if (activityType.equals("Sightseeing")) {
            uploadActivity(new Sightseeing(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate));
            itinery.addActivity(new Sightseeing(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate));
        }
        else if (activityType.equals("Adventure")) {
            uploadActivity(new Adventure(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate));
            itinery.addActivity(new Adventure(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate));
        }
        else if (activityType.equals("Water Activity")) {
            uploadActivity(new WaterActivity(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate));
            itinery.addActivity(new WaterActivity(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate));
        }
        else if (activityType.equals("Food And Culinary")) {
            uploadActivity(new FoodAndCulinary(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate));
            itinery.addActivity(new FoodAndCulinary(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate));
        }
        else {
            System.out.println("Invalid Activity Type.");
        }
    }

    @Override
    public List<Activity> getItineraries() {
        return itineraries;
    }

    @Override
    public List<Program> getBookings() {
        return bookings;
    }

    @Override
    public void listActivity(String clientName) {
        System.out.println("\n" + clientName + "'s Activities: ");
        for (Activity activity : itineraries) {
            System.out.print("Client Type: " + getClientType() + " | ");
            activity.activityDetails();
        }
    }

    @Override
    public void addProgram(Program program) {
        bookings.add(program);
        System.out.println(program.getActivity().activityType() + " in " + program.getActivity().getLocation() + " Booking is Successfull\t<->\tPack your bags for an unforgettable experiences!\t<->\tlet's dive in, \"Exciting experiences await you!\" \n");
    }

    @Override
    public void viewUserDetails() {        
        System.out.println("Name: " + getName() + " | Client Type: " + getClientType() +  " | PhoneNumber: " + getPhoneNumber() + " | Password: " + getPassword());
        
    }

    

    

    
}
