package lv.javaguru.lessons.homework.lesson6.Poww;

public class Pow {
    public static void main(String[] args) {
        Pow pow1 = new Pow();
        pow1.checkPow(5, 4);
    }

    public void checkPow(int firstNumber, int secondNumber) {
        PowCalculator testPow = new PowCalculator();
        int expectedResult = 21;
        int actualResult = testPow.pow(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test Success");
        } else {
            System.out.println("Test Fail " + actualResult + " not a " + expectedResult);
        }
    }


}
