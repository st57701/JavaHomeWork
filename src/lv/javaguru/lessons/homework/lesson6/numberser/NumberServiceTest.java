package lv.javaguru.lessons.homework.lesson6.numberser;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberServiceTest runnTest = new NumberServiceTest();
        runnTest.checkNumber();

    }

    public void checkNumber() {
        NumberService number1 = new NumberService();
        int expectedNumberSumm = 45;
        int actualNumberSum = number1.sumInRange(10, 5);
        int expectedEvenCounter = 3;
        int actualEvenCounter = number1.getEvenNumberCount(5, 10);
        if (expectedNumberSumm == actualNumberSum && expectedEvenCounter == actualEvenCounter) {
            System.out.println("Test :  SUCCESS");

        } else {
            System.out.println("Test :  Fail");
        }
    }

}
