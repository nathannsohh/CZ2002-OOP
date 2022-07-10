public class testClass {
    private double price;
    private String name;
    static int numberOfProduct = 0;

    public testClass(double price, String name) {
        this.price = price;
        this.name = name;
        this.numberOfProduct++;
    }

    public static void greetings() {
        System.out.println("Hello, welcome to our product line.");
    }

    public void update(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void print() {
        System.out.println(this.name + ": costs S$" + this.price);
    }

    public void printNumberOfProduct() {
        System.out.println("number = " + this.numberOfProduct);
    }
}
