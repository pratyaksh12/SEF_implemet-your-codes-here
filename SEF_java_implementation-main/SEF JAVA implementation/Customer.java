public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerEmail;
    protected ShoppingCart cart = null;
    protected CardDetail card = null;

    
    public void confirmAppointment(Appointment appointment){
        Appointment customerAppointment;
        customerAppointment = appointment;
        
    }

    public void updateInformation(){
        System.out.println(customerID);
        System.out.println(customerName);
        System.out.println(customerEmail);
    }

     //assosiating a cart with the customer
    public void initialise(){       
        cart = new ShoppingCart();     
    }

    public void updateProducts(Product product){
        cart.updateCart(product);
        cart.showProducts();
        cart.showTotalPrice();
    }

    public void finalise(CardDetail card){
        this.card = card;
        cart.proceedToCheckout(card);
    }   

    

    //customer makes a paymet
    public void makePayment(){
        //recieve total rice from the cart
        cart.showTotalPrice();
        //proceed with the payment        
        cart.paymentSuccess();
    }
    


}
