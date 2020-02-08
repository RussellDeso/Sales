import java.util.ArrayList;
abstract class Employee {
    private ArrayList Clients = new ArrayList();
    public Employee(){}
    public boolean addClient(Client client){
        Clients.add(client);
    }
    public ArrayList getClients() {
        return Clients;
    }
}
