package B_StrategyPattern;

public class PasswordAuth implements Authenticator {

    @Override
    public void login() {
        System.out.println("Loging in with username & password.");
    }

}
