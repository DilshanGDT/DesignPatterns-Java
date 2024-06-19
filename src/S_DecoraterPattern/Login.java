package S_DecoraterPattern;

public class Login {

    public static void main(String[] args) {

        var user = new BasicUser();
        user.printPrivilages();

        System.out.println();

        var adminUser = new AdminUser(user);
        adminUser.printPrivilages();

        System.out.println();

        var devUser = new DeveloperUser(adminUser);
        devUser.printPrivilages();

    }
}
