package lv.javaguru.lessons.homework.lesson4.CreditCard;

import java.util.concurrent.CancellationException;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(300,200,"13");
        card1.withdrawal(400,"13");
        card1.topup(200,"13");
        card1.withdrawal(50,"13");


    }
}
