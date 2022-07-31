package poo.composition.compra_venda;

public class SellItem {
    private int quantity;
    private double unitPrice;
    private Product product;

    public SellItem(int quantity, double unitPrice, Product product) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.product = product;
    }

    public double subTotal(){
        return quantity * unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Product getProduct() {
        return product;
    }
}
