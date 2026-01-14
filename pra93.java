class Student{
    private String name ;
    private int rollNumber;
    private double marks;

    Student(String name,int rollNumber,double marks){
        this.name = name ;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void display(){
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
    }


}
public class pra93 {
    public static void main(String[] args){
        //main..........
        Student s1 = new Student("Masud", 171, 67.56);
        s1.display();
    }  
}
