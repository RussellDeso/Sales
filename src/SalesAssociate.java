import java.util.ArrayList;

public class SalesAssociate extends Employee {
    public SalesAssociate(String name, SalesManager manager,long id) {
        super(name, manager, id);
    }
    public String toString(){
        String AssociateString ="Sales Associate: "+ this.getEmployeeName() + ". SalesManager: " + this.getManager().getEmployeeName() + " " + this.getManager().getSalesID() +". Clients: ";
        String clients="";
        if(this.getClients().size()>=1) {
            int count=0;
            while (count<this.getClients().size()) {
                clients = clients + getClients().get(count).getClientName() + " " + getClients().get(count).getClientID();
                count++;
                if (count == this.getClients().size())
                    clients = clients + ". ";
                else
                    clients = clients + ", ";
            }
        }
        AssociateString=AssociateString+clients+ "Bonus: "+bonus();
        return AssociateString;
    }
    double bonus(){
        return this.getClients().size()*1000.0;
    }
}
