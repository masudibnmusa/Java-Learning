class User{
    private String username;
    private int password;
    User(String username, int password){
        this.username = username;
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public int getPassword(){
        return password;
    }
    public void setUsername(String username){
        if (username==null){
            System.out.println("Username cant be empty");
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
    public void accesslevel(int givenPassword){
        if (givenPassword == password){
            System.out.println("Welcome User");
        }else{
            System.out.println("Wrong password");
        }
        
    }

}
class Admin extends User{
    Admin(String name, int password){
        super(name, password);
    }
    public void accesslevel(int givenPassword){
        if (givenPassword == getPassword()){
            System.out.println("Welcome Admin");
        }else{
            System.out.println("Wrong password");
        }      
    }
}
class Customer extends User{
    Customer(String username,int password){
        super(username, password);
    }
    public void accesslevel(int givenPassword){
        if (givenPassword == getPassword()){
            System.out.println("Welcome Customer");
            System.out.println(getUsername());
        }else{
            System.out.println("Wrong password");
        }    
    }
    
}
public class pra108 {
    public static void main(String[] args) {
        //main...
        User u1 = new Admin(null, 0);
        User u2 = new Customer(null, 0);
        u1.setPassword(12345);
        
        u1.setUsername("Masud");
        u1.setPassword(12345);
        u1.accesslevel(12345);
        System.out.println("=============");
        u2.setUsername("Shihab");
        u2.setPassword(1234);
        u2.accesslevel(1234);
    }
}