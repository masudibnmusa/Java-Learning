import java.util.Scanner;
class MyException  extends Exception{
    public MyException(String message){
        super(message);
    }
}

abstract class Person {
    protected String name;
    protected int age ;
    protected String address;
    Person(String name,int age,String address) throws MyException {
        setName(name);
        setAge(age);
        setAddress(address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws MyException {
        if (age<18){
            throw new MyException("Age cant be negative");
        }
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    abstract void display();
}
class Teacher extends Person{
    Teacher(String name ,int age,String address)throws MyException{
        super(name, age, address);
    }
    @Override
    void display(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Address : "+getAddress());
    }
}
class Student extends Person{
    Student(String name,int age,String address) throws MyException {
        super(name, age, address);
    }
    @Override
    void display(){
        System.out.println("Name is : "+getName());
        System.out.println("Age is : "+getAge());
        System.out.println("Address is : "+getAddress());
    }
}

public class pra175 {
    public static void main(String[]args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        if(age<18){
            throw new MyException("why so hurry!");
        }else{
            System.out.println("Welcome to the jungle bro !");
        }
        Person p1 = new Student("Masud",21,"Katiadi");
        Person p2 = new Student("Mahin",21,"Katiadi");
        Person p3 = new Teacher("Masud",23,"Dhaka");
        Person p4 = new Teacher("Masud",23,"Dhaka");

        p1.display();
        System.out.println();
        p2.display();
        System.out.println();
        p3.display();
        
        System.out.println();
        p4.display();
        System.out.println();
        sc.close();
    }
}
