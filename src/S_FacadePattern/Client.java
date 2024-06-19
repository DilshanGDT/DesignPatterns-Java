package S_FacadePattern;

public class Client {

    public static void main(String[] args) {

        var enFacade = new EncryptionFacade();
        enFacade.encrypt("Hi, Come here!");
    }
}
