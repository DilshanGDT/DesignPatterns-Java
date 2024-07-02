package B_MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Ticket> inProgressTickets = new ArrayList<>();
    private List<Ticket> doneTickets = new ArrayList<>();

    public List<Ticket> getDoneTickets() {
        return this.doneTickets;
    }

    public void addTicketToInProgressTickets(Ticket tik) {
        inProgressTickets.add(tik);
        System.out.println("Tickect added to inProgressTickets list");
    }

    public void addTicketToDoneTickets(Ticket tik) {
        doneTickets.add(tik);
        System.out.println("Tickect added to doneTickets list");

        inProgressTickets.remove(tik);
        System.out.println("Ticket removed from inProgressTickets list");
    }
}
