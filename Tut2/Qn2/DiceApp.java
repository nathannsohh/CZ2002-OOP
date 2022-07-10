import java.util.Scanner;
public class DiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dice d = new Dice();
        System.out.println("Press <key> to roll the first dice");
        sc.nextInt();
        d.setDiceValue();
        int x1 = d.getDiceValue();
        d.printDiceValue();
        System.out.println("Press <key> to roll the second dice");
        sc.nextInt();
        d.setDiceValue();
        int x2 = d.getDiceValue();
        d.printDiceValue();
        System.out.println("Your total number is: " + (x1+x2));
        sc.close();
    }
}
