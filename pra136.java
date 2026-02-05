abstract class LibraryUser{
    protected int userId;
    protected String userName;
    protected String email;
    LibraryUser(int userId,String userName,String email){
        setId(userId);
        this.userName = userName;
        this.email = email;
    }
    private void setId(int userId){
        if(userId<=0){
            throw new IllegalArgumentException("User Id cant be negative");
        }
        this.userId = userId;
    }
    void displayUserInfo(){
        System.out.println("User Name : "+userId);
        System.out.println("User Name : "+userName);
        System.out.println("User Name : "+email);
    }
}
class Student extends LibraryUser{
    Student(int userId,String userName,String email){
        super(userId, userName, email);
    }
    @Override
    void displayUserInfo(){
        super.displayUserInfo();
        System.out.println("User Type : Student");
    }
}
class Teacher extends LibraryUser{
    Teacher(int userId,String userName,String email){
        super(userId, userName, email);
    }
    @Override
    void displayUserInfo(){
        super.displayUserInfo();
        System.out.println("User Type : Faculty");
    }
}
class Book{

}
class TextBook extends Book{

}
class Novel extends Book{

}
class ReferenceBook extends Book{

}
public class pra136 {
    public static void main(String[] args) {
        //main
    }
}
