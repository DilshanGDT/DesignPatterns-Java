package B_ObserverPattern;

import java.beans.PropertyChangeSupport;

/* Observable class */

public class User {

    private String status;
    private PropertyChangeSupport sup = new PropertyChangeSupport(this);

    public void setStatus(String status) {
        sup.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    public void addPropertyChangeListener(NewsFeed nf) {
        sup.addPropertyChangeListener(nf);
    }
}
