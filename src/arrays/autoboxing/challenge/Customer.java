package arrays.autoboxing.challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    //inicia o arraylist e recebe a transacao inicial
    public Customer(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(initialAmount);
    }
    //adicionar transacao
    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
