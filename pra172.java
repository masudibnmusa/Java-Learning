class Name{
    String firstName;
    String lastName;
 
    Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    @Override
    public String toString() {
        return firstName + " " + lastName ;
    }
}
 
 
abstract class Person{
    private Name name;
    Person(String name){
        this.name = new Name(name, "");
    }
    void doSomething(){
        System.out.println("do something");
    }
 
    abstract void talk();
}
 
interface Examinee{
     void takeExam();
}
 
interface Payer{
    void payAmount(int amount);
}
 
class Student extends Person implements Examinee, Payer{
    Student(String name){
        super(name);
    }
    @Override
    public void payAmount(int amount) {
        System.out.println("student pays amount");
    }
 
    @Override
    public void takeExam() {
        System.out.println("student takes exam");
    }
 
    @Override
    void talk() {
        System.out.println("student talks");
    }
}
 
public class pra172{
    public static void main(String[] args) {
        Person person = new Person("Pronob"){
            @Override
            void talk() {
                System.out.println("anonymously defined");
            }
        };
 
        Student student = new Student("masud");
        Person p = new Student("mahian");
        Examinee e = new Student("piash");
 
    }
}