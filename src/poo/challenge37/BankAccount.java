package poo.challenge37;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("0000",500,"Default","default@gmail.com", "82000000");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void Deposit(double amount){
        try {
            if(amount > 0){
                this.balance += amount;
            }
        } catch (NumberFormatException e){
            System.out.println("ERRO: Não foi possivel efectuar o deposito");
        } finally {
             System.out.println("Deosito efectuado com sucesso!\nSaldo actual: " + this.balance);
        }
    }

    public void withdrawal(double amount){
        try {
            if(this.balance > amount) {
                this.balance -= amount;
                System.out.println("Levanmento efctuado com sucesso\nSaldo actual:" + this.balance);
            } else {
                System.out.println("Saldo insuficiente para efectuar o levanmento");
            }
        } catch (NumberFormatException e){
            System.out.println("ERRO: Não foi possivel efectuar o levantamento");
        }
    }
}
