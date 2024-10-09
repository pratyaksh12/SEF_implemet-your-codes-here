public class OrderDetails {
    private CheckOut checkout;
    private int orderID;

    public OrderDetails(CheckOut checkOut, int orderID){
        this.orderID = orderID;
        this.checkout = checkOut;
    }

    public void trackOrder(){

    }

    public void cancelOrder(){
        
    }
}
