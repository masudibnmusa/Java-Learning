abstract class Room{
        protected int roomNo;
        protected String roomType;
    
    Room(int roomNo,String roomType){
        this.roomNo = roomNo;
        this.roomType = roomType;
    }
    void displayRoom(){
        System.out.println("Room number : "+roomNo);
        System.out.println("Room Type : "+roomType);
    }
}
class StandardRoom extends Room{
    StandardRoom(int roomNo,String roomType){
        super(roomNo,roomType);
    }
    @Override
    void displayRoom(){
        System.out.println("--Congratulation--");
        super.displayRoom();
    }
}
class DeluxRoom extends Room{
    DeluxRoom(int roomNo,String roomType){
        super(roomNo, roomType);
    }
    @Override
    void displayRoom(){
        System.out.println("--Congratulation--");
        super.displayRoom();
    }
}
class Suit extends Room{
    Suit(int roomId,String roomType){
        super(roomId, roomType);
    }
    @Override
    void displayRoom(){
        System.out.println("--Congratulation--");
        super.displayRoom();
    }
}
class Reservation {
    private int days;
    private String roomType;
    Reservation(String roomType,int days){
        this.roomType = roomType;
        if(days<=0){
            throw new IllegalArgumentException("Minimum booking days id 1");
        }
        this.days = days;
    }
    private double calculateRent(){
        switch (roomType.toLowerCase()){
            case "standard":
                return days*2000;
            case "delux" :
                return days*2500;
            case "suit" :
                return days *3000;
            default:
                return 2000;
        }
    }
    private void rentdetails(){
        Room r1 = new DeluxRoom(101, "Standard");
        Room r2 = new Suit(201, "Delux");
        Room r3 = new StandardRoom(301, "Suit");


        switch (roomType.toLowerCase()){
            case "standard":
                r1.displayRoom();
                
                break;
            case "delux" :
                r2.displayRoom();
                break;
            case "suit" :
                r3.displayRoom();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    void showReservation(){
        System.out.println("--Reservation details--");
        rentdetails();
        System.out.println("Duration : "+days+" days");
        System.out.println("Total Rent : "+ calculateRent());
    }

    
}
public class pra120 {
    public static void main (String[] args){
        //main...
        System.out.println();
        Reservation reser1= new Reservation("suit", 20);
        Reservation reser2= new Reservation("standard", 20);
        Reservation reser3= new Reservation("delux", 20);
        reser1.showReservation();
        System.out.println();
        reser2.showReservation();
        System.out.println();
        reser3.showReservation();
    } 
}
