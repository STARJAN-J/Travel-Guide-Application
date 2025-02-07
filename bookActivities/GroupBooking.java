package StarjanProject.Tourist_Guide_Console_App.bookActivities;

import java.util.ArrayList;
import java.util.List;

import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;

public class GroupBooking extends Booking{
    
    public GroupBooking() {
        super(ExceptionHandling.string("Name: "), ExceptionHandling.getPhoneNumber("Enter Phone Number: "), ExceptionHandling.getDate("Schedule Date: "), enterMembers());
    }

    protected static List<String> enterMembers() {
        List<String> members = new ArrayList<>();
        int total = ExceptionHandling.Int("Total Members: ");;
        for (int i = 1; i <= total; i++) {
            members.add(ExceptionHandling.string(i + ": "));

        }
        return members;
    }

}
