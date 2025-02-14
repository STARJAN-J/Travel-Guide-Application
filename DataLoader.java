package StarjanProject.Tourist_Guide_Console_App;


import StarjanProject.Tourist_Guide_Console_App.activities.Activity;
import StarjanProject.Tourist_Guide_Console_App.activities.Adventure;
import StarjanProject.Tourist_Guide_Console_App.activities.FoodAndCulinary;
import StarjanProject.Tourist_Guide_Console_App.activities.Itineraries;
import StarjanProject.Tourist_Guide_Console_App.activities.Sightseeing;
import StarjanProject.Tourist_Guide_Console_App.activities.WaterActivity;
import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.Tourist_Guide_Console_App.users.Client;

public class DataLoader {
    
    public static void addData() {
        addActivities();
        // ActivityData.showActivities();
        addActivities_clients();
    }

    public static void addActivities() {
        Itineraries activities = new Itineraries();

        String overview = "MarinaBeach: One of the longest urban beaches in the world, perfect for a morning walk, enjoying street food, and watching the sunset. Kapaleeshwarar Temple: A beautiful Dravidian-style temple dedicated to Lord Shiva, known for its intricate carvings and vibrant cultural significance.";
        activities.addActivity(new Sightseeing("Chennai", "1-Day", overview, true, "Easy", 2000, ExceptionHandling.date("03/02/2025"), ExceptionHandling.date("10/02/2025")));
    
        overview = "TajMahal A UNESCO World Heritage site and one of the Seven Wonders of the World, symbolizing eternal love.";
        activities.addActivity(new Sightseeing("Agra", "1-Day", overview, true, "Easy", 5000, ExceptionHandling.date("03/02/2025"), null));

        overview = "Grandfort with stunning Rajput architecture, elephant rides, and scenic views of Maota Lake.";
        activities.addActivity(new Sightseeing("Rajasthan", "2-Days", overview, true, "Easy", 3000, ExceptionHandling.date("03/02/2025"), null));

        overview = "ChadarTrek, A thrilling frozen river trek across the icy Zanskar River, offering breathtaking views and extreme conditions.";
        activities.addActivity(new Adventure("Ladakh", "3-Days", overview, false, "Hard", 6000, ExceptionHandling.date("03/02/2025"), ExceptionHandling.date("05/02/2025")));
    
        overview = "Paragliding in Bir Billing Known as the \"Paragliding Capital of India,\" it offers an unforgettable aerial view of the Himalayas.";
        activities.addActivity(new Adventure("Himachal Pradesh", "1-Day", overview, true, "Medium", 1000, ExceptionHandling.date("03/02/2025"), ExceptionHandling.date("09/02/2025")));
    
        overview = "Skiing in Gulmarg, India's top skiing destination, offering breathtaking Himalayan slopes.";
        activities.addActivity(new Adventure("Jammu & Kashmir", "1-Day", overview, true, "Hard", 6000, ExceptionHandling.date("03/02/2025"), ExceptionHandling.date("19/02/2025")));

        overview = "ScubaDiving in Experience crystal-clear waters, vibrant coral reefs, and rich marine life at Havelock Island.";
        activities.addActivity(new WaterActivity("Andaman & Nicobar Islands", "5-Days", overview, false, "Hard", 10000, ExceptionHandling.date("03/02/2025"), ExceptionHandling.date("28/02/2025")));
    
        overview = "Surfing in Kovalam, One of India's best surfing destinations with clean waves and scenic beaches.";
        activities.addActivity(new WaterActivity("Kerala", "1-Day", overview, true, "Hard", 2000, ExceptionHandling.date("03/02/2025"), ExceptionHandling.date("28/02/2025")));
    
        overview = "Backwater_Houseboat_Ride in Alleppey, A relaxing experience cruising through lush green canals in a traditional houseboat.";
        activities.addActivity(new WaterActivity("Kerala", "3-Days", overview, true, "Easy", 12000, ExceptionHandling.date("03/02/2025"), ExceptionHandling.date("30/03/2025")));

        overview = "StreetFood in Old Delhi Chandni Chowk, Enjoy legendary dishes like Parathas, Chaat, and Jalebis at iconic food stalls.";
        activities.addActivity(new FoodAndCulinary("Delhi", "1-Day", overview, true, "Easy", 2000, ExceptionHandling.date("03/02/2025"), null));
    
        overview = "ChettinadCuisine in Tamil Nadu, A spicy and flavorful South Indian cuisine known for its fiery Chicken Chettinad and aromatic biryanis.";
        activities.addActivity(new FoodAndCulinary("Karaikudi", "3-Days", overview, true, "Easy", 8000, ExceptionHandling.date("03/02/2025"), ExceptionHandling.date("05/02/2025")));
    }

    public static void addActivities_clients() {
        Client client = new Client("David", "8465923212", "David@234", "Activity Provider");
        
        for (Activity activities : Itineraries.getItineraries()) {
            client.uploadActivity(activities);
        }
    }
}
