public class App {

    public static void main(String[] args) throws Exception {

        Circle circle1 = new Circle(7.0, "Circle1");
        circle1.getInfo();

        Rectangle rectangle2 = new Rectangle(5.0, 4.0,"Rectangle2");
        rectangle2.getInfo();

        RightTriangle rightTriangle3 = new RightTriangle( 5.0, 8.0, "RightTriangle3");
        rightTriangle3.getInfo();

        IsoscelesTriangle isoscelesTriangle4 = new IsoscelesTriangle( 9.0, 12.0, "IsoscelesTriangle4");
        isoscelesTriangle4.getInfo();

        EqTriangle eqTriangle5 = new EqTriangle( 6.0,  "EqTriangle5");
        eqTriangle5.getInfo();
    }
}
