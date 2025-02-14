package StarjanProject.Tourist_Guide_Console_App.users;



public class Customer extends User{
    private static int idCounter = 1;
    private int id;

    public Customer() {       
        setIdCOunter();
    }

    public void setIdCOunter() {
        this.id = idCounter++; 
    }

    public int getId() {
        return id;
    }


    @Override
    public void viewUserDetails() {
        System.out.println("Name: " + getName() + " | UserId: " + getId() +" | PhoneNumber: " + getPhoneNumber() + " | Password: " + getPassword());
    }

    
}
