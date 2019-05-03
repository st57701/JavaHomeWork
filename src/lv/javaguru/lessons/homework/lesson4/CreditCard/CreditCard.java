package lv.javaguru.lessons.homework.lesson4.CreditCard;

public class CreditCard {
    private int creditCardNumber;
    private String pinNumber;
    private double debetBalance;
    private double creditLimit;
    private double takeCredit = 0;
    private int pinAttempts = 0;

    public CreditCard(double debetBalance, double creditLimit, String pinNumber) {
        this.debetBalance = debetBalance;
        this.creditLimit = creditLimit;
        this.pinNumber = pinNumber;
        System.out.println("Card : Debet Balace  = " + debetBalance + " Credit Limit = " + creditLimit + "\n");
    }

    public boolean topup(double amount, String pinCode) {
        if (isBlocked(pinAttempts)) {
            if (checkPin(pinCode)) {
                if (takeCredit == 0) {
                    debetBalance += amount;
                    System.out.println("After Deposit " + amount + ", Debet balance now is = " + debetBalance + " Credit Limit is " + creditLimit);
                } else {

                    debetBalance = amount - takeCredit;
                    creditLimit += takeCredit;
                    System.out.println("After Deposit " + amount + ", Debet Balance now is = " + debetBalance + " Credit Limit is " + creditLimit);
                }


            }

        }
        return true;
    }

    public boolean withdrawal(double amount, String pinCode) {
        if (isBlocked(pinAttempts)) {
            if (checkPin(pinCode)) {
                double availableAmount = debetBalance + (creditLimit - takeCredit);
                boolean isEnoughMoney = availableAmount - amount > 0.001;
                if (isEnoughMoney) {


                    if (debetBalance > amount) {
                        debetBalance -= amount;
                        System.out.println("After withdrawal " + amount + ", Debet balance is  " + debetBalance + ", Credit limit = " + creditLimit);
                    } else {
                        creditLimit -= (amount - debetBalance);
                        takeCredit += (amount - debetBalance);
                        debetBalance = 0;
                        System.out.println("After withdrawal " + amount + ", Debet balance is " + debetBalance + ", New Credit limit " + creditLimit + ", has taken credit " + takeCredit);

                    }
                }

            }
            return true;
        }
        return true;
    }

    public boolean checkPin(String pinCode) {
        if (pinCode.equals(pinNumber)) {
            pinAttempts = 0;
            return true;

        } else {
            pinAttempts++;
            System.out.println("Wrong pincode");
            return false;
        }
    }

    public boolean isBlocked(int pinAttempts) {
        if (pinAttempts <= 3) {
            return true;
        } else {
            System.out.println("Card is locked");
            return false;
        }


    }


}






