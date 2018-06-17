package TimeServer;

import java.util.Date;

public class ClientTwo implements Client {
    @Override public void handleEvent(Date currentDate) {
        System.out.println("Date and time changed to " + currentDate);
    }
}

