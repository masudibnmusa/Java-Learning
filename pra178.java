interface GPS{
    void getLocation();
}
abstract class Transport{
    private int id;
    private String name;
    Transport(int id,String name){
        setId(id);
    }
    public void setId(int id){
        if (id < 0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    public void setName(String name)
}
public class pra178 {
    
}
