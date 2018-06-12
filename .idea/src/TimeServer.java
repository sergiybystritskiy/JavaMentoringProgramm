package TimeServer;

public interface TimeServer {
void addClient(Client observer);
void deleteClient (Client observer);
void notifyClients ();
}
