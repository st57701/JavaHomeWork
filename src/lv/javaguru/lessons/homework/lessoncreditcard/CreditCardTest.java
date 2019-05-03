package lv.javaguru.lessons.homework.lessoncreditcard;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard master = new CreditCard("5127374712372323","234");
        ProcessCreditCard credit = new ProcessCreditCard();
        credit.checkPincode("234",master);
    }
}
