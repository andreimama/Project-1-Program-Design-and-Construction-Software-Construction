package Task01_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author franc
 */
public final class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        this.calculateArea();
    }

    @Override
    public void calculateArea() {
        double piValue = Math.PI;
        super.area = piValue * getRadius() * getRadius();
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
