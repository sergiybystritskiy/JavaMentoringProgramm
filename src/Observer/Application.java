package TimeServer;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        TimeServer server1 = new TimeServerImplOne();
        TimeServer server2 = new TimeServerImplTwo();
        Client client1 = new ClientOne();
        Client client2 = new ClientTwo();
        Client client3 = new ClientThree();
        Client client4 = new ClientFour();
        server1.addClient(client1);
        server1.addClient(client2);
        server1.addClient(client3);
        server2.addClient(client2);
        server2.addClient(client4);
        for(int i = 0; i < 10; i++) {
            server1.notifyClients();
            server2.notifyClients();
            Thread.sleep(2000);
        }
    }
}
