public class Circle1 extends Point {
    private int radius;
    
    public Circle1(){
        super(0,0);
        radius = 0;
    }
    public Circle1(int x, int y, int rad){
        super(x, y);
        radius = rad;
    }
    public String toString(){
        return super.toString();
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int rad){
        radius = rad;
    }
    public double area(){
        return 3.14159 * radius * radius;
    }
}
