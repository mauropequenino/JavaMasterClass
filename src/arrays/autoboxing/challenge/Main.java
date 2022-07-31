package arrays.autoboxing.challenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        bank.addBranch("Adelaide");
        bank.addBranch("Sydney");

        bank.addCustomer("Sydney", "John", 201.5);
        bank.addCustomer("Sydney", "Jane", 101.55);
        bank.addCustomer("Sydney", "Doe", 124.24);

        bank.addCustomer("Adelaide", "Marty", 144.5);
        bank.addCustomer("Adelaide", "Kelly", 201.5);

        bank.addCustomerTransaction("Adelaide", "Marty", 20.5);
        bank.addCustomerTransaction("Adelaide", "Marty", 52.5);

        bank.listCustomers("adelaide",true);
        bank.listCustomers("sydney",true);

        if(!bank.addCustomerTransaction("Sydney", "Karl", 15.4)){
            System.out.println("\nCustomer doesn't exist at branch");
        };

        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide already exists");
        }

        if(!bank.addCustomer("Melbourne", "Brian", 6.33)){
            System.out.println("Error Melbourne branch doesnt exists");
        }

    }
}
