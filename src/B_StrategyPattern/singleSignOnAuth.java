package B_StrategyPattern;

public class singleSignOnAuth implements Authenticator {

    @Override
    public void login() {
        System.out.println("Loging in with single sign-in.");
    }

}
