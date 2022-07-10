public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane(){
        seat = new PlaneSeat[12];
        numEmptySeat = 12;
        for(int i = 0; i < 12; i++){
            seat[i] = new PlaneSeat(i+1);
        }
    }
    private PlaneSeat[] sortSeats(){
        PlaneSeat[] seat1 = new PlaneSeat[12];
        int i = 0;
        for(i = 0; i < 12; i++){
            seat1[i] = seat[i];
        }

        for(i = 0; i < 12 - 1; i++){
            for (int j = 0; j < 12 - i -1; j++){
                if(seat1[j].getCustomerID() > seat1[j+1].getCustomerID()){
                    PlaneSeat temp = seat1[j];
                    seat1[j] = seat1[j+1];
                    seat1[j+1] = temp;
                }
            }
        }
        return seat1;
    }

    public void showNumEmptySeats(){
        System.out.println("There are " + numEmptySeat + " empty seats");
        System.out.println("");
    }

    public void showEmptySeats(){
        System.out.println("The following seats are empty:");
        for(int i = 0; i < 12; i++){
            if(seat[i].isOccupied() == false) System.out.println("SeatID " + seat[i].getSeatID());
        }
        System.out.println("");
    }
    public void showAssignedSeats(boolean bySeatId){
        if(bySeatId == true){
            for(int i = 0; i < 12; i++){
                if(seat[i].isOccupied() == true) 
                    System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID() + ".");
            }
        }
        else{
            PlaneSeat[] seat1 = sortSeats();
            for(int i = 0; i < 12; i++){
                if(seat1[i].isOccupied() == true)
                    System.out.println("SeatID " + seat1[i].getSeatID() + " assigned to CustomerID " + seat1[i].getCustomerID() + ".");
            }
        }
        System.out.println("");
    }
    public void assignSeat(int seatId, int cust_id){
        if(seat[seatId - 1].isOccupied() == true) 
            System.out.println("Seat already assigned to a customer.");
        else{
            seat[seatId - 1].assign(cust_id);
            System.out.println("Seat Assigned!");
            numEmptySeat--;
        }
        System.out.println("");
    }
    public void unAssignSeat(int seatId){
        if(seat[seatId - 1].isOccupied() == false)
            System.out.println("Seat is already empty!");
        else{
            seat[seatId - 1].unAssign();
            System.out.println("Seat Unassigned!");
            numEmptySeat++;
        }
        System.out.println("");
    }
}
