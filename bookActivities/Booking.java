package StarjanProject.Tourist_Guide_Console_App.bookActivities;

import java.time.LocalDate;
import java.util.List;

import StarjanProject.Tourist_Guide_Console_App.activities.Activity;
import StarjanProject.Tourist_Guide_Console_App.clientServices.Program;
import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.Tourist_Guide_Console_App.payment.Pay;
import StarjanProject.Tourist_Guide_Console_App.usersDataManagement.UserData;
import StarjanProject.users.Client;
import StarjanProject.users.User;

public class Booking {
    private String name;
    private String phoneNo;
    private LocalDate ScheduleDate;
    private int members;
    private List<String> groupMembers;

    public Booking(String name, String phoneNo, LocalDate scheduleDate, int members) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.ScheduleDate = scheduleDate;
        this.members = members;
    }

    public Booking(String name, String phoneNo, LocalDate scheduleDate, List<String> groupMembers) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.ScheduleDate = scheduleDate;        
        this.groupMembers = groupMembers;
        this.members = this.groupMembers.size();
    }

    
    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public LocalDate getScheduleDate() {
        return ScheduleDate;
    }

    public int getMembers() {
        return members;
    }

    public List<String> getGroupMembers() {
        return groupMembers;
    }

    // Booking
    public void bookActivity(User customer, Activity activity) {
        for (User client : UserData.getClients()) {
            for (Activity ac : ((Client)client).getItineraries()) {
                if (activity.getLocation().equals(ac.getLocation()) && activity.getPrice() == ac.getPrice() && activity.activityType().equals(ac.activityType())) {
                    double amount = totalCost(activity);
                    Pay payment = new Pay();
                    payment.pay(amount, ExceptionHandling.todayDate());
                    Program program = new Program(customer.getName(), customer.getPhoneNumber(), activity, amount, ExceptionHandling.todayDate(), ScheduleDate);
                    ((Client)client).addProgram(program);
                    return;
                }
            }
        }
    }

    // Cost Breakdown
    public double totalCost(Activity activity) {
        int members = this.members;
        double cost = activity.getPrice();
        double total = members * cost;
        double tax = 0.15 * total;
        System.out.println("\n\n`Booking Summary`");
        System.out.println("Per Person: " + cost + "\nTotal members: " + members +  "\nSubtotal (Before Tax): " + total + "\nTax & Fees: " + tax + "\nGrand Total: " + (total+tax) + "\n");
        return (total+tax);        
    }
    

    
}
