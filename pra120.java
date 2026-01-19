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
        System.out.println("Standard Room--");
        super.displayRoom();
    }
}
class DeluxRoom extends Room{
    DeluxRoom(int roomNo,String roomType){
        super(roomNo, roomType);
    }
    @Override
    void displayRoom(){
        System.out.println("Delux Room--");
        super.displayRoom();
    }
}
class Suit extends Room{
    Suit(int roomId,String roomType){
        super(roomId, roomType);
    }
    @Override
    void displayRoom(){
        System.out.println("Suit Room--");
        super.displayRoom();
    }
}
public class pra120 {
    public static void main (String[] args){
        //main...
        Room r1 = new DeluxRoom(101, "Delux");
        Room r2 = new Suit(201, "Suit");
        Room r3 = new StandardRoom(301, "Standard");
        r1.displayRoom();
        System.out.println();
        r2.displayRoom();
        System.out.println();
        r3.displayRoom();
    } 
}
