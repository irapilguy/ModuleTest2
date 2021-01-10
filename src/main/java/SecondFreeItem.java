public class SecondFreeItem extends Item {
    public SecondFreeItem(String title, double price, int quantity){
        super(title,price,quantity);
    }

    public int calculateDiscount() {
        int discount = 0;

        if (this.getQuantity() > 1)
            discount = 50;

        return discount;
    }
}
