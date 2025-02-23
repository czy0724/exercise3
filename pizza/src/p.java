public class p {
 // Pizzeria Management System for Slice-o-Heaven

    // Class variables
    private String nameOfStore;
    private String addressOfStore;
    private String emailOfStore;
    private String phoneOfStore;
    private String[] menuItems;
    private String[] ingredientsForPizza;
    private double[] pricesForPizza;
    private String[] sideDishes;
    private String[] beverageOptions;
    private String orderIdentifier;
    private double totalOrderCost;

    // Constructor to initialize store details
    public PizzeriaManagement(String name, String address, String email, String phone) {
        this.nameOfStore = name;
        this.addressOfStore = address;
        this.emailOfStore = email;
        this.phoneOfStore = phone;
        this.menuItems = new String[]{"Margherita", "Pepperoni", "Veggie"};
        this.ingredientsForPizza = new String[]{"Cheese", "Tomato Sauce", "Basil"};
        this.pricesForPizza = new double[]{8.99, 9.99, 10.99};
        this.sideDishes = new String[]{"Garlic Bread", "Salad"};
        this.beverageOptions = new String[]{"Soda", "Water"};
    }

    // Method to take an order
    public void placeOrder(String pizzaType, String[] sides, String[] drinks) {
        this.orderIdentifier = "ORD" + System.currentTimeMillis();
        double cost = 0.0;
        for (int i = 0; i < menuItems.length; i++) {
            if (menuItems[i].equals(pizzaType)) {
                cost += pricesForPizza[i];
                break;
            }
        }
        for (String side : sides) {
            cost += 3.99; // Assuming each side costs $3.99
        }
        for (String drink : drinks) {
            cost += 1.99; // Assuming each drink costs $1.99
        }
        this.totalOrderCost = cost;
        System.out.println("Order placed successfully. Order ID: " + orderIdentifier);
    }

    // Method to make pizza
    public void preparePizza(String pizzaType) {
        System.out.println("Preparing " + pizzaType + " pizza with " + String.join(", ", ingredientsForPizza));
    }

    // Method to print receipt
    public void generateReceipt() {
        System.out.println("Receipt for Order ID: " + orderIdentifier);
        System.out.println("Total Cost: $" + totalOrderCost);
    }

    public static void main(String[] args) {
        PizzeriaManagement store = new PizzeriaManagement("Slice-o-Heaven", "123 Pizza Lane", "contact@sliceoheaven.com", "555-1234");
        store.placeOrder("Margherita", new String[]{"Garlic Bread"}, new String[]{"Soda"});
        store.preparePizza("Margherita");
        store.generateReceipt();
    }
  
}
