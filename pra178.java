import java.util.Scanner;

interface GPS{
    void getLocation(Scanner sc);
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
    @Override
    public void getLocation(Scanner sc) {
        System.out.print("Enter the Location : ");
        String location = sc.nextLine();
        System.out.println("Location : "+location);
        
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
    @Override
    public void getLocation(Scanner sc) {
        System.out.print("Enter the Location : ");
        String location = sc.nextLine();
        System.out.println("Location : "+location);
        
    }
}
public class pra178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transport t1 = new Bus(0, null);
        Train t2 = new Train(0, null);
        t1.start();
        t1.stop();
        ((GPS)t1).getLocation(sc);
        t1.calculateFare(12);
        System.out.println();
        t2.start();
        t2.stop();
        t2.getLocation(sc);
        t2.calculateFare(12);
    }
}
