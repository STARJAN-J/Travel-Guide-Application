package StarjanProject.Tourist_Guide_Console_App.payment;

import java.time.LocalDate;

import StarjanProject.Tourist_Guide_Console_App.exceptionHandling.ExceptionHandling;

public class Pay {
    
    public void pay(double amount, LocalDate date) {
        PayType pay;
        boolean flag = true;
        while (flag) {
            int enter = ExceptionHandling.Int("1. Credit Card \n2. Debit Card \n3. Online Banking \n4. Upi \n5. Exit \nEnter Number: ");
            switch (enter) {
                case 1:
                    pay = new CreditCard(amount, date);
                    pay.msg();
                    return;
                case 2:
                    pay = new DebitCard(amount, date);
                    pay.msg();
                    return;
                case 3:
                    pay = new OnlineBanking(amount, date);
                    pay.msg();
                    return;
                case 4:
                    pay = new Upi(amount, date);
                    pay.msg();
                    return;
                case 5:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
