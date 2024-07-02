package B_MediatorPattern;

public class Ticket {

    private Assignee assignee;

    public enum Status {
        SUBMITTED,
        IN_PROGERSS,
        DONE
    }

    private Status status;

    public Ticket() {
        this.status = status.SUBMITTED;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
        System.out.println("Ticket status changed to : " + status);
    }

    public void setAssignee(Assignee ass) {
        this.assignee = ass;
    }
}
