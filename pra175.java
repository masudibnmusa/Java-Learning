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
}

public class pra175 {
    public static void main(String[] args) {
        System.out.print("Enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        if (age <18){
            try{
                throw new MyException("Not possible");
            }catch (MyException e){
                System.out.println("Exception: "+e.getMessage());
            }
        }else{
            System.out.println("THe age is :"+age);
        }
        sc.close();
    }
}
