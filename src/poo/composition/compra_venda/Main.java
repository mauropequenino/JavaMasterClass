package poo.composition.compra_venda;

public class Main {
    public static void main(String[] args) {
        //Composiacao
        Buy buy = new Buy(01,"24/07/2022",new BuyItem(2,2.5,new Product(551,"PC",3)));
        System.out.println(buy.toString());
    }
}
