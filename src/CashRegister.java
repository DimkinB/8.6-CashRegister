public class CashRegister {

    private int quanityPurchased;
    private RetailItem item;

    public CashRegister(RetailItem item, int quantity) {
        quanityPurchased = quantity;
        this.item = new RetailItem (item);

    }


    public double getSubtotal() {

        return quanityPurchased * item.getPrice();
    }

    public double getTax() {

        return getSubtotal()*0.06;

    }

    public double getTotal() {

        return getSubtotal()+getTax();
    }







}
