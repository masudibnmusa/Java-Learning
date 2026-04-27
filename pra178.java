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
    abstract void getLocation(int distance);
}

public class pra178 {
    public static void main(String[] args) {
        
    }
}
