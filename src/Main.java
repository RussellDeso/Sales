public class Main {
    public static void main(String[] args){
       SalesManager Tom = new SalesManager("Tom", null, 1);
       SalesManager Jane = new SalesManager("Jane", null, 2);
       SalesAssociate Harry = new SalesAssociate("Harry", Jane, 28);
       Jane.addEmployee(Harry);
       SalesAssociate Nancy = new SalesAssociate("Nancy", Tom, 15);
       Tom.addEmployee(Nancy);
       Client Ann = new Client(51, "Ann");
       Client John = new Client(734, "John");
       Client Susan = new Client(515, "Susan");
       Client David = new Client(921, "David");
       Client Sarah = new Client(478, "Sarah");
       Client Daniel = new Client(269, "Daniel");
       Jane.addClient(John);
       Jane.addClient(Sarah);
       Tom.addClient(David);
       Harry.addClient(Ann);
       Nancy.addClient(Daniel);
       Nancy.addClient(Susan);
       System.out.println(Jane.toString());
       System.out.println(Tom.toString());
    }
}
