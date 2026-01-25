import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
abstract class Subscription{
    protected int id;
    protected String name;
    protected LocalDate startingDate;
    protected LocalDate endingDate;
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
    void setStartingDate(String startingDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.startingDate = LocalDate.parse(startingDate, formatter);
    }
    void setEndingDate(String endingDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.endingDate = LocalDate.parse(endingDate,formatter);
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
class YearlySubscription extends Subscription{
    private String plan = "Yearly Subscription";
    YearlySubscription(int id , String name,String startingDate,String endingDate){
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
        Subscription s1 = new MonthlySubcription(101, "Masud", "22-02-2026", "22-02-2026");
        Subscription s2 = new YearlySubscription(102,"Rakib", "22-02-2026", "22-02-2027");

        s1.displayInfo();
        s2.displayInfo();
        Subscription [] subscriptions ={
            new MonthlySubcription(103, "Siam", "12-02-2004", "12-02-2004"),
            new YearlySubscription(104, "Siam", "12-12-2003", "12-03-2005")
        };
        for (Subscription s3 : subscriptions){
            s3.displayInfo();
        }
    }
}
