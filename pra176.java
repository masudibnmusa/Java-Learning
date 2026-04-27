abstract class User{
    int id ;
    String name; 
    String address;
    User(int id ,String name,String address){
        setId(id);
        setName(name);
        setAddress(address);
    }
    public void setId(int id) {
        if (id < 0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    void display(){
        System.out.println("Id      : "+getId());
        System.out.println("Name    : "+getName());
        System.out.println("Address : "+getAddress());
    }
}
class Student extends User{
    Student(int id, String name , String address){
        super(id, name, address);
    }
    @Override
    void display(){
        super.display();
    }
}
public class pra176 {
    public static void main(String[] args) {
       User u1 = new User(2,"Masud","Katiadi");
       u1.display();
    }
}
