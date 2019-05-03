package lv.javaguru.lessons.homework.lesson4user;

public class UserLoginService {


    boolean login(String inputPassword, User user) {
        if (!user.blocked) {
            if ((verify(inputPassword, user.getPassword(), user.getLogin())) == false) {
               // System.out.println(" attempts " + user.loginAttemptsLeft);
                user.loginAttemptsLeft--;
                if (user.loginAttemptsLeft == 0)
                    user.block();
            }
        }
        return true;
    }


    private boolean verify(String inPassword, String realPassword, String userName) {
        if (inPassword.equals(realPassword)) {
            System.out.println("Password Correct for " + userName);
            return true;

        } else {

            System.out.println("Password incorrect for " + userName);
            return false;

        }


    }

}
