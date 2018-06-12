package TimeServer;

public class Client implements Observer {
    @Override public void handleEvent(int date, int time) {
        System.out.println("Current date changed to "+ date+"Current time changed to "+ time);
    }
}
