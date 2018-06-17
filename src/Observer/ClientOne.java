package TimeServer;

import java.util.Date;

public class ClientOne implements Client {
    @Override public void handleEvent(Date currentDate) {
        System.out.println("Current date and time changed to " + currentDate);
    }
}

