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
        System.out.println("Id    : "+id);
        System.out.println("Name  : "+name);
        System.out.println("Email : "+email);
    }
}
class Student extends User{
    private Course[] enrolledCourse = new Course[5];
    private int count = 0;
    Student(int id,String name,String email){
        super(id, name, email);
    }
    public void enroll(Course course){
        if(count>=5){
            System.out.println("Maximum 5 courses");
            return;
        }
        enrolledCourse[count++] = course;
        System.out.println("Enrolled in : course code "+course.cid);
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
abstract class Course{
    protected int cid;
    protected String title;
    protected Instructor instructor;
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
        Instructor i3 = new Instructor(002, "Sajid", "sajid@gmail.com");
        Instructor i4 = new Instructor(002, "Siam", "siam@gmail.com");
        Instructor i5 = new Instructor(002, "Amjad", "amjad@gmail.com");
        Course c1 = new FreeCourse(111, "Bangla", i1);
        Course c2 = new FreeCourse(111, "English", i2);
        Course c3 = new PaidCourse(333, "Physics", i3, 1200.00);
        Course c4 = new PaidCourse(444, "Math", i4, 1200.00);
        Course c5 = new PaidCourse(555, "Chemistry", i5, 1200.00);
        
        c1.displayCourseInfo();
        System.out.println();
        i1.displayInfo();
        System.out.println();
        c2.displayCourseInfo();
        System.out.println();
        i2.displayInfo();
        System.out.println();
        c3.displayCourseInfo();
        System.out.println();
        i3.displayInfo();
        System.out.println();
        c4.displayCourseInfo();
        System.out.println();
        i4.displayInfo();
        System.out.println();
        c5.displayCourseInfo();
        System.out.println();
        i5.displayInfo();
        System.out.println();


        System.out.println("==============================");
        Student s1 = new Student(1, "Shihab", "shihab@gmail.com");
        
        System.out.println();
        s1.displayInfo();
        s1.enroll(c1);
        s1.enroll(c2);
        s1.enroll(c3);
        s1.enroll(c4);
        s1.enroll(c5);
        s1.enroll(c3);


    }
}
