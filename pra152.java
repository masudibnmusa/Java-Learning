class User{
    private int id;
    private String name;
    private String phone;
    User(int id,String name,String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    public void setId(int id) {
        if(id<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    void displayUserInfo(){
        System.out.println("User id : "+getId());
        System.out.println("User Name : "+getName());
        System.out.println("User Phone number :"+getPhone());
    }
}
public class pra152 {
    public static void main(String [] args){
        //main
        User u1 = new User(101, "null", "null");
        u1.displayUserInfo();
    }
}
