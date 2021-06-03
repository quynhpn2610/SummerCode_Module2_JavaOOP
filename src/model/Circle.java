package model;

public class Circle {
    protected double radius = 10;
    protected String color = "red";
    protected boolean filled = true;

    // Constructors

    public Circle(){

    }

    public Circle(double radius, String color){
       this.radius = radius;
       this.color = color;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters

    public double getRadius() {
        return radius;
    }

    public String getColor(){
        return color;
    }
}
