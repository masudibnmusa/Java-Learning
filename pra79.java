class student{
    String name;
    int age;
    student(String name ,int age){
        this.name = name ;
        this.age = age;
    }

    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class pra79 {
    public static void main(String[] args) {
        student s1 = new student("Masud", 12);
        s1.printDetails();
    }
}
