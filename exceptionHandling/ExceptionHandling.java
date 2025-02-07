package StarjanProject.Tourist_Guide_Console_App.exceptionHandling;

import java.util.Random;
import java.util.Scanner;

 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExceptionHandling {
    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();

    // getInt
    public static int Int(String message) {
        while (true) {
            try {
                System.out.print(message);
                int enter = sc.nextInt();
                sc.nextLine();
                return enter;
            } catch (Exception e) {
                System.out.println("Enter Only Digit");
                sc.nextLine();
            }
        }
    }

    // getString
    public static String string(String message) {
        
        System.out.print(message);
        String enter = sc.nextLine();
        return enter;
    }

    // getBoolean
    public static boolean Boolean(String message) {
        
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim().toLowerCase(); // Read input, trim spaces, convert to lowercase
            
            if (input.equals("true")) {
                return true;
            } 
            else if (input.equals("false")) {
                return false;
            } 
            else {
                System.out.println("Invalid input! Enter 'true' or 'false'.");
            }
        }
    }
    
    // getChar
    public static char character(String message) {
        
        while (true) {
            try {
                System.out.print(message);
                char enter = sc.next().charAt(0);
                return enter;
            } catch (Exception e) {
                System.out.println("Enter single character");
                sc.nextLine();
            }
        }
    }

    // getDouble
    public static double Double(String message) {
        while (true) {
            try {
                System.out.print(message);
                double enter = sc.nextDouble();
                sc.nextLine();
                return enter;
            } catch (Exception e) {
                System.out.println("Enter Only Digit");
                sc.nextLine();
            }
        }
    }

    // clearConsole
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Linux/Unix/MacOS
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Unable to clear console.");
        }
    }

    // String to Date format
    public static LocalDate date(String date) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {

            try {
                LocalDate currentDate = LocalDate.parse(date, format);
                // System.out.println(currentDate);
                return currentDate;
                
            } catch (DateTimeParseException e) {
                date = ExceptionHandling.string("Invalid Date Format \nFormat should be dd/MM/yyyy: ");
            }
        }
    }

    public static LocalDate getDate(String msg) {
        String date = ExceptionHandling.string(msg);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {

            try {
                LocalDate currentDate = LocalDate.parse(date, format);
                // System.out.println(currentDate);
                return currentDate;
                
            } catch (DateTimeParseException e) {
                date = ExceptionHandling.string("Invalid Date Format \nFormat should be dd/MM/yyyy: ");
            }
        }
    }

    // Live date
    public static LocalDate todayDate() {
        return LocalDate.now();
    }

    // Get Password
    public static String getPassword(String msg) {
        String password = string(msg);
        while (true) {
            if (password.length() >= 11 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*") && password.matches(".*[@#$%^&*+=].*")) {
                return password;
            }
            else {
                System.out.println("\"Your password length must be above 11 characters & \"Contains at least one uppercase letter\" & \"Contains at least one lowercase letter\" & \"Contains at least one digit\" & \"Contains at least one Special Character\"");
                password = string(msg);
            }
        }
    }

    // Get PhoneNumber
    public static String getPhoneNumber(String msg) {
        String phoneNum = string(msg);
        while (true) {
            if (phoneNum.length() == 10 && phoneNum.matches(".*\\d+.*")) {
                return phoneNum;
            }
            else {
                System.out.println("Your phone number should be 10 digits.");
                phoneNum = string(msg);
            }
        }
    }





}
