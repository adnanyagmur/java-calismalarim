public class Main {

    public static void main(String[] args) {
	 Customer customer = new Customer();
     Employee employee = new Employee();
     customer.id = 1;
     customer.email = "asdad@asdasd";
     employee.id = 1;
     employee.salary = 5000;

     EmploeeManager emploeeManager = new EmploeeManager();
     CustomerManager customerManager= new CustomerManager();
     emploeeManager.BestEmployee();
     customerManager.Add();
     emploeeManager.BestEmployee();


    }
}
