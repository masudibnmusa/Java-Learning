private class User{
    protected int id;
    protected String name;
    protected String email;
    User(int id,String name,String email){
        this.id = id;
        this.name = name ;
        this.email = email;
    }
    
    abstract void accessCourse(Course course);
    
    void displayInfo(){
        System.out.println("Id    :"+id);
        System.out.println("Name  :"+name);
        System.out.println("Email :"+email);
    }
}
class Student extends User{
    private Course[] enrolledCourse = new Course[5];
    int count = 0;
    Student(int id,String name,String email){
        super(id,name,email);
    }
    public void enroll(Course course){
        if (count>=5){
            System.out.println("Maximum 5 course");
            return;
        }
        enrolledCourse[count++] = course;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
    }
    @Override
    void accessCourse(Course course){
        course.getAccess();
        System.out.println("Course enrolled in : "+course.getTitle());
    }
}
class Instructor extends User{
    Instructor(int id,String name ,String email){
        super(id, name, name);
    }
    public Course createCourse(String type, int courseId, String title, double price) {
        if (type.equalsIgnoreCase("paid")) {
            return new PaidCourse(courseId, title, price);
        } else {
            return new FreeCourse(courseId, title);
        }
    }
    @Override
    void displayInfo(){
        super.displayInfo();
    }
    @Override
    void accessCourse(Course course){
        System.out.println("Instructor has fully access to "+course.getTitle());
    }
}
abstract class Course {
    protected int courseId;
    protected String title;
    protected Instructor instructor;

    Course(int courseId,String title,Instructor instructor){
        this.courseId = courseId;
        this.title = title ;
        this.instructor = instructor;
    }
    String getTitle(){
        return title;
    }
    abstract void getAccess();
    void displayCourseinfo(){
        System.out.println("Course Id    : "+courseId);
        System.out.println("Course Title : "+title);
        System.out.println("Instructor   : "+instructor.name);
    }
}
public class pra118 {
    public static void main(String[] args){
        //main
    }
}
