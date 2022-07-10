public class VendingMachineApp {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00)        |");
        System.out.println("|2. Buy Coke ($1.00)        |");
        System.out.println("|3. Buy Green Tea ($5.00)   |");
        System.out.println("|============================");
        double selectedDrink = vm.selectDrink();

        System.out.println("Please insert coins:");
        System.out.println("========== Coins Input ===========");
        System.out.println("|Enter 'Q' for ten cents input   |");
        System.out.println("|Enter 'T' for twenty cents input|");
        System.out.println("|Enter 'F' for fifty cents input |");
        System.out.println("||Enter 'N' for a dollar input   |");
        System.out.println("==================================");
        double paid = vm.insertCoins(selectedDrink);
        vm.checkChange(paid, selectedDrink);
        vm.printReceipt();
    }
}
