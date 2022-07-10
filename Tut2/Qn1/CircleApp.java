import java.util.Scanner;
public class CircleApp {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        int x; 
        Circle cir = new Circle(0);

        System.out.println("==== Circle Computation =====");
        System.out.println("|1. Create a new circle     |");
        System.out.println("|2. Print Area              |");
        System.out.println("|3. Print circumference     |");
        System.out.println("|4. Quit                    |");
        System.out.println("=============================");
        
        do{
            System.out.println("Choose option (1-3):");
            x = sc.nextInt();
            switch(x){
                case 1: 
                    System.out.println("Enter the radius to compute the area and circumference");
                    int rad = sc.nextInt();
                    cir.setRadius(rad);
                    System.out.println("A new circle is created");
                    break;
                case 2:
                    System.out.println("Area of Circle");
                    System.out.println("Radius: " + cir.getRadius());
                    System.out.println("Area: " + cir.area());
                    break;
                case 3:
                    System.out.println("Circumference of circle");
                    System.out.println("Radius: " + cir.getRadius());
                    System.out.println("Circumference: " + cir.circumference());
                    break;
                case 4:
                    System.out.println("Thank you!!");
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        }while(x != 4);

        sc.close();
    }
}
