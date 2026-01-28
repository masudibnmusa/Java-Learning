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
    private String destinaton;
    Passenger(String passengerName,String email,String destination){
        this.passengerName = passengerName;
        this.email = email;
        this.destinaton = destination;
    }
    void displayPassengerinfo(){
        System.out.println("Passenger name : "+passengerName);
        System.out.println("Email : "+email);
        System.out.println("Destination : "+destinaton);
    }
}
public class pra131 {
    public static void main(String[] args){
        //main..
    }
}
