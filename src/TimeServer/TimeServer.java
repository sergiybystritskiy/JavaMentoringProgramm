package TimeServer;

import java.util.ArrayList;
import java.util.List;

public class TimeServer implements Observed {
    int date;
    int time;

    public void setDateAndTime(int d, int t) {
        d = date;
        t = time;
        notifyClients();
    }

    List<Observer> observers = new ArrayList<>();

    @Override public void addClient(Observer observer) {
        observers.add(observer);
    }

    @Override public void deleteClient(Observer observer) {
        observers.remove(observer);
    }

    @Override public void notifyClients() {
        for(Observer observer : observers) {
            observer.handleEvent(date, time);
        }
    }
}
