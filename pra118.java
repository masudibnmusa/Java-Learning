private class User{
    protected int id;
    protected String name;
    protected String email;
    user(int id,String name,Strign email){
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
