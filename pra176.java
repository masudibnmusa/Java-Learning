abstract class User{
    int id ;
    String name; 
    String address;
    User(int id ,String name,String address){
        setName(name);
    }
    void setName(String name){
        this.name = name;
    }
    
    abstract void display();
}
public class pra176 {
    public static void main(String[] args) {
       System.out.println("hello"); 
    }
}
