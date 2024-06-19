package S_DecoraterPattern;

public class BasicUser implements User {

    @Override
    public void printPrivilages() {
        System.out.println("Can login...");
    }
}
