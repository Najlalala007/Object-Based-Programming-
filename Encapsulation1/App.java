public class App {
    public static void main(String[] args) {
        // Creating an instance of Encapsulation class
        Encapsulation obj = new Encapsulation();
        
        // Setting privateData using setter method
        obj.setPrivateData(42);
        
        // Getting privateData using getter method and printing it
        int data = obj.getPrivateData();
        System.out.println("Private data: " + data);

        // Calling protected, default, and public methods from the Encapsulation class
        obj.protectedMethod();
        obj.defaultMethod();
        obj.publicMethod();
    }
}