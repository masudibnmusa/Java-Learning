abstract class User{
    int id ;
    String name; 
    String address;
    User(int id ,String name,String address){
        setName(name);
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
    
    abstract void display();
}
public class pra176 {
    public static void main(String[] args) {
       System.out.println("hello"); 
    }
}
