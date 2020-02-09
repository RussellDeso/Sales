import java.util.ArrayList;

public class SalesManager extends Employee{
    ArrayList<Employee> employees;

    public SalesManager(String name, SalesManager manager, long id) {
        super(name, manager, id);
        this.employees = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public String toString(){
        String allEmployees = "";
        if(this.getEmployees().size()>1) {
            int count=0;
            while (count<this.getEmployees().size()) {
                allEmployees = allEmployees + getEmployees().get(count).getEmployeeName() + " " + getEmployees().get(count).getSalesID();
                count++;
                if (count == this.getEmployees().size())
                    allEmployees = allEmployees + ". ";
                else
                    allEmployees = allEmployees + ", ";
            }
        }
        String clients = "";
        if(this.getClients().size()>1) {
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
        return "Sales Manager: " + this.getEmployeeName() + ". Employees: " + allEmployees + "Clients: " + clients + "Bonus: " + bonus();
    }

    double bonus(){
        return(employees.size()*5000.0 + getClients().size()*2000.0);
    }
}
