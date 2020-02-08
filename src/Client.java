public class Client implements Comparable<Client>{
    private int clientID;
    private String clientName;

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
        return (clientName + " "+ clientID);
    }

    @Override
    public int compareTo(Client o) {
        return Integer.compare(this.clientID, o.clientID);
    }
}
