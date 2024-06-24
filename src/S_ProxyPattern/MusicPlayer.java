package S_ProxyPattern;

public class MusicPlayer {

    private static final RecProxy recProxy = new RecProxy();

    private static void loadHomePage(User user) {
        System.out.println("Loading Home page...");
        recProxy.showRecomendations(user);
    }

    private static void loadDiscoverPage(User user) {
        System.out.println("Loading Discover page...");
        recProxy.showRecomendations(user);
    }

    public static void main(String[] args) {

        var user = new User("Bill", true);

        loadHomePage(user);
        loadDiscoverPage(user);
    }
}
