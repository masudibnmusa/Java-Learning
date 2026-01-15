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
class Rider extends User{
    private double distance;
    Rider(int id, String name ,String phone,double distance){
        super(id, name, phone);
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
class BikeRide extends Rider{
    BikeRide(int id,String name, String phone,double distance){
        super(id, name, phone, distance);
    }
    
    public void calculatefare(){
        double fare = getDistance()*20;
        System.out.println("The fare is: "+fare);
    }
}
class CarRide extends Rider{
    CarRide(int id, String name, String phone,double distance){
        super(id, name, phone, distance);
    }
    public void calculatefare(){
        double fare = getDistance()*35;
        System.out.println("The fare is: "+fare);
    }
}
public class pra109 {
    public static void main(String[] args){
        Rider r1 = new CarRide(171, "Masud", "01713504283", 0);
        r1.setDistance(12);
        r1.calculatefare();
        System.out.println("----------------");
        Rider r2 = new BikeRide(171, "Masud", "01713504283", 0);
        r2.setDistance(12);
        r2.calculatefare();
    }
}
