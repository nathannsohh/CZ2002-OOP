import java.util.Scanner;
public class Shape3DApp {
    public static void main(String[] args) {
        Shape shapeArray[] = new Shape[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Shapes:");
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            double radius = 0;
            double height = 0;
            double base = 0;
            System.out.printf("Shape %d: Choose a shape (Cube, Cuboid, Sphere, 4-Sided Pyramid):\n", i+1);
            System.out.println("1. Cube");
            System.out.println("2. Cuboid");
            System.out.println("3. Sphere");
            System.out.println("4. 4-Sided Pyramid");
            System.out.println("5. Cone");
            System.out.println("6. Cylinder");
            int shape = sc.nextInt();
            switch(shape){
                case 1:
                    System.out.println("Enter the length of the Cube:");
                    base = sc.nextDouble();
                    shapeArray[i] = new Square(radius, height, base);
                    break;
                case 2:
                    System.out.println("Enter the length of the Cuboid:");
                    height = sc.nextDouble();
                    System.out.println("Enter the breadth of the Cuboid:");
                    base = sc.nextDouble();
                    shapeArray[i] = new Cuboid(radius, height, base);
                    break;
                case 3:
                    System.out.println("Enter the radius of the Sphere:");
                    radius = sc.nextDouble();
                    shapeArray[i] = new Sphere(radius, height, base);
                    break;
                case 4:
                    System.out.println("Enter the base of the 4-Sided Pyramid:");
                    base = sc.nextDouble();
                    System.out.println("Enter the height of the 4-Sided Pyramid:");
                    height = sc.nextDouble();
                    shapeArray[i] = new SquarePyramid(radius, height, base);
                    break;
                case 5:
                    System.out.println("Enter the radius of the Cone:");
                    radius = sc.nextDouble();
                    System.out.println("Enter the height of the Cone:");
                    height = sc.nextDouble();
                    shapeArray[i] = new Cone(radius, height, base);
                    break;
                case 6:
                    System.out.println("Enter the radius of the Cylinder");
                    radius = sc.nextDouble();
                    System.out.println("Enter the length of the Cylinder");
                    height = sc.nextDouble();
                    shapeArray[i] = new Cylinder1(radius, height, base);
                    break;
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
                    System.out.printf("The total surface area of all the shapes is %.2f", area);
                    break;
                case 2:
                    break;
            }
        }
    }