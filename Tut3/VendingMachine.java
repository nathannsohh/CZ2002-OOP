
import java.util.Scanner;

public class VendingMachine {

    Scanner sc = new Scanner(System.in);
    public VendingMachine(){}

    public double selectDrink(){
        double drinkCost = 0;
        System.out.println("Please enter selection:");
        int x = sc.nextInt();
        switch(x){
            case 1:
                drinkCost = 3.00;
                break;
            case 2:
                drinkCost = 1.00;
                break;
            case 3:
                drinkCost = 5.00;
                break;
            default: 
                drinkCost = 0;
            }
        return drinkCost;
    }
    public double insertCoins(double drinkCost){
        double insertedMoney = 0;
        while (insertedMoney < drinkCost){
            char x = sc.next().charAt(0);
            switch(x){
                case 'Q':
                case 'q':
                    insertedMoney += 0.10;
                    break;
                case 'T':
                case 't':
                    insertedMoney += 0.20;
                    break;
                case 'F':
                case 'f':
                    insertedMoney += 0.50;
                    break;
                case 'N':
                case 'n':
                    insertedMoney += 1.00;
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
            System.out.printf("Coins Inserted: %.2f\n", insertedMoney);
        }
        return insertedMoney;
    }
    public void checkChange(double amount, double drinkCost){
        double change = amount - drinkCost;
        System.out.printf("Change: $ %.2f\n", change);
    }
    public void printReceipt(){
        System.out.println("Please collect your drink");
        System.out.println("Thank you !!");
    }
}
