public class Shape {
    private double radius;
    private double height;
    private double base;

    public Shape(double radius, double height, double base){
        this.radius = radius;
        this.height = height;
        this.base = base;
    }
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
    public double calArea(){
        return 0;
    }
    public double calVol(){
        return 0;
    }
}

class Square extends Shape {
    public Square(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return super.getBase() * super.getBase();
    }
}

class Rectangle extends Shape {
    public Rectangle(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return super.getBase() * super.getHeight();
    }
}

class Circle2 extends Shape {
    public Circle2(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return Math.PI * super.getRadius() * super.getRadius();
    }
}

class Triangle extends Shape {
    public Triangle(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return .5 * super.getBase() * super.getHeight();
    }
}

class Sphere extends Circle2 {
    public Sphere(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return 4 * super.calArea();
    }
}

class SquarePyramid extends Triangle {
    public SquarePyramid(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return 4*super.calArea() + super.getBase()*super.getBase();
    }
}

class Cuboid extends Rectangle {
    public Cuboid(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return 4*super.calArea() + 2*super.getBase()*super.getBase();
    }
}

class Cone extends Shape {
    public Cone(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return Math.PI * super.getRadius() *super.getRadius() + Math.PI * super.getRadius() * Math.sqrt(super.getRadius()*super.getRadius() + super.getHeight() * super.getHeight());
    }
}

class Cylinder1 extends Shape {
    public Cylinder1(double radius, double height, double base){
        super(radius, height, base);
    }
    public double calArea(){
        return Math.PI * super.getRadius() * super.getRadius() + Math.PI * 2 * super.getRadius() * super.getHeight();
    }
}