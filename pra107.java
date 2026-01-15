class Animal {
    private String name ;
    Animal(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("Cat meaw");
    }
}
public class pra107 {
    public static void main(String[] args){
        //main
        Animal a1 = new Dog("Dog");
        Animal a2 = new Cat("Cat");
        a1.makeSound();
        a2.makeSound();
    }
}
