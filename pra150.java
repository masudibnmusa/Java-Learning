class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    void displayPerson(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getName());
    }
}
public class pra150 {
    public static void main(String[]args){
        Person p1 = new Person();
        p1.setName("Masud");
        p1.setAge(21);
        p1.displayPerson();
        //main
    }
}
