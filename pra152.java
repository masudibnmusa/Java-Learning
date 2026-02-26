class User{
    int id;
    String name;
    String phone;
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
}
public class pra152 {
    public static void main(String [] args){
        //main
        
    }
}
