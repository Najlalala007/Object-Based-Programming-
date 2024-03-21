public class Encapsulation {
    // Private variable accessible only within this class
    private int privateData;

    // Getter method to access privateData
    public int getPrivateData() {
        return privateData;
    }

    // Setter method to modify privateData
    public void setPrivateData(int value) {
        privateData = value;
    }

    // Protected method accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    // Default (no modifier) method accessible only in the same package
    void defaultMethod() {
        System.out.println("This is a default method");
    }

    // Public method accessible from any other class
    public void publicMethod() {
        System.out.println("This is a public method");
    }
}