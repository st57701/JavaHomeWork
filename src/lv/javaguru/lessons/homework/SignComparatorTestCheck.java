package lv.javaguru.lessons.homework;

public class SignComparatorTestCheck {
    public void test1() {
        SignComparator signComparator = new SignComparator();
        int firstNumber = 5;

        int expectedResult = 5;
        int actualResult = signComparator.compare(firstNumber);

        check(actualResult, expectedResult, "Test 1");

    }

    private static void check(int actualResult, int expectedResult, String test1) {
        if (expectedResult == actualResult) {
            System.out.println("\n" + test1 + " has passed");
        } else {
            System.out.println(test1 + " has failed");
            System.out.println(" Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
