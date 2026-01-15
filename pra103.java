class Vehicle{
    private String brand;
    private double speed;
    Vehicle(String brand,double speed){
        this.brand = brand ;
        this.speed = speed;
    }
    //getter
    public String getBrand(){
        return brand;
    }
    public double getSpeed(){
        return speed;
    }
}
class Car extends Vehicle{
    String fuelType;
    Car(String brand,double speed,String fuelType){
        super(brand, speed);
        this.fuelType = fuelType;
    }
    public void display(){
        System.out.println("---------Car details---------");
        System.out.println("Brand : "+getBrand());
        System.out.println("Speed: "+getSpeed());
        System.out.println("Speed: "+fuelType);
    }
}
public class pra103 {
    public static void main(String[] args){
        //main/....
        Car c1 =  new Car("Toyyota", 120, "petrol");
        c1.display();
    }
}
