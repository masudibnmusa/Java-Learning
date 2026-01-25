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
class Rental{
    void displayRentalinfo(){
        Vehicle [] vehicles ={
            new Bike("Tata", 170, 170000),
            new Car("TaTa", 240, 1200000)
        };
        for(Vehicle v1 :vehicles){
            v1.display();
            System.out.println();
        }
    }
}
class Customer{
    int id;
    String name;
    Rental rental;
    Customer(int id,String name,Rental rental){
        this.id = id;
        this.name = name;
        this.rental = rental;
    }
    void displayCutomerInfo(){
        System.out.println("Customer Id : "+id);
        System.out.println("Customer Name : "+name);
        rental.displayRentalinfo();
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
