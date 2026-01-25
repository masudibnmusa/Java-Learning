abstract class Vehicle{
    protected String brand;
    protected int speed;
    protected double basePrice;
    Vehicle(String brand,int speed,double basePrice){
        setSpeed(speed);
        this.speed = speed;
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
 public class pra130 {
    public static void main(String[] args){
        //main........
    }
}
