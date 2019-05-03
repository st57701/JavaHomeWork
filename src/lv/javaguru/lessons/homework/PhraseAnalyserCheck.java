package lv.javaguru.lessons.homework;

public class PhraseAnalyserCheck {
    public void test(String inputText, String expectedResult) {
        PhraseAnalyser firstAnalyse = new PhraseAnalyser();

        String actualResult = firstAnalyse.analyse(inputText);
        check(actualResult, expectedResult, "Test ");
    }

    private static void check(String actualResult, String expectedResult, String test) {
        if (expectedResult == actualResult) {
            System.out.println("\n" + test + "has passed");
        } else {
            System.out.println(test + "has failed");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
