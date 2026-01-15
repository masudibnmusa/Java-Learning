class User{
    int id;
    String name ;
    String phone;
    User(int id,String name,String phone){
        this.id = id ;
        this.name = name ;
        this.phone = phone ;
    }
    public void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(phone);
    }
}
class Ride {
    private double distance;
    Ride(double distance){
        this.distance = distance;
    }
    public double getDistance(){
        return distance;
    }
    public void setDistance(double distance){
        if (distance>0){
            this.distance = distance;
        }else{
            System.out.println("Invalid distance");
        }
    }
    public void calculatefare(){
        System.out.println("The fare is: ");
    }
}
class Rider extends User{
    Rider(int id, String name ,String phone){
        super(id, name, phone);
    }
    
        
}
class BikeRide extends Ride{
    BikeRide(double distance){
        super(distance);
    }
    
    public void calculatefare(){
        double fare = getDistance()*20;
        System.out.println("The fare is: "+fare);
    }
}
class CarRide extends Ride{
    CarRide(double distance){
        super(distance);
    }
    public void calculatefare(){
        double fare = getDistance()*35;
        System.out.println("The fare is: "+fare);
    }
}
public class pra109 {
    public static void main(String[] args){
        User u1 = new Rider(171, "Masud", "01713504283");
        Ride r1 = new CarRide( 0);
        u1.displayDetails();
        r1.setDistance(12);
        r1.calculatefare();
        System.out.println("----------------");
        User u2 = new Rider(171, "Masud", "01713504283");
        Ride r2 = new BikeRide( 0);
        u2.displayDetails();
        r2.setDistance(12);
        r2.calculatefare();
    }
}
