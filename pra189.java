class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class LibrarySystem{
    String name;
    int age;
    LibrarySystem(String name,int age)throws InvalidAgeException{

    }
    public void setAge(int age)throws InvalidAgeException{
        if(age < 12){
            throw new InvalidAgeException("Age must be 12 years old");
        }
        this.age = age;
        System.out.println("Age is valid !");
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class pra189 {
    public static void main(String[]args){
        //main
    }
}
