import java.util.*;
public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Perform the following methods:");
        System.out.println("1: multiplication test");
        System.out.println("2: quotient using division by subtraction");
        System.out.println("3: remainder using division by subtraction");
        System.out.println("4: count the number of digits");
        System.out.println("5: position of a digit");
        System.out.println("6: extract all odd digits");
        System.out.println("7: quit");
        choice = sc.nextInt();
        switch (choice) {
        case 1: 
            mulTest();
            break;
        case 2: /* add divide() call */
            System.out.println("What is the dividend?");
            int dividend1 = sc.nextInt();
            System.out.println("What is the divisor?");
            int divisor1 = sc.nextInt();
            int quotient = divide(dividend1, divisor1);
            System.out.printf("%d/%d = %d\n", dividend1, divisor1, quotient);
            break;
        case 3: /* add modulus() call */
            System.out.println("What is the dividend?");
            int dividend2 = sc.nextInt();
            System.out.println("What is the divisor?");
            int divisor2 = sc.nextInt();
            int remainder = modulus(dividend2, divisor2);
            System.out.println(dividend2 +" % " + divisor2 + " = " + remainder);
            break;
        case 4: /* add countDigits() call */
            System.out.println("Enter a positive integer:");
            int pos = sc.nextInt();
            int output =countDigits(pos);
            if(output == -1)
                System.out.println("n : " + pos + " - Error input!!");
            else
                System.out.println("n : " + pos + " - count = " + output);
            break;
        case 5: /* add position() call */
            System.out.println("Enter a positive number:");
            int num = sc.nextInt();
            System.out.println("Enter the digit that you are looking for:");
            int digit = sc.nextInt();
            int output2 = position(num, digit);
            if(output2 == -2) System.out.println("Error input!!");
            else System.out.println("position = " + output2);
        break;
        case 6: /* add extractOddDigits() call */
            System.out.println("Enter a positive number:");
            Long num2 = sc.nextLong();
            Long output3 = extractOddDigits(num2);
            if(output3 == -2) System.out.println("Error input!!");
            else System.out.println("oddDigits = " + output3);
        break; 
        case 7: System.out.println("Program terminating...");
            }
        } while (choice < 7);
    }
    
    public static void mulTest(){
        int n1, n2, n3, ans, correct = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            n1 = (int)Math.floor(Math.random()*(9-1+1)+1);
            n2 = (int)Math.floor(Math.random()*(9-1+1)+1);
            n3 = n1*n2;
            System.out.print("How much is " + n1 + " times " + n2 + "? ");
            ans = sc.nextInt();
            if(ans == n3) correct++;
        }
        System.out.println(correct + " answers out of 5 are correct.");
    }
    public static int divide(int m, int n){
        int count = 0;
        while(m - n > 0){
            m = m-n;
            count++;
        }
        return count;
    }
    public static int modulus(int m, int n){
        while(m-n >= 0){
            m = m-n;
        }
        return m;
    }
    public static int countDigits(int n){
        if(n <= 0) return -1;

        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
    public static int position(int n, int digit){
        if(n <= 0) return -2;
        int pos = 0;
        while(n != 0){
            pos++;
            if(n%10 == digit) return pos;
            else n /= 10;
        }
        return -1;
    }
    public static long extractOddDigits(long n){
        if(n <= 0) return -2;
        int digit = 1;
        int output = 0;
        while(n != 0){
            if((n%10)%2 != 0){
                output += (n%10) * digit;
                digit *= 10;
            }
            n /= 10;
        }
        if(output == 0) return -1;
        else return output;
    }

}
