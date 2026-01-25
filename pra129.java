abstract class Subscription{
    protected int id;
    protected String name;
    protected String startingDate;
    protected String endingDate;
    Subscription(int id,String name,String startingDate,String endingDate){
        setId(id);
        this.name = name;
        setStartingDate(startingDate);
        setEndingDate(endingDate);
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
    void setEndingDate(String endingDate){
        int date = Integer.parseInt(endingDate);
        if(date<0){
            throw new IllegalArgumentException("Date cant be negative");
        }
        this.endingDate = endingDate;
    }
    abstract void displayInfo();
}
class MonthlySubcription extends Subscription{
    private String plan = "Monthly subcription";
    MonthlySubcription(int id,String name,String startingDate,String endingDate){
        super(id, name, startingDate, endingDate);
    }
    @Override
    void displayInfo(){
        System.out.println("Subscriber id     : "+id);
        System.out.println("Subscriber name   : "+name);
        System.out.println("Subscription type : "+plan);
        System.out.println("Starting Date     : "+startingDate);
        System.out.println("Ending Date       : "+endingDate);
    }
}
public class pra129 {
    public static void main(String []args){
        //main
    }
}
