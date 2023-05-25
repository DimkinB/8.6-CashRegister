public class CashRegisterDemo {

    public static void main (String [] args) {


            RetailItem item = new RetailItem("Sweater",10,19.99);

            CashRegister sale = new CashRegister (item,2);


        System.out.printf("$%.2f\n",sale.getSubtotal());
        System.out.printf("$%.2f\n",sale.getTax());
        System.out.printf("$%.2f\n",sale.getTotal());

    }

}
