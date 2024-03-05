public class RightTriangle extends Shape {

    protected double base;
    protected double height;

    public RightTriangle(double base, double height, String name) {
        super.setName(name);
        this.base = base;
        this.height = height;
        calculateArea(base, height);
        calculatePerimeter(base, height);
    }

    public void calculateArea(double base, double height) {
        super.area= (0.7 * base * height);
    }

    public void calculatePerimeter(double base, double height) {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        super.perimeter= (base + height + hypotenuse);
    }
}
