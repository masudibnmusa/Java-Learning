class Vehicle{
    private String brand;
    private double speed;
    String type;
    Vehicle(String brand,double speed,String type){
        this.brand = brand;
        this.speed = speed;
        this.type = type;
    }
    //getter
    public String getBrand(){
        return brand;
    }
    public double getSpeed(){
        return speed;
    }
    public void getType(){
        System.out.println("The type is : "+type);
    }
    //setter
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setSpeed(double speed){
        if (speed <=0){
            System.out.println("Invalid speed");
        }else{
            this.speed = speed;
        }
    }
    
}
class Car extends Vehicle{
    Car(String brand,double speed, String type){
        super(brand, speed,type); 
    }
    public void getType(){
        System.out.println("The Car type id : "+type);
    }
}
class Bike extends Vehicle{
    Bike(String brand,double speed,String type){
        super(brand, speed, type);
    }
    public void getType(){
        System.out.println("The bike type is : "+type);
    }
}
public class pra104 {
    public static void main(String[] args) {
        //main....
        Vehicle v1 = new Car("Toyota", 180, "Disel");
        Vehicle v2 = new Bike("TVS", 210, "Petrol");
        v1.getType();  
        v2.getType();  
    }
}
