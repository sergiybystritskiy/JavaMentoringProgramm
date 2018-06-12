package TimeServer;

public interface Observed {
void addClient(Observer observer);
void deleteClient (Observer observer);
void notifyClients ();
}
