class User{
    int id;
    String userName;
    User(int id,String userName){
        setId(id);
        setUserName(userName);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        if(userName == null || !userName.equals(userName.toLowerCase())){
            throw new IllegalArgumentException("Username must be in lowercase");
        }
        this.userName = userName;
    }
}
public class pra171 {
    public static void main(String[]args){
    }
}
