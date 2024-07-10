package B_TemplateMethodPattern;

public class App {

    public static void main(String[] args) {

        var welcomeEmail = new WelcomeEmail();
        welcomeEmail.sendGreetings();
        welcomeEmail.sendMessageBody();
        welcomeEmail.sendClosings();

        var unsubscribeEmail = new UnsubscribeEmail();
        unsubscribeEmail.sendGreetings();
        unsubscribeEmail.sendMessageBody();
        unsubscribeEmail.sendClosings();
    }
}
