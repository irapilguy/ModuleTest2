public class RegularItem extends Item {
    public RegularItem(String title, double price, int quantity){
        super(title,price,quantity);
    }

    public int calculateDiscount() {
        int discount = 0 ;
        discount += this.getQuantity() / 100 * 10;
        if (discount > 80)
            discount = 80;
        return discount;
    }
}
