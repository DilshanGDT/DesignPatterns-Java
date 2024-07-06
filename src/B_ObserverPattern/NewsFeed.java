package B_ObserverPattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/* Observer class */

public class NewsFeed implements PropertyChangeListener {

    private List<String> statues = new ArrayList<>();

    public void printStatues() {
        statues.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        statues.add((String) evt.getNewValue());
    }
}
