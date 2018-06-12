package TimeServer;

import java.util.Date;

public class ClientThree implements Client {
    @Override public void handleEvent(Date currentDate) {
        System.out.println("Now it is " + currentDate);
    }
}

