package StarjanProject.Tourist_Guide_Console_App.activities;

import java.time.LocalDate;

public class Adventure extends Activity{
    private final String activityType = "Adventure";
    

    public Adventure(String location, String duration, String overview, boolean isAvailable, String difiiculty, double price, LocalDate fromDate, LocalDate toDate) {
        super(location, duration, overview, isAvailable, difiiculty, price, fromDate, toDate);
    }

    @Override
    public void activityDetails() {
        System.out.println("Location: " + getLocation() + " | Duration: " + getDuration() +  "| Activity Type: " + activityType() + " | Price: " + getPrice() + " | Open: " + getFromDate() + " | Till: " + getToDate());
    }

    @Override
    public void itinerary() {
        System.out.println("Location: " + getLocation() + "\nDuration: " + getDuration() + "\nOverview: " + getOverview() + "\nAvailability: " + isAvailable() 
                + "\nDifficulty: " + getDifiiculty() + "\nPrice: Rs." + getPrice() +"\nFrom Date: " + getFromDate() + "\nTo Date: " + getToDate() + "\n");
    }

    @Override
    public String activityType() {
        return activityType;
    }
    
}
