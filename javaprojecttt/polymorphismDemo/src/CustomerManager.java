public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger = baseLogger;
    }
    public void Add(){
        System.out.println("müsteri eklendi");
        this.baseLogger.Log("log mesajı");
    }
}
