public class Client implements Comparable<Client>{
    private int clientID;
    private String clientName;
    private Employee employee;

    public Client(int ID, String Name){
        clientID=ID;
        clientName=Name;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }
    public String toString(){
        return ("Client: " + clientName + ". Sales Employee: " + this.employee.getEmployeeName() + " " + this.employee.getSalesID());
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int compareTo(Client o) {
        return Integer.compare(this.clientID, o.clientID);
    }
}
