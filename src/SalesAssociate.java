import java.util.ArrayList;

public class SalesAssociate extends Employee {
    public String toString(){

    }
    double bonus(){
        double bonus;
        clientNum=this.getClients().size();
        bonus = clientNum*1000;
    }
}
