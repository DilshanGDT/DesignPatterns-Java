package B_TemplateMethodPattern;

public abstract class Email {

    public void sendGreetings() {
        System.out.println("Hello, ");
    }

    public abstract void sendMessageBody();

    public void sendClosings() {
        System.out.println("Best Regards. ");
    }
}
