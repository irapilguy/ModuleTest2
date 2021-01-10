public class SaleItem extends Item {
    public SaleItem(String title, double price, int quantity){
        super(title,price,quantity);
    }

    public int calculateDiscount() {
        return 90;
    }
}
