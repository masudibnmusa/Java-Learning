import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
abstract class Flight{
    protected int flightNo;
    protected LocalDate departure;
    protected double departureTime;
    protected LocalDate arrival;
    protected double arrivalTime;
    Flight(int flightNo,String departure,double departureTime,String arrival,double arrivalTime){
        setFlightNo(flightNo);
        setDepature(departure);
        setDepatureTime(departureTime);
        setArrival(arrival);
        setArrivalTime(arrivalTime);
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
    void setDepatureTime(double departureTime){
        if(departureTime<00 || departureTime >23.99){
            throw new IllegalArgumentException("Time cant be negative");
        }
        this.departureTime = departureTime;
    }
    void setArrival(String arrival){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.arrival = LocalDate.parse(arrival,formatter);
    }
    void setArrivalTime(double arrivalTime){
        if(arrivalTime<0 || arrivalTime >23.99){
            throw new IllegalArgumentException("Time cant be negative");
        }
        this.arrivalTime = arrivalTime;
    }
    void displayFlightinfo(){
        System.out.println("Flight         : "+flightNo);
        System.out.println("Departure date : "+departure);
        System.out.println("Departure time : "+departureTime);
        System.out.println("Arrival date   : "+arrival);
        System.out.println("Arrival time   : "+arrivalTime);
    }
}
class DomesticFlight extends Flight{
    DomesticFlight(int flightNo,String departure,double departureTime,String arrival,double arrivalTime){
        super(flightNo, departure, departureTime, arrival, arrivalTime);
    }
    void displayFlightinfo(){
        super.displayFlightinfo();
    }
}
class InternationalFlight extends Flight{
    InternationalFlight(int flightNo,String departure,double departureTime,String arrival,double arrivalTime){
        super(flightNo, departure, departureTime, arrival, arrivalTime);
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
        System.out.println("Address        : "+getAdress());
    }
}
class CheckInCounter{
    int counterId;
    String terminal;
    Passenger passenger;
    Flight flight;
    CheckInCounter(int counterId,String terminal,Passenger passenger,Flight flight){
        setCounterId(counterId);
        this.terminal = terminal;
        this.passenger = passenger;
        this.flight = flight;
    }
    void setCounterId(int counterId){
        if(counterId<=0){
            throw new IllegalArgumentException("Counter Id cant be negative");
        }
        this.counterId = counterId;
    }
    void displayCounter(){
        System.out.println("Counter id     : "+counterId);
        System.out.println("Terminal       : "+terminal);
        System.out.println("Passenger name : "+passenger.getName());
        System.out.println("Flight         : "+flight.flightNo);
    }
}
public class pra131 {
    public static void main(String[] args){
        //main..
        Flight f1 = new DomesticFlight(686, "22-02-2026", 12.00, "22-02-2026", 6.15);
        Flight f2 = new InternationalFlight(686, "23-02-2026", 12.00, "23-02-2026", 6.15);
        f1.displayFlightinfo();
        System.out.println();
        f2.displayFlightinfo();

        Passenger p1 = new Passenger("Masud","masudibnmusa10@gmail.com","Dhaka");
        Passenger p2 = new Passenger("Rakib","rakib10@gmail.com","Kishoreganj");
        p1.displayPassengerinfo();
        System.out.println();
        p2.displayPassengerinfo();

        CheckInCounter c1 = new CheckInCounter(12, "Terminal 1", p1, f2);
        CheckInCounter c2 = new CheckInCounter(12, "Terminal 1", p2, f2);
        c1.displayCounter();
        System.out.println();
        c2.displayCounter();
    } 
}
