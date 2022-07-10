import java.util.*;
public class PlaneApp {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");
        do{
            System.out.print("  Enter the number of your choice: ");
            x = sc.nextInt();
            switch(x){
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2: 
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat...");
                    System.out.print("  Please enter SeatID: ");
                    int seatID = sc.nextInt();
                    System.out.print("  Please enter Customer ID: ");
                    int custID = sc.nextInt();
                    plane.assignSeat(seatID, custID);
                    break;
                case 6:
                    System.out.print("  Enter SeatID to unassign customer from: ");
                    int seatID1 = sc.nextInt();
                    plane.unAssignSeat(seatID1);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    System.out.println("");
                    break;
            }
        }while(x != 7);
        sc.close();
    }

}
