abstract class user{
    int id;
    String name ;
    user(int id,String name){
        setId(id);
        setName(name);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    abstract void display();
}
class Student extends user{
    Student(int id,String name){
        super(id,name);
    }
    @Override 
    void display(){
        System.out.println(getId());
        System.out.println(getName());
    }
}
class Teacher extends user{
    Teacher(int id,String name){
        super(id,name);
    }
    @Override 
    void display(){
        System.out.println("Techer Info :"+id+" "+name);
    }
}
public class Exam1{
    public static void main(String[] args) {
        System.out.println("welcome to java !");
        user u1 = new Student(122, "siam");
        user u2 = new Teacher(121, "Rakib");
        u1.display();
        u2.display();
        
    }
}