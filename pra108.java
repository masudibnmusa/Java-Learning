class User{
    private String username;
    private int password;
    User(String username, int password){
        this.username = username;
        this.password = password;
    }
    public void setUsername(String username){
        if (username.equals(null)){
            System.out.println("Username cant be");
        }else{
            this.username = username ;
        }
    }
    public void setPassword(int password){
        if (String.valueOf(password).length()>=6){
            System.out.println("Password must be in 6 digit ");
        }else{
            this.password = password;
        }
    }
    public void accesslevel(){
        System.out.println("Welcome User");
    }

}
class Admin extends User{
    Admin(String name, int password){
        super(name, password);
    }
    public void accesslevel(){
        System.out.println("Welcome Amin");
    }

}
class Customer extends User{
    Customer(String username,int password){
        super(username, password);
    }
    public void accesslevel(){
        System.out.println("Welcome Customer");
    }
}
public class pra108 {
    public static void main(String[] args) {
        //main...
        User u1 = new Admin(null, 0);
        User u2 = new Customer(null, 0);
        u1.setPassword(1234567);
        
        u1.setUsername("Masud");
        u1.setPassword(12345);
        u1.accesslevel();
        System.out.println("=============");
        u2.setUsername("Teyab");
        u2.setPassword(1234);
        u2.accesslevel();
    }
}
