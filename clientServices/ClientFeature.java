package StarjanProject.Tourist_Guide_Console_App.clientServices;

import java.util.List;

import StarjanProject.Tourist_Guide_Console_App.activities.Activity;

public interface ClientFeature {
    public void addItinerary();

    public List<Activity> getItineraries();

    public void listActivity(String clientName);

    public void addProgram(Program program);

    public List<Program> getBookings();

}
