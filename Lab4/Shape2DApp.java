import java.util.Scanner;
public class Shape2DApp {
    public static void main(String[] args) {
        Shape shapeArray[] = new Shape[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Shapes:");
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            double radius = 0;
            double height = 0;
            double base = 0;
            System.out.printf("Shape %d: Choose a shape (square, rectangle, circle, triangle):\n", i+1);
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            int shape = sc.nextInt();
            switch(shape){
                case 1:
                    System.out.println("Enter the length of the Square:");
                    base = sc.nextDouble();
                    shapeArray[i] = new Square(radius, height, base);
                    break;
                case 2:
                    System.out.println("Enter the length of the Rectangle:");
                    height = sc.nextDouble();
                    System.out.println("Enter the breadth of the Rectangle:");
                    base = sc.nextDouble();
                    shapeArray[i] = new Rectangle(radius, height, base);
                    break;
                case 3:
                    System.out.println("Enter the radius of the Circle:");
                    radius = sc.nextDouble();
                    shapeArray[i] = new Circle2(radius, height, base);
                    break;
                case 4:
                    System.out.println("Enter the base of the Triangle:");
                    base = sc.nextDouble();
                    System.out.println("Enter the height of the Triangle:");
                    height = sc.nextDouble();
                    shapeArray[i] = new Triangle(radius, height, base);
                }
            }
            System.out.println("What kind of calculation do you want to do?");
            System.out.println("1. Area");
            System.out.println("2. Volume");
            int y = sc.nextInt();
            switch(y){
                case 1:
                    double area = 0;
                    for(int i = 0; i < t; i++){
                        area += shapeArray[i].calArea();
                    }
                    System.out.printf("The total area of all the shapes is %.2f", area);
                    break;
                case 2:
                    break;
            }
        }
    }

