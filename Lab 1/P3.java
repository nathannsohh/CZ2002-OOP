import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting: ");
        int start = sc.nextInt();
        System.out.print("Ending: ");
        int end = sc.nextInt();
        System.out.print("Increment: ");
        int increment = sc.nextInt();

        if (start > end)
            System.out.println("Error input!!");
        else {
            System.out.println("US$         S$"); // for loop
            System.out.println("--------------");
            for (int i = start; i <= end; i = i + increment) {
                System.out.printf("%-2d          " + i * 1.82 + "\n", i);
            }
            System.out.println("");

            System.out.println("US$         S$"); // while loop
            System.out.println("--------------");
            int i = start;
            while (i <= end) {
                System.out.printf("%-2d          " + i * 1.82 + "\n", i);
                i = i + increment;
            }
            System.out.println("");

            System.out.println("US$         S$"); // do-while loop
            System.out.println("--------------");
            i = start;
            do {
                System.out.printf("%-2d          " + i * 1.82 + "\n", i);
                i = i + increment;
            } while (i <= end);
            sc.close();
        }
    }
}
