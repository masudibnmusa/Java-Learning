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
    abstract void displayInfo();
}
class Trainer extends User{
    private String userType = "Trainer";
    Trainer(int userId,String name,String phone){
        super(userId, name, phone);
        this.userType = userType;
    }
    @Override
    void displayInfo(){
        System.out.println("User Id    : "+userId);
        System.out.println("User Name  : "+name);
        System.out.println("User Phone : "+name);
        System.out.println("User Type  : "+userType);
    }
}
class Member extends User{
    private String userType = "Member";
    Member(int userId,String name,String phone){
        super(userId, name, phone);
        this.userType = userType;
    }
    @Override
    void displayInfo(){
        System.out.println("User Id    : "+userId);
        System.out.println("User Name  : "+name);
        System.out.println("User Phone : "+name);
        System.out.println("User Type  : "+userType);
    }
}
public class pra132 {
    public static void main(String [] args){
        //main
    }
}
