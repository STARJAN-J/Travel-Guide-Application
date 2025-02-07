package StarjanProject.Tourist_Guide_Console_App.bookActivities;

import StarjanProject.Tourist_Guide_Console_App.activities.Activity;
import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;
import StarjanProject.users.User;

public class BookActivity {
    
    public void book(User customer, Activity activity) {
        Booking book;
        boolean flag = true;

        while (flag) {
            int enter = ExceptionHandling.Int("1. Solo Booking \n2. Group Booking \n3. Exit \nEnter Number: ");
            System.out.println();
            switch (enter) {
                case 1:
                    book = new SoloBooking();
                    book.bookActivity(customer, activity);
                    break;
                case 2:
                    book = new GroupBooking();
                    book.bookActivity(customer, activity);
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
