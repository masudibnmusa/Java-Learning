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
        System.out.println("Student");
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
        System.out.println("Instructor");
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
        System.out.println("Course Instructor : "+instructor);
    }
}
class 
public class pra119 {
    public static void main(String[] args){
        //main
    }
}
