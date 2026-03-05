class Person{
    private String name ;
    private int age ;

    Person(String name, int age){
        this.name = name ;
        this.age = age;
    }
    //getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Student extends Person{
    int roll;
    Student(String name, int age,int roll){
        super(name, age);
        this.roll = roll;
    }
    public void display(){
        System.out.println("Name of the student is : "+getName());
        System.out.println("Age of the student is : "+getAge());
    }
}
class Teacher extends Person{
    String sub;
    Teacher(String name,int age,String sub){
        super(name, age);
        this.sub = sub;
    }

    public void display(){
        System.out.println("Name of the teacher is : "+getName());
        System.out.println("Age of the teacher is : "+getAge());
    }
}
public class pra102 {
    public static void main (String [] args){
        //main..
        Student s1 = new Student("Masud",18,171);
        Teacher t1 = new Teacher("Rkib",23,"English");
        s1.display();
        System.out.println("--------------------");
        t1.display();
        
    }
}
