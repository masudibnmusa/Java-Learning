abstract class User{
    protected int userId;
    protected String name;
    protected String phone;
    User(int userId,String name,String phone){
        setId(userId);
        this.name = name;
        this.phone = phone;
    }
    void setId(int userId){
        if(userId<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.userId = userId;
    }
}
class Trainer extends User{
    private String userType = "Trainer";
    Trainer(int userId,String name,String phone){
        super(userId, name, phone);
        this.userType = userType;
    }
}
public class pra132 {
    public static void main(String [] args){
        //main
    }
}
