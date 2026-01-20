abstract class  Ticket{
    protected int serialNo;
    protected String type;
    protected int numOfSeat;
    protected double distance ;
    Ticket(int serialNo,String type,int numOfSeat,double distance){
        this.serialNo = serialNo;
        this.type = type ;
        this.numOfSeat =  numOfSeat;
        this.distance = distance;
    }
    double calculateTicketprice(){
        return distance*12;
    }
    void showTicket(){
        System.out.println("Serial Nnmher     : "+serialNo);
        System.out.println("Ticket Type       : "+type);
        System.out.println("Total Booked Seat : "+numOfSeat);
        System.out.println("Journey Distance  : "+distance);
        System.out.println("Total cost Ticket : "+calculateTicketprice());
    }
}
class BusTicket extends Ticket{
    BusTicket(int serialNo, String type,int numOfSeat,double distance ){
        super(serialNo, type, numOfSeat, distance);
    }
    @Override
    double calculateTicketprice(){
        return distance * 15;
    }
    @Override
    void showTicket(){
        super.showTicket();
    }
}
class TrainTicket extends Ticket{
    TrainTicket(int serialNo,String type,int numOfSeat,double distance){
        super(serialNo, type, numOfSeat, distance);
    }
    @Override
    double calculateTicketprice(){
        return distance * 14;
    }
    @Override
    void showTicket(){
        super.showTicket();
    }
}
class FlightTicket extends Ticket{
    FlightTicket(int serialNo,String type,int numOfSeat,double distance){
        super(serialNo, type, numOfSeat, distance);
    }
    @Override
    double calculateTicketprice(){
        return distance *200;
    }
    @Override
    void showTicket(){
        super.showTicket();
    }
}
public class pra124 {
    public static void main(String[] args){
        //mian
        Ticket t1 = new BusTicket(01, "Bus", 2, 235);
        Ticket t2 = new TrainTicket(02, "Train", 2, 235);
        Ticket t3 = new FlightTicket(03, "Flight", 2, 235);

        t1.showTicket();
        System.out.println();
        t2.showTicket();
        System.out.println();
        t3.showTicket();
    }
}
