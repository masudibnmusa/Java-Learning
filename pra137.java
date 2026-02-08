abstract class Taxi{
    protected int taxiId;
    protected String ownerName;
    protected String phone;
    Taxi(int taxiId,String ownerName,String phone){
        setTaxiId(taxiId);
        setOwnerName(ownerName);
        setPhone(phone);
    }
    private void setTaxiId(int taxiId) {
        if(taxiId<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.taxiId = taxiId;
    }
    private void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    private  void setPhone(String phone) {
        this.phone = phone;
    }
    abstract void showTexi();
}
class NormalTaxi extends Taxi{
    NormalTaxi(int taxiId,String ownerName,String phone){
        super(taxiId,ownerName,phone);
    }
    @Override
    void showTexi(){
        System.out.println("Normal Taxi Id    : "+taxiId);
        System.out.println("Normal Taxi owner : "+ownerName);
        System.out.println("Normal Taxi phone : "+phone);
    }
}
class PremiumTaxi extends Taxi{
    PremiumTaxi(int taxiId,String ownerName,String phone){
        super(taxiId, ownerName, phone);
    }
    @Override
    void showTexi(){
        System.out.println("Premium Taxi Id    : "+taxiId);
        System.out.println("Premium Taxi owner : "+ownerName);
        System.out.println("Premium Taxi phone : "+phone);
    }
}
class Ride{
    private int rideNum;
    private int distance;
    private int fare;
    private Taxi taxi;
    Ride(int rideNum,int distance,int fare,Taxi taxi){
        setRideNum(rideNum);
        setDistance(distance);
        setFare(fare);
        setTaxi(taxi);
    }
    private void setRideNum(int rideNum) {
        if(rideNum<=0){
            throw new IllegalArgumentException("ride num cant be negative");
        }
        this.rideNum = rideNum;
    }
    private void setDistance(int distance) {
        if(distance<=0){
            throw new IllegalArgumentException("distance cant be negative");
        }
        this.distance = distance;
    }
    private void setFare(int fare) {
        if(fare<=0){
            throw new IllegalArgumentException("fare cant be negative");
        }
        this.fare = fare;
    }
    private void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }
    public int getDistance() {
        return distance;
    }
    public int getFare() {
        return fare;
    }
    public int getRideNum() {
        return rideNum;
    }
    public Taxi getTaxi() {
        return taxi;
    }
    void showRide(){
        System.out.println("Ride Number : "+getRideNum());
        System.out.println("Ride Distance : "+getDistance());
        System.out.println("Ride Number : "+getFare());
        System.out.println("Ride Number : "+getTaxi().taxiId);
    }
}
public class pra137 {
    public static void main(String[] args){
        //maingti 
        Taxi t1 = new NormalTaxi(101, "Masud", "01964332844");
        Taxi t2 = new PremiumTaxi(202, "Mahin", "01518361192");
        Ride r1 = new Ride(301, 12, 200, t2);
        
        t1.showTexi();
        System.out.println();
        t2.showTexi();
        System.out.println();
        r1.showRide();



    }
}
