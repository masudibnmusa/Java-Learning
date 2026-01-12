class student{
    String name;
    int age;
    student(student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    student(){

    }

    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class pra {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Masud";
        s1.age = 12;
        student s2 = new student(s1);
        s1.printDetails();
        s2.printDetails();
    }
}
