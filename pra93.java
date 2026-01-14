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

    public void setName(String name){
        this.name = name;
    }
    public void setroll(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public void setmarks(double marks){
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public int getRollnumber(){
        return rollNumber;
    }
    public double getMarks(){
        return marks;
    }

}
public class pra93 {
    public static void main(String[] args){
        //main..........
        Student s1 = new Student("Masud", 171, 67.56);
        Student s2 = new Student("Rakib", 226, 89.67);
        s1.display();
        s1.getRollnumber();
        Student s3 = new Student(null, 0, 0.0);
        s3.setName("Tayeb");
        s3.setroll(176);
        s3.setmarks(56.45);

        s2.display();       
    }  
}
