package C_FactoryPattern;

public class BusTicket implements Ticket {

    /* factory */
    @Override
    public int getPrice() {
        return 3;
    }

}
