package lv.javaguru.lessons.homework.lesson4user;


public class UserTest {
    public static void main(String[] args) {
        UserTest testRunner = new UserTest();
        testRunner.checkUserIsBlocked();
        testRunner.checkUserIsNotBlocked();

    }

    public void checkUserIsBlocked() {
        User userTest = new User("Martin", "Password");
        UserLoginService user = new UserLoginService();
        user.login("Pssword", userTest);
        user.login("Pssword", userTest);
        user.login("Pssword", userTest);
        boolean actualResult = userTest.blocked;
        boolean expectedResult = true;


        if (expectedResult == actualResult) {
            System.out.println("Check user is blocked : SUCCESS " + " Expected Result: " + expectedResult + " Actual Result: " + actualResult);
        } else {
            System.out.println("Check user is blocked FAIL!" + " Expected Result: " + expectedResult + " Actual Result: " + actualResult);
        }
    }

    public void checkUserIsNotBlocked() {
        User userTest = new User("Martin", "Password");
        UserLoginService user = new UserLoginService();
        user.login("Pssword", userTest);
        user.login("Pssword", userTest);

        boolean actualResult = userTest.blocked;
        boolean expectedResult = true;


        if (expectedResult == actualResult) {
            System.out.println("Check user is blocked : SUCCESS");
        } else {
            System.out.println("Check user is blocked FAIL!" + " Expected Result: " + expectedResult + " Actual Result: " + actualResult);
        }
    }
}
