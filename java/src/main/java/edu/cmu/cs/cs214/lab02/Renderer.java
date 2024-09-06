package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    // public Rectangle rectangle;
    
    // Renderer(Rectangle rectangle) {
    //     this.rectangle = rectangle;
    // }

    private Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
    // void draw() {
    //     double area = rectangle.getArea();

    //     // assume implementation

    //     System.out.println("Shape printed\n" + "Its area is " + area);
    // }
}
