import java.util.ArrayList;
abstract class Employee {
    private ArrayList Clients = new ArrayList();
    private String employeeName;
    private long salesID;
    private SalesManager Manager;
    public Employee(String name, long id, SalesManager manager){
        employeeName=name;
        salesID=id;
        Manager=manager;
    }
    public boolean addClient(Client client){
        Clients.add(client);
    }
    public ArrayList getClients() {
        return Clients;
    }
}
