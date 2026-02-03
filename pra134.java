import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Event{
    String name;
    LocalDate date;
    Event(String name,String date){
        this.name = name;
        setDate(date);
    }
    void setDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date = LocalDate.parse(date,formatter);
    }
    abstract void displayInfo();
}
class Concert extends Event{
    Concert(String name,String Date){
        super(name, Date);
    }
    @Override
    void displayInfo(){
        System.out.println("The Concert name is        : "+name);
        System.out.println("The Date of the concert is : "+date);
    }
}
class Wedding extends Event{
    Wedding(String name,String date){
        super(name, date);
    }
    @Override
    void displayInfo(){
        System.out.println("The Wedding name is        : "+name);
        System.out.println("The Date of the Wedding is : "+date);
    }

}
class Conference extends Event{
    Conference(String name,String date){
        super(name, date);
    }
    @Override
    void displayInfo(){
        System.out.println("The Conference name is        : "+name);
        System.out.println("The Date of the conference is : "+date);
    }
}
class Booking{
    int bookingId;
    String name;
    String email;
    Event event;
    Booking(int bookingId,String name,String email,Event event){
        setId(bookingId);
        this.name = name;
        this.email = email;
        this.event = event;
    }
    void setId(int bookingId){
        if(bookingId<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.bookingId = bookingId;
    }
    void displayBookings(){
        System.out.println("Booking Id    : "+bookingId);
        System.out.println("Booker's name : "+name);
        System.out.println("Booker's Email : "+email);
        System.out.println("Event : "+event.name);
    }
}
public class pra134 {
    public static void main(String[] args){
        //main............
        Concert c1 = new Concert("Mahin", "22-02-2022");
        c1.displayInfo();
        Booking b1 = new Booking(101, "MAsud", "masudibnmusa@gmail.com", c1);
        b1.displayBookings();
    }
}
