package main;

import geometry.Cube;
import shapes.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Cube cube = new Cube(square);

        System.out.println("Square Perimeter: " + square.calculatePerimeter());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Base Area: " + cube.calculateBaseArea());
    }
}