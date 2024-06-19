package S_DecoraterPattern;

public class DeveloperUser extends UserDecorator {

    public DeveloperUser(User user) {
        super(user);
    }

    @Override
    public void printPrivilages() {
        super.printPrivilages();
        System.out.println("Can deploy to production.");
    }
}
