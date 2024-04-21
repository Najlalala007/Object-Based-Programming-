// Customer class representing a customer
class Customer {
    private String Name;
    private ShoppingCart cart;

    public Customer(String name) {
        this.Name = name;
        this.cart = new ShoppingCart();
    }

    public void addToCart(Product product, int quantity) {
        cart.addItem(product, quantity);
    }

    public void removeFromCart(Product product) {
        cart.removeItem(product);
    }

    public void checkout() {
        double total = cart.calculateTotal();
        System.out.println("Thank You!! Payment of " + total + " has been processed.");
    }
}