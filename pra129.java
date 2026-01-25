abstract class Subscription{
    protected int id;
    protected String name;
    protected String startingDate;
    protected String endingDate;
    Subscription(int id,String name,String startingDate,String endingDate){
        setId(id);
        this.name = name;
        setStartingDate(startingDate);
        this.endingDate = endingDate;
    }
    void setId(int id){
        if(id<0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    void setStartingDate(String startingDate){
        int date = Integer.parseInt(startingDate);
        if(date<0){
            throw new IllegalArgumentException("date cant be negative");
        }
        this.startingDate = startingDate; 
    }
    abstract void displayInfo();
}
public class pra129 {
    public static void main(String []args){
        //main
    }
}
