interface Flyable{
    void fly();
} 
interface Walkable {
    void walk();
}
abstract class Animal{
    public abstract void makeSound();
}
class Bird extends Animal implements Flyable{
    @Override
    public void makeSound(){
        System.out.println("Bird makes sound....");
    }
    @Override
    public void fly(){
        System.out.println("Bird fly ....");
    }
}
class Dog extends Animal implements Walkable{
    @Override 
    public void walk(){
        System.out.println("Dogs walks....");
    }
    @Override 
    public void makeSound(){
        System.out.println("Dosga makes sound....");
    }
}
public class pra154 {
    public static void main(String[]args){
        //main
    }
}
