package poo.challenge37;

public class App {
    public static void main(String[] arg){
        BankAccount ba1 = new BankAccount("500",0,"John","john@mail.com", "258820001113");
        ba1.Deposit(500);
        ba1.withdrawal(250);

        VipCustomer vp = new VipCustomer();
        System.out.println(vp.toString());

    }

}
