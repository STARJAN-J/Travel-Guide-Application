# Tourist Guide Application

## Project Overview
The **Tourist Guide Application** is a robust console-based system designed using **Object-Oriented Programming (OOP) principles**, including **Inheritance, Abstraction, Polymorphism (Overriding), Encapsulation, and Interfaces**. This application acts as a mediator between **Customers** and **Clients**, ensuring smooth itinerary management and trip booking.

## Features
### **For Customers:**
- **Browse Itineraries**: View available travel plans.
- **Filter Itineraries**: Search based on:
  - Location
  - Interest (e.g., Adventure, Sightseeing, Food & Culinary)
  - Price
- **Book Trips**: Securely reserve travel experiences.
- **Expense Breakdown**: Get a detailed cost estimate before payment, including taxes.

### **For Clients:**
- **Add Itineraries**: Create and publish travel packages.
- **Update Itineraries**: Modify existing offers.
- **View Existing Itineraries**: Monitor available listings.
- **Manage Bookings**: View and track customer reservations.

## Project Flow
1. **Customer Interaction:**
   - Searches and filters itineraries.
   - Selects a trip and proceeds to book it.
   - Reviews the **expense breakdown** before payment.
2. **Client Interaction:**
   - Logs in and manages travel packages.
   - Adds, updates, and tracks itineraries.
   - Views customer bookings.

## Technologies Used
- **Java** (Core Development Language)
- **OOP Principles** (Encapsulation, Inheritance, Polymorphism, Abstraction, Interfaces)
- **Exception Handling** for error management

## OOP Concepts Applied
- **Encapsulation**: Secure data handling with getters and setters.
- **Inheritance**: Code reusability across different classes.
- **Polymorphism (Overriding)**: Allows flexibility in method implementation.
- **Abstraction**: Hides implementation details while exposing only necessary functionalities.
- **Interfaces**: Enables multiple functionalities for different user types (Customers & Clients).

## Folder Structure
```
Tourist_Guide_Console_App
├── activities
│   ├── Activity.java
│   ├── Adventure.java
│   ├── FoodAndCulinary.java
│   ├── Itineraries.java
│   ├── Sightseeing.java
│   ├── WaterActivity.java
│
├── bookActivities
│   ├── BookActivity.java
│   ├── Booking.java
│   ├── GroupBooking.java
│   ├── SoloBooking.java
│
├── clientServices
│   ├── ClientFeature.java
│   ├── Program.java
│
├── exceptionHandling
│   ├── ExceptionHandling.java
│
├── homePages
│   ├── ClientHomePage.java
│   ├── CustomerHomePage.java
│
├── payment
│   ├── CreditCard.java
│   ├── DebitCard.java
│   ├── OnlineBanking.java
│   ├── Pay.java
│   ├── PayType.java
│   ├── Upi.java
│
├── usersDataManagement
│   ├── Login.java
│   ├── UserData.java
|
├── App.java
├── DataLoader.java
├── Staging.java
│
├── users
│   ├── Client.java
│   ├── Customer.java
│   ├── User.java
```

## How to Run the Project
1. **Clone the repository:**
   ```bash
   git clone https://github.com/STARJAN-J/Travel-Guide-Application
   ```
2. **Navigate to the project folder:**
   ```bash
   cd Travel-Guide-Application
   ```
3. **Compile and run the project:**
   ```bash
   javac Main.java
   java Main
   ```

## Future Enhancements
- **Integrating a database** for storing user and itinerary details.
- **Implementing a GUI version** for better user interaction.
- **Adding a recommendation system** based on user preferences.
- **Expanding payment methods** for greater flexibility.

## Contributing
Contributions are welcome! Feel free to fork this repository and submit pull requests.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
**Author:** Starjan J

**Contact:** starjanj007@gmail.com  
