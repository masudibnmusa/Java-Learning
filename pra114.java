import java.sql.Struct;

abstract class User{
    protected String name ;
    protected String role;
    User(String name , String role){
        this.name = name ;
        this.role = role;
    }
    void display(){
        System.out.println("User name : "+name);
        System.out.println("User role is : "+role);
    }
}
class Student extends User{
    int roll ;
    String department ;
    Student(int roll,String name , String role,String department){
        super(name, role);
        this.roll = roll ;
        this.department = department;
    }
    @Override
    void display(){
        System.out.println("User Role is : "+role);
        System.out.println("Student roll is : "+roll);
        System.out.println("Student name is : "+name);
        System.out.println("Student's Department is : "+department);
    }
}
class Admin extends User{
    Admin(String name, String role){
        super(name, role);
    }
    @Override
    void display() {
        super.display();
    }
}
class Course{
    int code;
    String course;
    int credit;
    Course(int code,String course,int credit){
        this.code = code;
        this.course = course;
        setCredit(credit);
    }
    public void setCredit(int credit){
        if (credit>=1 && credit <=4){
            this.credit = credit;
        }else{
            throw new IllegalArgumentException("Credit must be 1 or 4 ");
        }
    }
    public void displayCourse(){
        System.out.println("Course code is : "+code);
        System.out.println("Course Title is : "+course);
        System.out.println("Course Credit is : "+credit);
    }
}
class Registration{
    Student student;
    Admin admin;
    Course course;

    Registration(Student student,Course course,Admin admin){
        this.student = student;
        this.course = course;
        this.admin = admin;
    }
    public void display(){
        System.out.println("----Registration info----");
        System.out.println();
        User u1 = student;
        User u2 = admin;
        u1.display();
        System.out.println();
        
        Course c1 = course;
        c1.displayCourse();
        System.out.println();
        System.out.println("Regustration done by--");
        u2.display();
        
    }
}
public class pra114 {
    public static void main(String[] args) {
        Student s1 = new Student(171, "Masud", "Student", "Swe");
        Admin a1 = new Admin("Masud", "Admin");
        Course c1 = new Course(122, "Computer Architecture", 3);
        Registration r1 = new Registration(s1, c1, a1);
        r1.display();
    }
}
