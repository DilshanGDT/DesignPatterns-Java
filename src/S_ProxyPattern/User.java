package S_ProxyPattern;

public class User {

    private final String name;
    private final boolean isPremuim;

    public User(String name, boolean isPremuim) {
        this.name = name;
        this.isPremuim = isPremuim;
    }

    public String getName() {
        return name;
    }

    public boolean isPremuim() {
        return isPremuim;
    }
}
