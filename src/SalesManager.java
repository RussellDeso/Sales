import java.util.ArrayList;

public class SalesManager extends Employee{
    ArrayList<SalesAssociate> associates;

    public SalesManager(String name, long id, SalesManager manager) {
        super(name, id, manager);
    }

    public ArrayList<SalesAssociate> getAssociates() {
        return associates;
    }

    public void setAssociates(ArrayList<SalesAssociate> associates) {
        this.associates = associates;
    }

    public String toString(){
        return "hehe";
    }

    double bonus(){
        return(associates.size()*5000.0 + getClients().size()*2000.0);
    }
}
