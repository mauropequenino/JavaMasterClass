package poo.composition.compra_venda;

public class Buy {
    private int invCode;
    private String data;
    private BuyItem buyItem;

    public Buy(int invCode, String data, BuyItem buyItem) {
        this.invCode = invCode;
        this.data = data;
        this.buyItem = buyItem;
    }

    public int getInvCode() {
        return invCode;
    }

    public String getData() {
        return data;
    }

    public BuyItem getBuyItem() {
        return buyItem;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "Invoice=" + invCode +
                "\ndata= " + data + '\'' +
                "\nItem=" + buyItem.getProduct().getName() +
                "\nQtd= " + buyItem.getQuantity() +
                "\nUnit price= " + buyItem.getUnitPrice() +
                "\nTotal= " + buyItem.subTotal()+
                '}';
    }
}
