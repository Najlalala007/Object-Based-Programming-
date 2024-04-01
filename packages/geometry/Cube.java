package geometry;
import shapes.Shape;

public class Cube implements Geometry {
    private Shape baseShape;

    public Cube(Shape baseShape) {
        this.baseShape = baseShape;
    }

    @Override
    public double calculateVolume() {
        double baseArea = calculateBaseArea();
        return baseArea * baseShape.calculatePerimeter();
    }

    @Override
    public double calculateBaseArea() {
        return baseShape.calculateArea();
    }
}
