package lv.javaguru.lessons.homework.lessoncreditcard;

public class CreditCard {
    private String cardNumber;
    private String pinCode;
    double debetBalance;
    double creditLimit;
    double withdrawCredit;

    CreditCard(String cardNumber, String pinCode) {
        debetBalance = 150;
        creditLimit = 200;
        setCardNumber(cardNumber);
        setPinCode(pinCode);

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
    public boolean topup(double amount, String pinCode){

        return true;
    }
    void withdraw(){

    }

}
