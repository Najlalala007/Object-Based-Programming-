public class EqTriangle extends Shape {

    protected Double sideLength;

    public EqTriangle(Double sideLength, String name) {
        super.setName(name);
        this.sideLength = sideLength;
        this.calculateArea(sideLength);
        this.calculatePerimeter(sideLength);
    }

    public void calculateArea(Double sideLength) {
        super.area=(Math.sqrt(3) / 4 * Math.pow(sideLength, 2));
    }

    public void calculatePerimeter(Double sideLength) {
        super.perimeter=(3 * sideLength);
    }
}
