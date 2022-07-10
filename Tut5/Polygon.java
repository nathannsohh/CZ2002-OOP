public class Polygon {
    public enum KindofPolygon { POLY_PLAIN, POLY_RECT,
        POLY_TRIANG};
        protected String name;
        protected float width;
        protected float height;
        protected KindofPolygon polytype;
        public Polygon(String theName, float theWidth, float theHeight) {
            name = theName;
            width = theWidth;
            height = theHeight;
            polytype = KindofPolygon.POLY_PLAIN;
        }
        public KindofPolygon getPolytype() {
            return polytype;
        }
        public void setPolytype(KindofPolygon value) {
            polytype = value;
        }
        public String getName() { return name; }
        public float calArea() { return 0; }
        public void printWidthHeight( ) {
            System.out.println("Width = " + width + " Height = " + height);
        }
}

class Rectangle extends Polygon {
    public Rectangle(String name, float width, float height){
        super(name, width, height);
    }
}

class Triangle extends Polygon {
    public Triangle(String name, float width, float height){
        super(name, width, height);
    }
}

class TestPolygon {
    public void printArea(Rectangle r){
        float area = r.width * r.height;
        System.out.println("Area of Rectangle is " + area);
    }
    public void printArea(Triangle t){
        float area = (t.height * t.width)/2;
        System.out.println("Area of Triangle is " + area);
    }
}

class main1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("Rectangle 1", 10, 3);
        Triangle t = new Triangle("Triangle 1", 15, 19);
        r.setPolytype(Polygon.KindofPolygon.POLY_RECT);
        t.setPolytype(Polygon.KindofPolygon.POLY_TRIANG);
        TestPolygon test = new TestPolygon();
        test.printArea(r);
        test.printArea(t);
    }
}