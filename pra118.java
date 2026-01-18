abstrac class User{
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
        System.out.println("Student");
        System.out.println("Id    :"+id);
        System.out.println("Name  :"+name);
        System.out.println("Email :"+email);
    }
    @Override
    void accessCourse(Course course){
        course.getAccess();
        System.out.println("Course enrolled in : "+course.getTitle());
    }
}
class Instructor extends User{
    Instructor(int id,String name ,String email){
        super(id, name, email);
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
        System.out.println("Instrutor");
        System.out.println("Id    :"+id);
        System.out.println("Name  :"+name);
        System.out.println("Email :"+email);
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
class FreeCourse extends Course{
    FreeCourse(int courseId,String title,Instructor instructor){
        super(courseId,title,instructor);
    }
    @Override
    void getAccess(){
        System.out.println("Access granted to : "+title);
    }
}
class PaidCourse extends Course{
    double price ;
    PaidCourse(int courseId,String title,Instructor instructor,double price){
        super(courseId,title,instructor);
        if(price <= 0){
            System.err.println("Price cant be negative");
        }else{
            this.price = price;
        }
    }
    double getPrice(){
        return price;
    }
    @Override
    void getAccess(){
        System.out.println("Access granted after payment is : "+title);
    }

}
public class pra118 {
    public static void main(String[] args){
        Instructor instructor =
                new Instructor(1, "Masud", "masud@edu.com");

        Student student =
                new Student(101, "Mahim", "mahim@student.com");

        Course c1 = instructor.createCourse("free", 201, "Java Basics", 0);
        Course c2 = instructor.createCourse("paid", 202, "Advanced Java", 1500);

        student.enroll(c1);
        student.enroll(c2);

        System.out.println();
        student.accessCourse(c1); 
        student.accessCourse(c2); 
    }
}
