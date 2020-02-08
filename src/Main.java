public class Main {
    public static void Main(String[] args){
        SalesManager testManager = new SalesManager("John", 500, null);
        SalesAssociate testAssociate = new SalesAssociate("Sam", 400, testManager);
        Client testClient = new Client(24, "Chloe");
        System.out.println(testAssociate.toString());
        System.out.println(testManager.toString());
    }
}
