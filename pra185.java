class Engine{
    void start(){
        System.out.println("Starting........");
    }
}
class Car{
    Engine e = new Engine();
    void drive(){
        e.start();
        System.out.println("Car is running.........");
    }
}
public class pra185 {
    public static void main(String[] args) {    
        Car c = new Car();
        c.drive();
    }
}
