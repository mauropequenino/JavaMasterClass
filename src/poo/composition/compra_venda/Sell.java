package poo.composition.compra_venda;

public class Sell {
    private int invCode;
    private String data;
    private SellItem sellItem;

    public Sell(int invCode, String data, SellItem item) {
        this.invCode = invCode;
        this.data = data;
        this.sellItem = item;
    }

    public int getInvCode() {
        return invCode;
    }

    public String getData() {
        return data;
    }

    public SellItem getSellItem() {
        return sellItem;
    }

    @Override
    public String toString() {
        String s = "Sell{" +
                "Invoice=" + invCode +
                "\ndata= " + data +
                "\nItem=" + getSellItem().getProduct().getName() +
                "\nQtd= " + getSellItem().getQuantity() +
                "\nUnit price= " + getSellItem().getUnitPrice() +
                "\nTotal= " + getSellItem().subTotal() +
                '}';
        return s;
    }
}
