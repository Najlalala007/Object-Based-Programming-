public class IsoscelesTriangle extends Shape {

    protected double base;
    protected double height;

    public IsoscelesTriangle(double base, double height, String name) {
        super.setName(name);
        this.base = base;
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    public void calculateArea() {
        super.area = (0.5 * base * height);
    }

    public void calculatePerimeter() {
        // In an isosceles triangle, assuming the other two sides are equal
        // we can calculate the side using the Pythagorean theorem:
        // side = sqrt(height^2 + (base / 2)^2)
        double side = Math.sqrt(Math.pow(height, 2) + Math.pow(base / 2, 2));
        super.perimeter = (base + 2 * side);
    }
}
