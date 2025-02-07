package StarjanProject.Tourist_Guide_Console_App.bookActivities;


import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;

public class SoloBooking extends Booking{

    public SoloBooking() {
        super(ExceptionHandling.string("Name: "), ExceptionHandling.getPhoneNumber("Enter Phone Number: "), ExceptionHandling.getDate("Schedule Date: "), 1);
    }
}
