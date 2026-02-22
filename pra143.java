class User{
    int id;
    String name;
    int age;
    String phone;
    User(int id,String name,int age,String phone){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
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
    void showInfo(){
        System.out.println("Id    : "+id);
        System.out.println("Name  : "+name);
        System.out.println("Age   : "+age);
        System.out.println("Phone : "+phone);
    }
}
public class pra143 {
    public static void main(String[] args){
        //main
    }
}
