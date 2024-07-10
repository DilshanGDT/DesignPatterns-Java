package B_StrategyPattern;

public interface Authenticator {

    void login();

    /*
     * with these lambda strategy pattern we do not need passwordAuth and
     * singleSignOnAuth clasess.
     */

    Authenticator passwordAuthenticator = () -> System.out.println("Logging in with username and password.");
    Authenticator singleSignOnAuthenticator = () -> System.out.println("Signing in with single sign-in.");
}
