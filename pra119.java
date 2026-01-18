abstract class User{
    protected int id;
    protected String name;
    protected String email;
    User(int id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    abstract void accessCourse();
    void displayInfo(){
        System.out.println("User Id    : "+id);
        System.out.println("User Name  : "+name);
        System.out.println("User Email : "+email);
    }
}
class Student extends User{
    Student(int id,String name,String email){
        super(id, name, email);
    }
    @Override
    void accessCourse(){
        System.out.println("Student can access ");
    }
    @Override
    void displayInfo(){
        System.out.println("Student Info---");
        super.displayInfo();
    }
}
class Instructor extends User{
    Instructor(int id,String name,String email){
        super(id, name, email);
    }
    @Override
    void accessCourse(){
        System.out.println("Instructor has the access of ");
    }
    @Override
    void displayInfo(){
        System.out.println("Instructor Info---");
        super.displayInfo();
    }
}
class Course{
    private int cid;
    private String title;
    private Instructor instructor;
    Course(int cid,String title,Instructor instructor){
        this.cid = cid;
        this.title = title;
        this.instructor = instructor;
    }
    String getTitle(){
        return title;
    }
    void displayCourseInfo(){
        System.out.println("Course id         : "+cid);
        System.out.println("Course Title      : "+title);
        System.out.println("Course Instructor : "+instructor.name);
    }
}
class PaidCourse extends Course{
    private double price;
    PaidCourse(int cid,String title,Instructor instructor,double price){
        super(cid, title, instructor);
        if (price<0){
            throw new IllegalArgumentException("price cant be negative");
        }
        this.price = price;
    }
    double getPrice(){
        return price;
    }
    @Override
    void displayCourseInfo(){
        System.out.println("______Paid Course______");
        super.displayCourseInfo();
    }
}
class FreeCourse extends Course{
    FreeCourse(int cid,String title,Instructor instructor){
        super(cid, title, instructor);
    }
    @Override
    void displayCourseInfo(){
        System.out.println("______Free Course_______");
        super.displayCourseInfo();
    }
}
public class pra119 {
    public static void main(String[] args){
        //main
        Instructor i1 = new Instructor(001, "Masud", "masudibnmusa10@gmail.com");
        Instructor i2 = new Instructor(002, "Rakib", "rakibhasan@gmail.com");
        Course c1 = new FreeCourse(111, "Bangla", i1);
        Course c2 = new PaidCourse(222, "English", i2, 1200.00);
        
        c1.displayCourseInfo();
        System.out.println();
        i1.displayInfo();
        System.out.println();
        c2.displayCourseInfo();
        System.out.println();
        i2.displayInfo();
    }
}
