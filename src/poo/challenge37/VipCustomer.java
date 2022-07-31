package poo.challenge37;

public class VipCustomer {
    private String name, email;
    private double creditLimit;

    public VipCustomer(){
        this("Default","default@mail.com",1000);
    }
    public VipCustomer(String name, String email){
        this(name, email, 10000);
    }
    public VipCustomer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
