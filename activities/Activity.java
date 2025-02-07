package StarjanProject.Tourist_Guide_Console_App.activities;

import java.time.LocalDate;

public abstract class Activity {
    private String location;
    private String duration;
    private String overview;
    private boolean isAvailable;
    private String difiiculty;
    private double price;
    private LocalDate fromDate;
    private LocalDate toDate;
    

    public Activity(String location, String duration, String overview, boolean isAvailable, String difiiculty, double price, LocalDate fromDate, LocalDate toDate) {
        this.location = location;
        this.duration = duration;
        this.overview = overview;
        this.isAvailable = isAvailable;
        this.difiiculty = difiiculty;
        this.price = price;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getDuration() {
        return duration;
    }

    public String getOverview() {
        return overview;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getDifiiculty() {
        return difiiculty;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setDifiiculty(String difiiculty) {
        this.difiiculty = difiiculty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    // Abstract Methods
    public abstract void activityDetails();

    public abstract void itinerary();

    public abstract String activityType();

    

    
    

    
}
