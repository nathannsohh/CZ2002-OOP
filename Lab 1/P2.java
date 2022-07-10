import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary: ");
        int salary = sc.nextInt();
        System.out.print("Merit: ");
        int merit = sc.nextInt();

        if(salary >= 500 && salary <= 649){
            if(salary < 600) 
                System.out.println("Grade C");
            else{
                if(merit >= 10) System.out.println("Grade B");
                else System.out.println("Grade C");
            }
        }
        else if(salary >= 650 && salary <= 799){
            if(salary < 700)
                System.out.println("Grade B");
            else{
                if(merit >= 20) System.out.print("Grade A");
                else System.out.print("Grade B");
            }
        }
        else if(salary >= 800 && salary <= 899) 
            System.out.println("Grade A");
        else
            System.out.println("Invalid Salary.");
        sc.close();
    }
}
