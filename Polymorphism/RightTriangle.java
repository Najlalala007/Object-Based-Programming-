class RightTriangle extends Triangle {
    double c;

    RightTriangle(String name, double a, double b) {
        super(name, a, b);
        this.c = Math.sqrt(a * a + b * b);
    }

    void printSides() {
        System.out.println("RightTriangle " + name + " sides: " + a + ", " + b + ", " + c);
    }
}