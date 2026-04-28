class Engine{
    void start(){
        System.out.println("Starting............");
    }
}
class Car{
    Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    void drive(){
        engine.start();
        System.out.println("Car is running..........");
    }
}
public class pra184 {
    public static void main(String[] args) {
        //main.................
    }
}
