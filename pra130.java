import java.text.DateFormat;
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
    Customer customer;
    Rental(int id,String rentalDate,Vehicle vehicle,Customer customer){
        setId(id);
        setRentaldate(rentalDate);
        this.vehicle = vehicle;
        this.customer = customer;
    }
    void setId(int id){
        if(id<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    void setRentaldate(String rentalDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.rentalDate = LocalDate.parse(rentalDate,formatter);
    }
    void displayRentlInfo(){
        System.out.println("Rental id    : "+id);
        System.out.println("Rental Date  : "+rentalDate);
        System.out.println("Cusomer name : "+customer.name);
        System.out.println("Vehicle name : "+vehicle.brand);
    }
}
 public class pra130 {
    public static void main(String[] args){
        //main........
        Vehicle v1 = new Bike("Hero", 170, 120000);
        Vehicle v2 = new Car("Tata", 240, 1200000);
        Customer c1 = new Customer(101, "Masud", "masud@");
        Customer c2 = new Customer(102, "Rakib", "rakib@");

        Rental r1 = new Rental(01, "25-01-2026", v2, c2);
        r1.displayRentlInfo();
        System.out.println();
        c2.displayCutomerInfo();
        System.out.println();
        v2.display();
        System.out.println();
        System.out.println();
        Rental r2 = new Rental(02, "25-01-2026", v1, c1);
        r2.displayRentlInfo();
        System.out.println();
        c1.displayCutomerInfo();
        System.out.println();
        v1.display();
    }
}
