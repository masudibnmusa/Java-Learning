abstract class User{
    protected String name ;
    protected String role;
    User(String name , String role){
        this.name = name ;
        this.role = role;
    }
    void display(){
        System.out.println(name);
        System.out.println(role);
    }
}
class Student extends User{
    int roll ;
    String department ;
    Student(int roll,String name , String role,String department){
        super(name, role);
        this.roll = roll ;
        this.department = department;
    }
    @Override
    void display(){
        System.out.println(role);
        System.out.println(roll);
        System.out.println(name);
        System.out.println(department);
    }
}
class Admin extends User{
    Admin(String name, String role){
        super(name, role);
    }
    @Override
    void display() {
        super.display();
    }
}
public class pra114 {
    public static void main(String[] args) {
        //main
    }
}
