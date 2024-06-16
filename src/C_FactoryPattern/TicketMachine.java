package C_FactoryPattern;

public class TicketMachine {

    /*
     * Since we only have two ticket types tis implementation is okay.
     * if there are more we can use hashmap
     */

    Ticket createTicket(String ticketType) {

        if (ticketType.equalsIgnoreCase("Bus")) {
            return new BusTicket();
        } else {
            return new TrainTicket();
        }
    }
}
