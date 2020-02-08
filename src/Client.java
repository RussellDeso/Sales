public class Client implements Comparable<Client>{
    private int clientID;
    private String clientName;

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public Client(int ID, String Name){
        clientID=ID;
        clientName=Name;
    }
    public String toString(){
        return (clientName + " "+ clientID);
    }

    @Override
    public int compareTo(Client o) {
        return Integer.compare(this.clientID, o.clientID);
    }
}
