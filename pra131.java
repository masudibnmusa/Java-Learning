import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
abstract class Flight{
    protected int flightNo;
    protected LocalDate departure;
    protected LocalDate arrival;
    Flight(int flightNo,String departure,String arrival){
        setFlightNo(flightNo);
        setDepature(departure);
        setArrival(arrival);
    }
    void setFlightNo(int flightNo){
        if(flightNo<0){
            throw new IllegalArgumentException("Flight cant be negative");
        }
        this.flightNo = flightNo;
    }
    void setDepature(String departure){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.departure = LocalDate.parse(departure,formatter);
    }
    void setArrival(String arrival){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.arrival = LocalDate.parse(arrival,formatter);
    }
    void displayFlightinfo(){
        System.out.println("Flight : "+flightNo);
        System.out.println("Departure time : "+departure);
        System.out.println("Arrival time : "+arrival);
    }
}
class DomesticFlight extends Flight{
    DomesticFlight(int flightNo,String departure,String arrival){
        super(flightNo, departure, arrival);
    }
    void displayFlightinfo(){
        super.displayFlightinfo();
    }
}
class InternationalFlight extends Flight{
    InternationalFlight(int flightNo,String departure,String arrival){
        super(flightNo, departure, arrival);
    }
    void displayFlightinfo(){
        super.displayFlightinfo();
    }
}
class Passenger{
    private String passengerName;
    private String email;
    private String address;
    Passenger(String passengerName,String email,String address){
        this.passengerName = passengerName;
        this.email = email;
        this.address = address;
    }
    String getName(){
        return passengerName;
    }
    String getEmail(){
        return email;
    }
    String getAdress(){
        return address;
    }
    void displayPassengerinfo(){
        System.out.println("Passenger name : "+getName());
        System.out.println("Email          : "+getEmail());
        System.out.println("Destination    : "+getAdress());
    }
}
class CheckInCounter{

}
public class pra131 {
    public static void main(String[] args){
        //main..
        Flight f1 = new DomesticFlight(696, "22-02-2026", "23-02-2026");
        Flight f2 = new InternationalFlight(456,"23-02-2026","24-02-2026");
        f1.displayFlightinfo();
        f2.displayFlightinfo();
        Passenger p1 = new Passenger("Masud","masudibnmusa10@gmail.com","Dhaka");
        p1.displayPassengerinfo();
    }
}
