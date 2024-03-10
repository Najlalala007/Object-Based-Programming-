class Triangle {
    String name;
    double a, b;

    Triangle(String name, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    Triangle(String name, double a, double b, double c) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    void printSides() {
        System.out.println("Triangle " + name + " sides: " + a + ", " + b);
    }
}