package B_MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Assignee {

    private List<Ticket> tickets = new ArrayList<>();

    public void pickUpTicket(Ticket tik) {
        System.out.println("Ticket picked by Assignee");
        tickets.add(tik);
    }

    public void resolveTicket(Ticket tik) {
        tickets.remove(tik);
        System.out.println("Ticket Resolved");
    }
}
