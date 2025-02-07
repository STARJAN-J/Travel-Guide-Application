package StarjanProject.Tourist_Guide_Console_App.payment;

import java.time.LocalDate;

public abstract class PayType {
    private double money;
    private LocalDate dateOfPayment;

    public PayType(double money, LocalDate dateOfPayment) {
        this.money = money;
        this.dateOfPayment = dateOfPayment;
    }

    public abstract void msg();

}
