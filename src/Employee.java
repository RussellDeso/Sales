import java.util.ArrayList;


abstract class Employee {
    private ArrayList<Client> Clients;
    private String employeeName;
    private long salesID;
    private SalesManager Manager;
    public Employee(String name, SalesManager manager, long id){
        employeeName=name;
        salesID=id;
        Manager=manager;
        Clients = new ArrayList<Client>();
    }
    public boolean addClient(Client client){
        try {Clients.add(client);
            Clients.sort(null);
            client.setEmployee(this);
            return true;
            }
        catch (Exception e){ return false;}
    }

    public ArrayList<Client> getClients() {
        return Clients;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public long getSalesID() {
        return salesID;
    }

    public SalesManager getManager() {
        return Manager;
    }
}
