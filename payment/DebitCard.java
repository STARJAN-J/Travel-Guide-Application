package StarjanProject.Tourist_Guide_Console_App.payment;

import java.time.LocalDate;

public class DebitCard extends PayType{

    public DebitCard(double amount, LocalDate date) {
        super(amount, date);
    }

    @Override
    public void msg() {
        System.out.println("\nPayment Verified - Paid with Debit Card");
    }
    
}
