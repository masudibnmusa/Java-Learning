interface GPS{
    void getLocation();
}
abstract class Transport{
    private int id;
    private String name;
    Transport(int id,String name){
        setId(id);
        setName(name);
    }
    public void setId(int id){
        if (id < 0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    void start(){
        System.out.println("Starting........");
    }
    void stop(){
        System.out.println("stoped......");
    }
    abstract void calculateFare(int distance);
}
class Bus extends Transport implements GPS{
    Bus(int id, String name){
        super(id, name);
    }
    @Override
    void start(){
        super.start();
    }
    @Override
    void stop(){
        super.stop();
    }
    @Override
    void calculateFare(int distance){
        int fare = distance*6;
        System.out.println("Total Fare is : "+fare);
    }
}
class Train extends Transport implements GPS{
    Train(int id,String name){
        super(id, name);
    }
    @Override
    void start(){
        super.start();
    }
    @Override
    void stop(){
        super.stop();
    }
    @Override
    void calculateFare(int distance){
        int fare = distance*5;
        System.out.println("Total Fare is : "+fare);
    }
}
public class pra178 {
    public static void main(String[] args) {
        
    }
}
