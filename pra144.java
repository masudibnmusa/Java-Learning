class User{
    int id ;
    String name ;
    int age;
    User(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void showInfo(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
public class pra144 {
    public static void main(String[] args){
        User u1 = new User(101, "Masud", 21);
        u1.showInfo();
        //main
    }
}
