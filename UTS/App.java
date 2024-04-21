public class App {
    public static void main(String[] args) {
        // Creating some products
        Product bread = new Product("Bread", 17.000, 10);
        Product milk = new Product("Milk", 23.000, 20);

        // Adding products to the inventory
        Inventory inventory = new Inventory();
        inventory.addProduct(bread);
        inventory.addProduct(milk);

        // Creating a customer
        Customer customer = new Customer("Luca");

        // Adding items to the customer's shopping cart
        customer.addToCart(bread, 2);
        customer.addToCart(milk, 3);

        // Creating a cashier
        Cashier cashier = new Cashier();

        // Processing purchase
        cashier.processPurchase(customer);
    }
}
