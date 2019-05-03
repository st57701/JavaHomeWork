package lv.javaguru.lessons.homework.lesson4user;

public class User {
    private String login;
    private String password;
    int loginAttemptsLeft;
    boolean blocked;


    User(String login, String password) {
        loginAttemptsLeft = 3;
        setLogin(login);
        setPassword(password);


    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    void resetUserAttempts() {
        System.out.println("Login attempts is reset you have 3 more attempts, for username : " + getLogin());
        loginAttemptsLeft = 3;

    }

    void block() {

        blocked = true;
        System.out.println("Login blocked for username " + getLogin());
    }
}


