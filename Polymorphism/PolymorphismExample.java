public class PolymorphismExample {
    public static void main(String[] args) {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        Triangle BCD = new RightTriangle("BCD", 3.0, 4.0);
        Triangle CDE = new Triangle("CDE", 3.0, 4.0, 5.0);

        ABC.printSides(); // RightTriangle ABC sides: 3.0, 4.0, 5.0
        BCD.printSides(); // RightTriangle BCD sides: 3.0, 4.0, 5.0
        CDE.printSides(); // Triangle CDE sides: 3.0, 4.0
    }
}
