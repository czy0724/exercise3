public class Slice-o-Heaven {
    public String storeName;
    public String storeAdddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    public String orderID;
    public double orderTotal;


    public void takeOrder(String id, String details, double total){
      orderID = id;

      orderDetails = details;

      orderTotal = total;

      System.out.println("Order accepted!");

      System.out.println("Making the pizza");



      try{
        Thread.sleep(5000);
    } catch (InterruptedException e){
        System.out.println("Order is ready for pickup!");
    }

    System.out.println("Your order is ready!");

    printReceipt();


}

private void printReceipt(){
    System.out.println("********RECEIPT********");

    System.out.println("Order ID: " + orderID);
    System.out.println("Order Details: " + orderDetails);
    System.out.println("Order Total: " + orderTotal);
}
