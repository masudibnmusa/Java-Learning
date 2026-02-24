class User{
    private int id ;
    private String name ;
    private int age;
    User(int id,String name,int age){
        setId(id);
        setName(name);
        setAge(age);
    }
    public void setId(int id) {
        if(id<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }public void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Age cant be negative");
        }
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }public int getAge() {
        return age;
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
