import java.util.ArrayList;

public class SalesAssociate extends Employee {
    public String toString(){

    }
    double bonus(){
        return this.getClients().size()*1000.0;
    }
}
