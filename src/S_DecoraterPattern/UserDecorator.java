package S_DecoraterPattern;

public abstract class UserDecorator implements User {

    private final User user;

    public UserDecorator(User user) {
        this.user = user;
    }

    @Override
    public void printPrivilages() {
        user.printPrivilages();
    }
}
