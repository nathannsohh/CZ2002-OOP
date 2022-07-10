public class Cylinder extends Circle1{
    private int height;
    
    public Cylinder(){
        super();
        height = 0;
    }
    public Cylinder(int x, int y, int rad, int h){
        super(x, y, rad);
        height = h;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
    public String toString(){
        return super.toString();
    }
    public double area(){
        return 2 * super.area() + 2 * getRadius() * 3.14159 * height;
    }
    public double volume(){
        return super.area() * height;
    }
}
