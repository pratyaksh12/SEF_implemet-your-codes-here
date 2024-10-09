import java.util.ArrayList;

public class ShoppingCart {
    private int cartID = 123456789;
    private double totalPrice = 0.0;
    private ArrayList<Product> productList;
    private OrderDetails orderdetails = null;
    CheckOut checkout;

    public void updateCart(Product product){
        if (product == null){
            throw new IllegalArgumentException("product cannot be null");
        }
        totalPrice += product.getPrice();
    }

    public void showProducts() {
        if (productList.isEmpty()) {
            System.out.println("your cart is empty");
        } else {
            for (Product product : productList) {
                product.getDetails();
            }
        }
    }

    public void showTotalPrice() {
        System.out.println(totalPrice);
    }

    // init a checkout that is linked with the cart

    public void proceedToCheckout(CardDetail card) {

        //initialise a checkout with crad details
        if (checkout == null){
            this.checkout = new CheckOut();
            this.checkout.addCardDetails(card);
        }else{

            //there is already an order present
            System.out.println("Checkout in progress...");
        }
    }

    // sending the message to the customer regarding the payment of the order

    public void paymentSuccess() {
        //check the payment from the bank
        if (checkout.confirmPayment()) {
            System.out.println("Payment successful : the receipt will be sent to you through an email.");
            orderdetails = new OrderDetails(checkout, 1234);
        } else {
            System.out.println("Payment failed or the cart was not initialised");
        }
    }

    
}
