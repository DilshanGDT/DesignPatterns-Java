package C_FactoryPattern;

public class TicketOffice {

    private static final TicketMachine ticketMachine = new TicketMachine();

    private static void buyABusTicket() {
        var ticket = ticketMachine.createTicket("bus");
        System.out.println("One bus ticket purchased. Price = $ " + ticket.getPrice());
    }

    private static void buyATrainTicket() {
        var ticket = ticketMachine.createTicket("train");
        System.out.println("One train ticket purchased. Price = $ " + ticket.getPrice());
    }

    public static void main(String[] args) {

        buyABusTicket();
        buyATrainTicket();

    }
}
