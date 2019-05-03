package lv.javaguru.lessons.homework;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.checkLightColorDetectorGreen();
        testRunner.checkLightColorDetectorFail();
    }

    public void checkLightColorDetectorGreen() {
        LightColorDetector checkLightDetect = new LightColorDetector();
        String expectedResult = "green";
        String actualResult = checkLightDetect.detect(555);
        if (expectedResult.equals(actualResult)) {
            System.out.println("CheckLightColorDetector: SUCCESS");
        } else {
            System.out.println("CheckLightColorDetector: FAIL");
        }
    }

    public void checkLightColorDetectorFail() {
        LightColorDetector checkLightDetect = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = checkLightDetect.detect(555);
        if (expectedResult.equals(actualResult)) {
            System.out.println("CheckLightColorDetector: SUCCESS");
        } else {
            System.out.println("CheckLightColorDetector: FAIL!" + " Expected Result: " + expectedResult + " Actual Result: " + actualResult);
        }
    }
}
