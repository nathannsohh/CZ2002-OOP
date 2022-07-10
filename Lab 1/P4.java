import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Height: ");
        int height = sc.nextInt();

        String a = "AA";
        String b = "BB";
        if(height == 0) System.out.println("Error input!!");
        for(int i = 1; i <= height; i++){
            if(i%2 != 0){
                for(int j = 1; j <= i; j++){
                    if(j%2==0) System.out.print(b);
                    else System.out.print(a);
                }
                System.out.print("\n");
            }
            else{
                for(int j = 1; j <= i; j++){
                    if(j%2==0) System.out.print(a);
                    else System.out.print(b);
                }
                System.out.print("\n");
            }
        }
        sc.close();
    }
}
