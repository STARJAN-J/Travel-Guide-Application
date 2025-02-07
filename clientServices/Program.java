package StarjanProject.Tourist_Guide_Console_App.clientServices;

import java.time.LocalDate;

import StarjanProject.Tourist_Guide_Console_App.activities.Activity;

public class Program {
    private String guestName;
    private String guestPhoneNum;
    private Activity activity;
    private double amount;
    private LocalDate paymenDate;
    private LocalDate guestScheduledDate;

    public Program(String guestName, String guestPhoneNum, Activity activity, double amount, LocalDate paymenDate, LocalDate guestScheduledDate) {
        this.guestName = guestName;
        this.guestPhoneNum = guestPhoneNum;
        this.activity = activity;
        this.amount = amount;
        this.paymenDate = paymenDate;
        this.guestScheduledDate = guestScheduledDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestPhoneNum() {
        return guestPhoneNum;
    }

    public void setGuestPhoneNum(String guestPhoneNum) {
        this.guestPhoneNum = guestPhoneNum;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymenDate() {
        return paymenDate;
    }

    public void setPaymenDate(LocalDate paymenDate) {
        this.paymenDate = paymenDate;
    }

    public LocalDate getGuestScheduledDate() {
        return guestScheduledDate;
    }

    public void setGuestScheduledDate(LocalDate guestScheduledDate) {
        this.guestScheduledDate = guestScheduledDate;
    }

    
    // View Booked Program
    public void viewProgram() {
        Activity activity = getActivity();
        String itinerary = ("\"" + activity.activityType() + ": " + activity.getOverview().split("\\s+")[0] + ", " + activity.getLocation() + "\"");
        System.out.println("Guest Name: " + guestName + " | Guest Phone Number: " + guestPhoneNum + "\nItinerary: " + itinerary + "\nAmount recieved: " + getAmount() 
                    + " | Payment received at: " + getPaymenDate() + "\nGuest Arrival: " + getGuestScheduledDate() + "\n");
    }

    

    
}
