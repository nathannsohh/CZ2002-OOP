import java.util.*;

public class Factorial {
    public static int getFact(int n) {
        int c, fact = 1;
        if (n < 0)
            System.out.println("Number should be non-negative.");
        else
            for (c = 1; c <= n; c++)
                fact = fact * c;
        return fact;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println("Enter an integer to calculate its factorial");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Factorial of " + n + " is =" + getFact(n));
    }
}
