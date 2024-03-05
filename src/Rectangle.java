public class Rectangle extends Shape {

    protected double length;
    protected double width;

    public Rectangle(double length, double width, String name) {
        super.setName(name);
        this.length = length;
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

    public void calculateArea() {
        super.area = (length * width);
    }

    public void calculatePerimeter() {
        super.perimeter = (2 * (length + width));
    }
}
