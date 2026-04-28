import java.util.ArrayList;

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
    }
}
public class pra183 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student(1,"Masud");
        Student s2 = new Student(2,"Masud");
        Student s3 = new Student(2,"Masud");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (Student s : list){
            s.display();
        }
    }
}
