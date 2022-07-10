/**
 * P1
 */
import java.util.Scanner;
public class P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char data1 = sc.next().charAt(0);

        switch(data1){
            case 'A':
            case'a':
                System.out.println("Action movie fan");
                break;
            case 'C':
            case'c':
                System.out.println("Comedy movie fan");
                break;
            case 'D':
            case 'd':
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}