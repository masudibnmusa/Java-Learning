class User{
    private int id;
    private String name;
    private int age;
    String phone;
    User(int id,String name,int age,String phone){
        setId(id);
        setName(name);
        setAge(age);
        setPhone(phone);
    }
    public void setId(int id) {
        if(id<=0){
            throw new IllegalArgumentException("id cant be negative");
        }
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Age cant be negative");
        }
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    void showInfo(){
        System.out.println("Id    : "+getId());
        System.out.println("Name  : "+getName());
        System.out.println("Age   : "+getAge());
        System.out.println("Phone : "+getPhone());
    }
}
class Student extends User{
    Student(int id,String name,int age,String phone){
        super(id, name, age, phone);
    }
    @Override
    void showInfo(){
        System.out.println("--Student info--");
        super.showInfo();
    }
}
class Faculty extends User{
    Faculty(int id,String name,int age,String phone){
        super(id, name, age, phone);
    }
    @Override
    void showInfo(){
        System.out.println("--Faculty Info--");
        super.showInfo();
    }
}
class Admin extends User{
    Admin(int id,String name,int age,String phone){
        super(id, name, age, phone);
    }
    @Override
    void showInfo(){
        System.out.println("--Admin Info--");
        super.showInfo();
    }
}
public class pra143 {
    public static void main(String[] args){
        //main
        User u1 = new Student(1, "Masud", 21, "01345678"); 
        User u2 = new Faculty(2, "Mahim" ,21, "01234567"); 
        User u3 = new Admin(3, "Fahim", 21, "01234567"); 

        u1.showInfo();
        System.out.println();
        u2.showInfo();
        System.out.println();
        u3.showInfo();
        System.out.println();
    }
}
