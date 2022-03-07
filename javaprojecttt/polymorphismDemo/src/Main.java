public class Main {

    public static void main(String[] args) {
//	EmailLogger emailLogger = new EmailLogger();
 //   emailLogger.Log("log mesajı");

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.Add();

    }
}
