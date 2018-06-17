package TimeServer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class TimeServerImplTwo implements TimeServer {

    List<Client> observers = new ArrayList<>();

    @Override public void addClient(Client observer) {
        observers.add(observer);
    }

    @Override public void deleteClient(Client observer) {
        observers.remove(observer);
    }


    @Override public void notifyClients() {
        for(Client observer : observers) {
            observer.handleEvent(new Date());
        }
    }
}


