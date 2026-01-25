import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
abstract class Vehicle{
    protected String brand;
    protected int speed;
    protected double basePrice;
    Vehicle(String brand,int speed,double basePrice){
        this.brand = brand;
        setSpeed(speed);
        setBasePrice(basePrice);
    }
    void setSpeed(int speed){
        if(speed<0){
            throw new IllegalArgumentException("Speed cant be negative");
        }
        this.speed = speed;
    }
    void setBasePrice(double basePrice){
        if(basePrice<=0){
            throw new IllegalArgumentException("Price cant be negative");
        }
        this.basePrice = basePrice;
    }
    abstract void display();
}
class Car extends Vehicle{
    private String type = "Car";
    Car(String brand,int speed,double basePrice){
        super(brand, speed, basePrice);
        this.type = type; 
    }
    @Override
    void display(){
        System.out.println("Brand name       : "+brand);
        System.out.println("Top Speed        : "+speed);
        System.out.println("Vehicle Type     : "+type);
        System.out.println("Price of the Car : "+basePrice);
    }
} 
class Bike extends Vehicle{
    private String type = "Bike";
    Bike(String brand,int speed,double basePrice){
        super(brand, speed, basePrice);
        this.type = type;
    }
    @Override
    void display(){
        System.out.println("Brand name       : "+brand);
        System.out.println("Top Speed        : "+speed);
        System.out.println("Vehicle Type     : "+type);
        System.out.println("Price of the Car : "+basePrice);
    }
}
class Customer{
    int id;
    String name;
    String email;
    Customer(int id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    void displayCutomerInfo(){
        System.out.println("Customer Id    : "+id);
        System.out.println("Customer Name  : "+name);
        System.out.println("Customer Email : "+email);
    }
}
class Rental{
    int id;
    LocalDate rentalDate;
    Vehicle vehicle;
    Rental(int id,String rentalDate,Vehicle vehicle){
        setId(id);
        this.rentalDate = rentalDate;
        this.vehicle = vehicle;
    }
    void setId(int id){
        if(id<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
}
 public class pra130 {
    public static void main(String[] args){
        //main........
        Rental r1 = new Rental();
        r1.displayRentalinfo();
        Customer c1 = new Customer(171, "Masud", r1);
        c1.displayCutomerInfo();
    }
}
