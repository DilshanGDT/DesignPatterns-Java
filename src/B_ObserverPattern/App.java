package B_ObserverPattern;

public class App {

    public static void main(String[] args) {

        var user1 = new User();
        User user2 = new User();
        var newsFeed = new NewsFeed();

        user1.addPropertyChangeListener(newsFeed);
        user2.addPropertyChangeListener(newsFeed);

        user1.setStatus("Going for a walk");
        user2.setStatus("Enjoying a coffee");

        newsFeed.printStatues();
    }
}
