package B_StrategyPattern;

public class App {

    public static void main(String[] args) {

        var loginPage = new LoginPage();

        loginPage.loginUser(Authenticator.passwordAuthenticator);
        loginPage.loginUser(Authenticator.singleSignOnAuthenticator);
    }
}
