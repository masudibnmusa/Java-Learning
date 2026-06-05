import java.util.Scanner;

class User{
    private String name ;
    private int age ;
    User(String name,int age){
        this.name = name ;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    void showUser(){
        System.out.println(getName());
        System.out.println(getAge());
    }
}
class Teacher extends User{
    Teacher(String name ,int age){
        super(name, age);
    }
    @Override
    void showUser(){
        super.showUser();
    }
}
public class pra193 {
    public static void main(String[] args) {

        User u1 = new User("Ratul", 12);
        Teacher t1 = new Teacher("Mahim", 22);
        u1.showUser();
        System.out.println();
        t1.showUser();
        System.out.println(u1.getName());
    }
}
