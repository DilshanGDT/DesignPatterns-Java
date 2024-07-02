package B_MediatorPattern;

import B_MediatorPattern.Ticket.Status;

public class Mediator {

    private Ticket tic;
    private Assignee ass;
    private Board bor;

    public Mediator(Ticket tic, Assignee ass, Board bor) {
        this.tic = tic;
        this.bor = bor;
        this.ass = ass;
    }

    public void pickUpTicket() {
        ass.pickUpTicket(tic);
        tic.setAssignee(ass);
        tic.setStatus(Status.IN_PROGERSS);
        bor.addTicketToInProgressTickets(tic);
    }

    public void resolveTicket() {
        ass.resolveTicket(tic);
        tic.setStatus(Status.DONE);
        bor.addTicketToDoneTickets(tic);
    }

}
