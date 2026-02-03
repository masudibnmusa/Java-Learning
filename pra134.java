import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Event{
    String name;
    LocalDate date;
    Event(String name,String date){
        this.name = name;
        setDate(date);
    }
    void setDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date = LocalDate.parse(date,formatter);
    }
    abstract void displayInfo();
}
class Concert extends Event{
    Concert(String name,String Date){
        super(name, Date);
    }
    @Override
    void displayInfo(){
        System.out.println("The Concert name is        : "+name);
        System.out.println("The Date of the concert is : "+date);
    }
}
class Wedding extends Event{
    Wedding(String name,String date){
        super(name, date);
    }
    @Override
    void displayInfo(){
        System.out.println("The Wedding name is        : "+name);
        System.out.println("The Date of the Wedding is : "+date);
    }

}
class Conference extends Event{
    Conference(String name,String date){
        super(name, date);
    }
    @Override
    void displayInfo(){
        System.out.println("The Conference name is        : "+name);
        System.out.println("The Date of the conference is : "+date);
    }
}
public class pra134 {
    public static void main(String[] args){
        //main............
        Concert c1 = new Concert("Mahin", "22-02-2022");
        c1.displayInfo();
    }
}
