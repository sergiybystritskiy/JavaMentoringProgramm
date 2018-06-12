package TimeServer;

import java.util.Date;

public class ClientFour implements Client {
    @Override public void handleEvent(Date currentDate) {
        System.out.println(currentDate);
    }
}

