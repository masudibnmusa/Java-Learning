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
    void displayInfo(){
        System.out.println("The Concert name is        : "+name);
        System.out.println("The Date of the concert is : "+date);
    }
}
public class pra134 {
    public static void main(String[] args){
        //main............
    }
}
