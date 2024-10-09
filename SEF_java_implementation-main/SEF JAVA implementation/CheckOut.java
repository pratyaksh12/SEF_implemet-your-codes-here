public class CheckOut {
    private ShoppingCart cart;
    private CardDetail card = null;
    // private boolean completePayment = false;
    private PaymentGateway gateway =  null;

    


    //adding card details
    public void addCardDetails(CardDetail card){
        if(card == null){
            throw new IllegalArgumentException("The card details are missing");
        }
        this.card = card;
    }


    //checking for discout
    public void applyDiscount(){
        
    }

    //checking if the payment was successful with the bank
    public boolean confirmPayment(){
        System.out.println("sendiing the details to a payment gateway...");
        gateway = new PaymentGateway(card);

        return gateway.payment();
    }
}
