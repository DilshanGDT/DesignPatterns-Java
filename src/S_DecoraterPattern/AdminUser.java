package S_DecoraterPattern;

public class AdminUser extends UserDecorator {

    public AdminUser(User user) {
        super(user);
    }

    @Override
    public void printPrivilages() {
        super.printPrivilages();
        System.out.println("Can create new users.");
    }

}
