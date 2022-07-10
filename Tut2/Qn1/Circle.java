public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    // CONSTRUCTOR
    public Circle(double rad){
        radius = rad;
    }
    // MUTATOR METHOD
    public void setRadius(double rad){
        radius = rad;
    }
    // ACCESSOR METHOD
    public double getRadius(){
        return radius;
    }
    // CALCULATE AREA
    public double area(){
        return PI * radius * radius;
    }
    // CALCULATE CIRCUMFERENCE
    public double circumference(){
        return 2 * PI * radius;
    }
    // PRINT AREA
    public void printArea(){
        System.out.println(area());
    }
    // PRINT CIRCUMFERENCE
    public void printCircumference(){
        System.out.println(circumference());
    }
}

