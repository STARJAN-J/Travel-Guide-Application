package StarjanProject.Tourist_Guide_Console_App.payment;

import java.time.LocalDate;

public class CreditCard extends PayType{
    
    public CreditCard(double amount, LocalDate date) {
        super(amount, date);
    }

    @Override
    public void msg() {
        System.out.println("\nPayment Verified - Paid with Credit Card");
    }
}
