import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer adnan = new Customer(1,"adnan","yagmur");

        customers.add(adnan);
        customers.add(new Customer(2,"salih","sarı"));
        customers.add(new Customer(3,"mustafa","katip"));

        customers.remove(adnan);

        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}
