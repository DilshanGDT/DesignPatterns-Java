package B_TemplateMethodPattern;

public class WelcomeEmail extends Email {

    @Override
    public void sendMessageBody() {
        System.out.println("Thank you for sign up... ");
    }

}
