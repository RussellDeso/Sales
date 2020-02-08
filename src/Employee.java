import java.util.ArrayList;


abstract class Employee {
    private ArrayList<Client> Clients;
    private String employeeName;
    private long salesID;
    private SalesManager Manager;
    public Employee(String name, long id, SalesManager manager){
        employeeName=name;
        salesID=id;
        Manager=manager;
        Clients = new ArrayList<Client>();
    }
    public boolean addClient(Client client){
        try {Clients.add(client);
            Clients.sort(null);
            return true;
            }
        catch (Exception e){ return false;}
    }
    public ArrayList<Client> getClients() {
        return Clients;
    }
}
