import java.util.ArrayList;

public class SalesAssociate extends Employee {
    public String toString(){
        String AssociateString ="Sales Associate: "+ this.employeeName + ". SalesManager: " + this.Manager.employeeName + " " + this.Manager.salesID +". Clients: ";
        String clients="";
        if(this.getClients().size>1) {
            int count=0;
            while (count<this.getClients().size()) {
                clients = clients + getCliets().get(count).toString();
                count++;
                if (count = this.getClients().size())
                    clients = clients + ", ";
                else
                    clients = clients + ". ";
            }
        }
        AssociateString=AssociateString+clients+ "Bonus: "+bonus();
    }
    double bonus(){
        return this.getClients().size()*1000.0;
    }
}
