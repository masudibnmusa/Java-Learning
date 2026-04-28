class Teacher{
    String name = "Masud";
}
class Student{
    void studey(Teacher t){
        System.out.println("Studying from "+t.name);
    }
}
public class pra186 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();

        s.studey(t);
    }
}
